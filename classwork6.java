public class classwork6{
    public static void main(String[] args) 
         {
       
        int[] stock = {18, 37, 46, 24, 49}; 
        int total = 0;
        boolean outOfStock = false;
        for (int i = 0; i < stock.length; i++) {
            if (stock[i] == 0) {
                System.out.println("Out of stock");
                outOfStock = true;
                break;
            }
            total += stock[i];
        }

    
        if (!outOfStock) {
            System.out.println("Total stock: " + total);

            if (total < 50) {
                System.out.println("Low Stock");
            } else if (total <= 100) {
                System.out.println("Moderate Stock");
            } else {
                System.out.println("Good Stock");
            }
        }
    }
}

