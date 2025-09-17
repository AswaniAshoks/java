public class homework5 {
    public static void main(String[] args) {

        int[][] sale = {
            {126, 158, 140},  
            {143, 123, 79},   
            {104, 102, 90},   
            {100, 48, 67},   
            {145, 136, 87}    
        };

        int product = 3;
        int day = 5;
        int[] totalSale = new int[product];

        
        for (int a = 0; a < product; a++) {
            int sum = 0;
            for (int b = 0; b < day; b++) {
                sum += sale[b][a]; 
            }
            totalSale[a] = sum;
        }

       
        for (int i = 0; i < product; i++) {
            System.out.println("Product " + (i + 1) + "Total Sale= " + totalSale[i]);

            if (totalSale[i] >= 500) {
                System.out.println("Target Achieved");
            } else if (totalSale[i] >= 300) {
                System.out.println("Average Performance");
            } else {
                System.out.println(" Needs Improvement");
            }
        }
    }
}
