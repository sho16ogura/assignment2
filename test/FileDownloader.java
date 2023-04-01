import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class FileDownloader {

    public static void downloadFile(String sourceUrl, String destinationPath) {
        try (InputStream inputStream = new URL(sourceUrl).openStream();
             FileOutputStream outputStream = new FileOutputStream(destinationPath)) {

            byte[] buffer = new byte[4096];
            int bytesRead;

            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }

            System.out.println("File downloaded successfully!");

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error downloading the file.");
        }
    }

    public static void main(String[] args) {
        String sourceUrl = "https://docs.google.com/spreadsheets/d/e/2PACX-1vRIYyjk9m3cVXSoTKnHyIRre4jb89kePb1D_2FuMUzzw6xNKKPdaOKbyyNfbivFk84SsE5fx7eof1co/pub?gid=0&single=true&output=csv";
        String destinationPath = "/workspaces/assignment2/csv/test.csv";

        downloadFile(sourceUrl, destinationPath);
    }
}