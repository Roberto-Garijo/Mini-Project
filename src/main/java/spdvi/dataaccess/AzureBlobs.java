package spdvi.dataaccess;

import com.azure.storage.blob.BlobContainerClient;
import com.azure.storage.blob.BlobServiceClient;
import com.azure.storage.blob.BlobServiceClientBuilder;
import com.azure.storage.blob.specialized.BlockBlobClient;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import spdvi.POJOs.Place;
import spdvi.util.ImageUtils;

public class AzureBlobs {

    Properties properties = new Properties();

    private static String connectionString;
    private BlobServiceClient blobServiceClient;
    private BlobContainerClient containerClient;
    //Create a unique name for the container
    private static String containerName = "opuslist";
    private Thread downloadThread;
    private Place place;
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
            ByteArrayOutputStream outputStream;
            BufferedImage originalImage;
            try {
                BlockBlobClient blobClient = containerClient.getBlobClient(imageUrl).getBlockBlobClient();
                int dataSize = (int) blobClient.getProperties().getBlobSize();
                outputStream = new ByteArrayOutputStream(dataSize);
                blobClient.downloadStream(outputStream);  // Thread Blocking
                originalImage = ImageIO.read(new ByteArrayInputStream(outputStream.toByteArray()));
                ImageIcon icon = imageUtils.resizeImageIcon(originalImage, label.getWidth(), label.getHeight());
                label.setIcon(icon);
                outputStream.close();
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
    }
}
