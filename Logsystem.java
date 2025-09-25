import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;

public class Logsystem{
    public static void main(String[] args) {
        String fileName = "log.txt";
        String message = "Book order placed at 10:30 AM"; 

        File file = new File(fileName);

        try {
            if (file.createNewFile()) {
                System.out.println( fileName + "' created successfully.");
            } else {
                System.out.println( fileName + "' already exists.");
            }
        } catch (Exception e) {
            System.out.println(" Failed to create the file: " + e.getMessage());
            return;
        }

        try {
            FileWriter writer = new FileWriter(file);
            writer.write(message);
            writer.close();
            System.out.println("Message written to the file.");
        } catch (Exception e) {
            System.out.println(" Failed to write to the file: " + e.getMessage());
            return;
        }
        try {
            FileReader reader = new FileReader(file);
            int ch;
   
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
            reader.close();
            System.out.println(" File read successfully.");
        } catch (Exception e) {
            System.out.println(" Failed to read the file: " + e.getMessage());
            return;
        }

        
        if (file.delete()) {
            System.out.println(  fileName + "' deleted successfully.");
        } else {
            System.out.println(" Failed to delete the file.");
        }
    }
}

