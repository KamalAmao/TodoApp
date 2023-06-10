import java.io.BufferedWriter;
import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.*;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.FileWriter;
public class JavaWriteToFile { // write to file using BufferedWriter
    public static void main(String[]args){
        //1.  write to file using BufferedWriter

        Path filePath = Paths.get("demo.txt");
        Charset charset = StandardCharsets.UTF_8;

        // Instantiate a BufferedWriter
        try(BufferedWriter writer = Files.newBufferedWriter(filePath, charset)){ // if i do it the common try.. catch way it wont work
            writer.write("Hello world");
            writer.newLine();
            writer.write("Learn how to write data to a file efficiently using BufferWriter");
            writer.newLine();
        }catch(IOException ex){
            System.out.format("I/O error: %s%n", ex);
        }

        // Path filePath1 = Paths.get("demo1.txt");
        // Charset charset1 = StandardCharsets.UTF_8;

        // try(BufferedWriter writer1 = Files.newBufferedWriter(filePath1, charset1)){
        //     writer1.write("Welcome here");
        //     writer1.newLine();
        //     writer1.write("Feel at home");
        //     writer1.newLine();
        //     System.out.println("Succesfully wrote to file");
        // }catch(IOException e){
        //     System.out.format("I/O erroe", e);
        // }


        //2. write to file using PrintWriter.
        // Path filePath = Paths.get("demo2.txt");
        // Charset charset = StandardCharsets.UTF_8;

        // // Instantiate a new FileWriter by wrapping a buffered writer for improved perfomance
        // try(BufferedWriter bufferedWriter = Files.newBufferedWriter(filePath, charset)){
        //     PrintWriter printWriter = new PrintWriter(bufferedWriter);
        //     printWriter.println("Hello world!");
        //     printWriter.printf("The value of PI is %d", Math.PI);
        //     printWriter.print(123456L);
        //     printWriter.print(true);
        // }catch(IOException e){
        //     System.out.format("I/O error: %s%n", e);
        // }

        //3.  write to file using FileWriter
        // try(FileWriter fileWriter = new FileWriter("demo2.txt")){
        //     fileWriter.write("How are you \n");
        //     fileWriter.write("welcome here");
        // }catch(IOException e){
        //     System.out.format("I/O error occurred: %s%n", e);
        // }

        //4.  write to file using BufferedOutputStream
        // String data = "This example shows how to write data to a file using BufferedOutputStream";

        //  //Create a BufferedOutputStream by wrapping a FileOutputStream
        // try(OutputStream outputStream = Files.newOutputStream(Paths.get("demo2.txt"));
        //     BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream)){

        //      //Write binary data to a file
        //         bufferedOutputStream.write(data.getBytes());
        //     }catch (IOException e){
        //         System.out.format("I/O error: %s%n", e);
        // }   

         //5.  write to file using DataOutputStream. lets you write primitive Java data types to an output stream in a portable way.

        //  try(OutputStream outputStream = Files.newOutputStream(Paths.get("demo2.txt"));
        //     DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(outputStream))){
        //         dataOutputStream.writeUTF("Hello");
        //         dataOutputStream.writeLong(Long.MAX_VALUE);
        //         dataOutputStream.writeDouble(3.142);
        //         dataOutputStream.writeBoolean(true);
        //     }catch(IOException e){
        //         System.out.format("I/O error occurred: %s%n", e);
        //     }
        
            //5.  write to file using RandomAccessFile.  lets you write data at a specific position in a file.

            // try(RandomAccessFile randomAccessFile = new RandomAccessFile("demo2.txt", "rw")){
            //     randomAccessFile.seek(10);
            //     randomAccessFile.writeChar('-');
            //     randomAccessFile.writeInt(123456);
            //     randomAccessFile.writeChar('-');
            // }catch(IOException e){
            //     System.out.format("I/O error occurred: %s%n", e);
            // }      

            //5.  write to file using RandomAccessFile.

        String data = "Hi, how are you";
        Path path = Paths.get("demo.txt");
        try{
            Files.write(path, data.getBytes());
        }catch(IOException e){
            System.out.format("I/O error: %s%n", e);
        }
       
    }
}
