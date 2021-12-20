package spdvi.dataaccess;

import com.azure.storage.blob.BlobContainerClient;
import com.azure.storage.blob.BlobServiceClient;
import com.azure.storage.blob.BlobServiceClientBuilder;
import com.azure.storage.blob.specialized.BlockBlobClient;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import spdvi.POJOs.Place;

public class AzureBlobs implements Runnable {

    private final static String connectionString = "";
    private BlobServiceClient blobServiceClient;
    private BlobContainerClient containerClient;
    //Create a unique name for the container
    private final static String containerName = "opuslist";
    private Thread downloadThread;
    private Place place;

    public AzureBlobs(Place place) {
        blobServiceClient = new BlobServiceClientBuilder().connectionString(connectionString).buildClient();
        containerClient = blobServiceClient.getBlobContainerClient(containerName);
        this.place = place;
    }

    @Override
    public void run() {
        ByteArrayOutputStream outputStream;
        BufferedImage originalImage;
//        try {
//            BlockBlobClient blobClient = containerClient.getBlobClient(place).getBlockBlobClient();
//            int dataSize = (int) blobClient.getProperties().getBlobSize();
//            outputStream = new ByteArrayOutputStream(dataSize);
//            blobClient.downloadStream(outputStream);  // Thread Blocking
//            originalImage = ImageIO.read(new ByteArrayInputStream(outputStream.toByteArray()));
//            outputStream.close();
//        } catch (IOException ioe) {
//            ioe.printStackTrace();
//        }
    }

}
