import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;

public class Filehandling {
    public static void main(String[] args) {
        String fileName = "assignment.txt";
        String content = "Java File Handling Practice";
        File file = new File(fileName);

        try {
            if (file.createNewFile()) {
                System.out.println(fileName + "' created successfully.");
            } else {
                System.out.println( fileName + "' already exists.");
            }
        } catch (Exception e) {
            System.out.println(" Error creating the file: " + e.getMessage());
            return;
        }
        try {
            FileWriter writer = new FileWriter(file);
            writer.write(content);
            writer.close();
            System.out.println("Content written to the file.");
        } catch (Exception e) {
            System.out.println(" Error writing to the file: " + e.getMessage());
            return;
        }
        try {
            FileReader reader = new FileReader(file);
            int ch;
            System.out.print(" File content: ");
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
            reader.close();
            System.out.println("File read successfully.");
        } catch (Exception e) {
            System.out.println("Error reading the file: " + e.getMessage());
            return;
        }
        if (file.delete()) {
            System.out.println( fileName + "' deleted successfully.");
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}
