import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Filehandling {
    public static void main(String[] args) {
        String fileName = "assignment.txt";
        Path path = Paths.get(fileName);
        String content = "Java File Handling Practice";


        try {
            Files.write(path, content.getBytes());
            System.out.println(" File '" + fileName + "' created and content written successfully.");
        } catch (Exception e) {
            System.out.println(" Error writing to the file: " + e.getMessage());
            return;
        }


        try {
            String readContent = Files.readString(path);
            System.out.println(" Reading content from '" + fileName + "':");
            System.out.println(readContent);
            System.out.println(" File read successfully.");
        } catch (Exception e) {
            System.out.println(" Error reading the file: " + e.getMessage());
            return;
        }

        
        try {
            Files.delete(path);
            System.out.println(  fileName + "' deleted successfully.");
        } catch (Exception e) {
            System.out.println(" Failed to delete the file: " + e.getMessage());
        }
    }
}
