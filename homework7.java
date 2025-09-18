import java.util.Scanner;
import java.time.LocalDateTime;

public class homework7 {

   
    public static float avg(int[] marks) {
        int total = 0;
        for (int m : marks) {
            total += m;
        }
        return (float) total / marks.length;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = input.nextInt();
        input.nextLine(); 

        String[] name = new String[n];
        int[] marks = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter name of student " + (i + 1) + ":");
            name[i] = input.nextLine();

            System.out.println("Enter marks of " + name[i] + ":");
            marks[i] = input.nextInt();
            input.nextLine(); 
        }

        System.out.println(" Student Report ");
        for (int i = 0; i < n; i++) {
            System.out.println("Name: " + name[i] + ", Marks: " + marks[i]);
            if (marks[i] < 35) {
                System.out.println(" Needs Improvement");
            }
            System.out.println();
        }

        System.out.println("Average Marks: " + avg(marks));
        System.out.println("Program ended on: " + LocalDateTime.now());

        input.close();
    }
}
