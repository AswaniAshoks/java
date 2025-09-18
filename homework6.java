public class homework6 {
   public static void main(String[] args) {
        
        int[] marks = {78, 82, 91, 65, 34}; 

        int total = 0;
        

        
        for (int mark : marks) {
            if (mark < 35) {
                  System.out.println(" Result=Fail");
                  break;
            }
            total += mark;
        }

        int average =total/marks.length;
          System.out.println("Total Marks: " + total);
            System.out.println("Average Marks: " + average);

            if (average >= 90) {
                System.out.println("Grade: A");
            } else if (average >= 75) {
                System.out.println("Grade: B");
            } else if (average >= 60) {
                System.out.println("Grade: C");
            } else {
                System.out.println("Grade: D");
            }
        }
    }



