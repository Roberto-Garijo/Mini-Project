package spdvi.dataaccess;

import com.azure.storage.blob.BlobClient;
import com.azure.storage.blob.BlobContainerClient;
import com.azure.storage.blob.BlobServiceClient;
import com.azure.storage.blob.BlobServiceClientBuilder;
import com.azure.storage.blob.models.BlobHttpHeaders;
import com.azure.storage.blob.specialized.BlockBlobClient;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import spdvi.POJOs.Place;
import spdvi.util.ImageUtils;

public class AzureBlobs extends Thread {

    Properties properties = new Properties();

    private static String connectionString;
    private BlobServiceClient blobServiceClient;
    private BlobContainerClient containerClient;
    //Create a unique name for the container
    private static String containerName = "opuslist";
    private DataAccess dataAccess = new DataAccess();
    private ImageUtils imageUtils = new ImageUtils();
    javax.swing.ImageIcon noImage = new javax.swing.ImageIcon(getClass().getResource("/icons/64px/014-image.png"));

    public AzureBlobs() {
        try {
            properties.load(AzureBlobs.class.getClassLoader().getResourceAsStream("container.properties"));
            connectionString = properties.getProperty("url");
            containerName = properties.getProperty("container");
            blobServiceClient = new BlobServiceClientBuilder().connectionString(connectionString).buildClient();
            containerClient = blobServiceClient.getBlobContainerClient(containerName);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void setFirstImage(javax.swing.JLabel label, Place place) {
        String imageUrl = dataAccess.getFirstImage(place);
        if (imageUrl.isBlank()) {
            label.setIcon(noImage);
        } else {
            ImageIcon icon = imageUtils.resizeImageIcon(downloadImage(imageUrl), label.getWidth(), label.getHeight());
            label.setIcon(icon);
        }
    }

    public BufferedImage downloadImage(String imageUrl) {
        ByteArrayOutputStream outputStream;
        BufferedImage originalImage;
        try {
            BlockBlobClient blobClient = containerClient.getBlobClient(imageUrl).getBlockBlobClient();
            int dataSize = (int) blobClient.getProperties().getBlobSize();
            outputStream = new ByteArrayOutputStream(dataSize);
            blobClient.downloadStream(outputStream);  // Thread Blocking
            originalImage = ImageIO.read(new ByteArrayInputStream(outputStream.toByteArray()));
            outputStream.close();
            return originalImage;
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return null;
    }

    public ArrayList<BufferedImage> downloadPlaceImages(Place place) {
        ArrayList<BufferedImage> images = new ArrayList<>();
        for (String url : dataAccess.getPlacePictures(place)) {
            images.add(downloadImage(url));
        }
        return images;
    }

    public boolean checkImages(String fileName) {
        return containerClient.getBlobClient(fileName).exists();
    }

    public void uploadImage(File imagePath) {
        BlobClient blobClient = containerClient.getBlobClient(imagePath.getName());
        try {
            BufferedImage bufferedImage = ImageIO.read(imagePath.getAbsoluteFile());
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ImageIO.write(bufferedImage, "jpg", baos);
            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            blobClient.upload(bais, baos.size());  // Thread blocking
            BlobHttpHeaders headers = new BlobHttpHeaders();
            headers.setContentType("image/jpeg");
            blobClient.setHttpHeaders(headers);
            baos.close();
            bais.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
