import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class JavaFile { // Using Java NIO - JDK 7+
   public static void main(String[]args){
     // New file path
    // Path filePath = Paths.get("./bar.txt");

    // try{
         // Create a file at the specified file path
    //     Files.createFile(filePath);
    //     System.out.println("File created successfully");
    // }catch (FileAlreadyExistsException e){
    //     System.out.println("File already exists");
    // }catch (IOException e){
    //     System.out.println("I/O error occurred: " +e.getMessage());
    // }catch (SecurityException e){
    //     System.out.println("No permission to create file: " +e.getMessage());
    // }

    // New file path
    Path filePath2 = Paths.get("java/io/bar.txt");

    try{
        // Create missing parent directories
        if(filePath2.getParent() != null){
            Files.createDirectories(filePath2.getParent());
        }
         // Create a file at the specified file path
        Files.createFile(filePath2);
        System.out.println("File created successfully");

    }catch (FileAlreadyExistsException e){
        System.out.println("File already exists");
    }catch (IOException e){
        System.out.println("An I/O exception occurred: " +e.getMessage());
    }catch (SecurityException e){
        System.out.println("No permission to create file: " +e.getMessage());
    }

   }
    
}
