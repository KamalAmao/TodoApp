import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
public class JavaReadFile {
    public static void main(String[]args){
        //1. Read file using BufferedWriter
    // Path filePath = Paths.get("demo.txt");
    // Charset charset = StandardCharsets.UTF_8;
    
    // try(BufferedReader bufferedReader = Files.newBufferedReader(filePath, charset)){
    //     String line;
    //     while((line = bufferedReader.readLine()) != null){
    //         System.out.println(line);
    //     }
    // }catch (IOException e) {
    //     System.out.format("I/O error: %s%n", e);
    // }

    //2. Read file line by line using Files.readAllLines()
    // Path filePath = Paths.get("demo.txt");
    // Charset charset = StandardCharsets.UTF_8;

    // try{
    //     List <String> lines = Files.readAllLines(filePath, charset);
    //     for(String line : lines){
    //         System.out.println(line);
    //     }
    // }catch(IOException e){
    //     System.out.format("I/O error occured: %s%n");
    // }

    //3. Read file line by line using Files.lines()
    // Path fiePath = Paths.get("demo.txt");
    // Charset charset = StandardCharsets.UTF_8;
    // try{
    //     Files.lines(fiePath, charset)
    //         .forEach(System.out::println);  
    // }catch(IOException e){
    //     System.out.format("I/O error occurred", e);
    // }

    // Copy file using Files.copy()
    Path sourceFilePath = Paths.get("demo.txt");
    Path targetFilePath = Paths.get(System.getProperty("user.home")+ "/Desktop/demo-copy.txt");
    try{
        Files.copy(sourceFilePath, targetFilePath);
    }catch(FileAlreadyExistsException e){
        System.out.println("File already exist");
    }catch(IOException e){
        System.out.format("I/O error: %s%n", e);
    } 

    }
}

