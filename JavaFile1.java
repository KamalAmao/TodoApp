import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;
import java.io.IOException;

public class JavaFile1 { // Using Java NIO - JDK 6+
    public static void main(String[]args){
        // // Create File
        // try{
        //     File myFile = new File("filename.txt");
        //     //File myFile = new File("C:\\javaclass\\filenames.txt"); 
        //     if(myFile.createNewFile()){
        //         System.out.println("File created successfuly" +myFile.getName());
        //     }else{
        //         System.out.println("File already exists");    
        //     }
        // }catch(IOException e){
        //     System.out.println("An error has occured");
        //     e.printStackTrace();
        // }

        // Write to file
        // try{
        //     FileWriter myWriter = new FileWriter("filename.txt");
        //     myWriter.write("Files in Java might be tricky, but it is fun enough!");
        //     myWriter.close();
        //     System.out.println("Successfully wrote to the file.");
        // }catch(IOException e){
        //     System.out.println("An error occurred.");
        //     e.printStackTrace();
        // }
        
        // Read file
        // try{
        //     File myFile = new File("filename.txt");
        //     Scanner myReader = new Scanner(myFile);
        //     while (myReader.hasNextLine()){
        //         String data = myReader.nextLine();
        //         System.out.println(data);
        //     }
        //     myReader.close();
        // }catch(FileNotFoundException e){
        //     System.out.println("An error has occured");
        //     e.printStackTrace();
        // }

        // Get file info
        // File myFile = new File("filename.txt");
        //     if(myFile.exists()){
        //         System.out.println("File name: " + myFile.getName());
        //         System.out.println("Absolute path: " + myFile.getAbsolutePath());
        //         System.out.println("Writeable: " + myFile.canWrite());
        //         System.out.println("Readable " + myFile.canRead());
        //         System.out.println("File size in bytes " + myFile.length());
        //     } else {
        //         System.out.println("The file does not exist.");
    
  
        // }

        // Delete file
        // File myFile = new File("filename.txt");
        //     if(myFile.delete()){
        //         System.out.println("Deleted the file: " + myFile.getName());
        //     } else {
        //       System.out.println("Failed to delete the file.");
        //     } 

        // try{
        //     FileWriter file = new FileWriter("javafile.txt");
        //     BufferedWriter out = new BufferedWriter(file);
        //     out.write("gg" + new java.util.Date()+ "\n");
        //     out.append("fvhjj");
        //     out.close();
        // }catch(IOException e){
        //     System.out.println("hdshd" + e.getMessage());
        // }    
            
            try{
                //Path filePath  = Paths.get("javafile.txt");
                FileWriter writer = new FileWriter("javafile.txt", true);
                BufferedWriter bufferedWriter = new BufferedWriter(writer);
                bufferedWriter.write("hi");
                bufferedWriter.newLine();
                bufferedWriter.close();
                writer.close();
                System.out.println("done");
            }catch(IOException e){ 
                System.out.format("I/O error occured", e);
            }
    }
}
