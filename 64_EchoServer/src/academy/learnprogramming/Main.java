package academy.learnprogramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(5000)) {


            while (true) {


                Socket socket = serverSocket.accept();
                System.out.println("Client Connected");
                BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                PrintWriter output = new PrintWriter(socket.getOutputStream(), true);


                String echoString = input.readLine();
                if (echoString.equals("exit")) {
                    break;
                }
                output.println("Echo: " + echoString);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeToFileZipFileContents(String zipFileName, String outputFileName)
            throws java.io.IOException {

        java.nio.charset.Charset charset = java.nio.charset.Charset.forName("US-ASCII");
        java.nio.file.Path outputFilePath = java.nio.file.Paths.get(outputFileName);

        // Open zip file and create output file with try-with-resources statement

        try (
                java.util.zip.ZipFile zf = new java.util.zip.ZipFile(zipFileName);
                java.io.BufferedWriter writer = java.nio.file.Files.newBufferedWriter(outputFilePath, charset)
        ) {

            // Enumerate each entry

            for (java.util.Enumeration entries = zf.entries(); entries.hasMoreElements(); ) {

                // Get the entry name and write it to the output file

                String newLine = System.getProperty("line.separator");
                String zipEntryName = ((java.util.zip.ZipEntry) entries.nextElement()).getName() + newLine;
                writer.write(zipEntryName, 0, zipEntryName.length());
            }
        }
    }
}
