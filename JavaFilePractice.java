import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.BufferedOutputStream;
import java.io.BufferedInputStream;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.io.*;
import java.nio.file.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
public class JavaFilePractice {
    public static void main(String[]args){ 
        // Path filePath = Paths.get("demo.txt");
        // Charset charset = StandardCharsets.UTF_8;
        // try(BufferedReader bufferedReader = Files.newBufferedReader(filePath, charset)){
        //     String line;
        //     while((line = bufferedReader.readLine()) != null){
        //         System.out.println(line);
        //     }
        // }catch(IOException e){
        //     System.out.format("I/O error: ", e);
        // }

        // Path filePath = Paths.get("demo.txt");
        // Charset charset = StandardCharsets.UTF_8;
        // try{
        //     Files.lines(filePath, charset)
        //         .forEach(System.out::println);
        // }catch(IOException e){
        //     System.out.format("I/O error: $s%n", e);
        // }

        // Path filePath = Paths.get("demo.txt");
        // Charset charset = StandardCharsets.UTF_8;
        // try{
        //     List<String> lines = Files.readAllLines(filePath, charset);
        //     for(String line : lines){
        //         System.out.println(line);
        //     }
        // }catch(IOException e){
        //     System.out.format("I/O error $s$n: ", e);
        // }


                //create
        // Path filePath = Paths.get("javafile.txt");
        // try{
        //     Files.createFile(filePath);
        //     System.out.println("File create successfully");
        // }catch(FileAlreadyExistsException e){
        //     System.out.format("File already exists", e);
        // }catch(IOException e){
        //     System.out.format("I/O error ocurred", e);
        // }catch(SecurityException e){
        //     System.out.format("No permission to create file", e);
        // }

        // Path filePath = Paths.get("javaclas/javafiles.txt");
        // try{
        //     if(filePath.getParent() != null){
        //         Files.createDirectories(filePath.getParent());
        //     }
        //     Files.createFile(filePath);
        //     System.out.println("File created successfully");
        // }catch(FileAlreadyExistsException e){
        //     System.out.format("File already exists", e.getMessage());
        // }catch(IOException e){
        //     System.out.format("I/O error occurred",e.getMessage());
        // }catch(SecurityException e){
        //     System.out.format("No permission to create file", e.getMessage());
        // }


            //write
        // Path filePath = Paths.get("javafile.txt");
        // Charset charset = StandardCharsets.UTF_8;
        // try( BufferedWriter writer = Files.newBufferedWriter(filePath, charset)){
        //     writer.write("Hello! you are welcome");
        //     writer.newLine();
        //     writer.write("Feel at home");
        //     writer.newLine();
        // }catch(IOException e){
        //     System.out.format("I/O error occurred");
        // }

        // Path filePath = Paths.get("javafile.txt");
        // Charset charset = StandardCharsets.UTF_8;
        // try(BufferedWriter bufferedWriter = Files.newBufferedWriter(filePath, charset)){
        //     PrintWriter printWriter = new PrintWriter(bufferedWriter);
        //     printWriter.println("Hello");
        //     printWriter.printf("Welcome");
        //     printWriter.print(123456L);
        //     printWriter.print(true);
        // }catch(IOException e){
        //     System.out.format("I/O error occurred", e);
        // }

        // String data = "Betty butter bought some butter";
        // try(OutputStream outputStream = Files.newOutputStream(Paths.get("javafile.txt"));
        //     BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream)){
        //         bufferedOutputStream.write(data.getBytes());
        // }catch(IOException e){
        //     System.out.format("I/O error occurred", e);
        // }

        // try(FileWriter fileWriter = new FileWriter("javafile.txt")){
        //     fileWriter.write("The best and the most beautiful thing in the world");
        // }catch(IOException e){
        //     System.out.format("I/O error", e);
        // }

        // String data = "Betty butter bought some butter";
        // try(FileOutputStream outputStream = new FileOutputStream("javafile.txt")){
        //     outputStream.write(data.getBytes());
        // }catch(IOException e){
        //     System.out.format("I/O error occurred");
        // }

        // try(OutputStream outputStream = Files.newOutputStream(Paths.get("javafile.txt"));
        //     DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(outputStream))){
        //         dataOutputStream.writeUTF("The best and the most beautiful thing");
        //         dataOutputStream.writeLong(Long.MAX_VALUE);//question
        //         dataOutputStream.writeDouble(3.142);
        //         dataOutputStream.writeBoolean(false); 
        // }catch(IOException e){
        //     System.out.format("I/O error occurred", e);
        // }

        // try(RandomAccessFile randomAccessFile = new RandomAccessFile("javafile.txt", "rw")){
        //     randomAccessFile.seek(10);
        //     randomAccessFile.writeChar('-'); //question
        //     randomAccessFile.writeInt(12354);
        // }catch(IOException e){
        //     System.out.format("I/O error", e);
        // }
       
        // String data = "Java is a high level language";
        // try{
        //     Path filePath = Paths.get("javafile.txt");
        //     Files.write(filePath, data.getBytes());
        // }catch(IOException e){
        //     System.out.format("I/O error occurred", e);
        // }

        // String data = "hello there. \n" + 
        //     "how are you";
        // try(RandomAccessFile randomAccessFile = new RandomAccessFile("javafile.txt", "rw");
        //     FileChannel fileChannel = randomAccessFile.getChannel()){
        //         byte[] byteData = data.getBytes();
        //         ByteBuffer buffer = ByteBuffer.allocate(byteData.length);
        //         buffer.put(byteData);
        //         buffer.flip();
        //         fileChannel.write(buffer);
        // }catch(IOException e){
        //     System.out.format("I/O error ", e);
        // }

                //read
        // Path filePath = Paths.get("javafile.txt");
        // Charset charset = StandardCharsets.UTF_8;

        // try(BufferedReader bufferedReader = Files.newBufferedReader(filePath, charset)){
        //     String line; 
        //     while((line = bufferedReader.readLine()) != null){
        //         System.out.println(line);
        //     }
        // }catch(IOException e){
        //     System.out.format("I/O error", e);
        // }

        // Path filePath = Paths.get("javafile.txt");
        // Charset charset = StandardCharsets.UTF_8;
        // try{
        //     List<String> lines = Files.readAllLines(filePath, charset);
        //     for(String line: lines){
        //         System.out.println(line);
        //     }
        // }catch(IOException e){
        //     System.out.format("I/O error ", e);
        // }

        // Path filePath = Paths.get("javafile.txt");
        // Charset charset = StandardCharsets.UTF_8;
        // try{
        //     Files.lines(filePath, charset)
        //     .forEach(System.out::println);
        // }catch(IOException e){
        //     System.out.format("I/O error ", e);
        // }

        // try(InputStream inputStream = Files.newInputStream(Paths.get("javafile.txt"));
        //     BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);

        //     OutputStream outputStream = Files.newOutputStream(Paths.get("javafiles-copy.txt"));
        //     BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream)){
        //         byte[] buffer = new byte[4096];
        //         int numBytes;
        //         while((numBytes = bufferedInputStream.read(buffer)) != -1){
        //             bufferedOutputStream.write(buffer, 0, numBytes); //question 
        //         }
        //     }catch(IOException e){
        //         System.out.format("I/O error", e);
        //     }
        

            // copy file
        // Path sourcePath = Paths.get("javafile.txt");
        // Path targetSourcePath = Paths.get(System.getProperty("javaclass")+"javafiles-copy1.txt");
        // try{
        //     Files.copy(sourcePath, targetSourcePath);
        // }catch(FileAlreadyExistsException e){
        //     System.out.format("File Already exists", e);
        // }catch(IOException e){
        //     System.out.format("I/O error", e);
        // }
        Path filePath = Paths.get("javaclas");
        try{
            Files.delete(filePath);
            System.out.println("File or directory deleted successfully ");
        }catch(NoSuchFileException e){
            System.out.printf("No such file or directory\n", filePath);
        }catch(DirectoryNotEmptyException e){
            System.out.printf("Directory is not empty\n", filePath); 
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
