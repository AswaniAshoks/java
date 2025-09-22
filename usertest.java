abstract class user{
   abstract void showMessage();
 public  void displayUserType() {
      System.out.println("User type selected");
   }
}

class AdminUser extends user{
   public void showMessage() {
      System.out.println("Welcome, Admin!");
   }
}

class GuestUser extends user{
   public void showMessage() {
      System.out.println("Welcome, Guest!");
   }
}
   
public class usertest {
    
    public static void main(String[] args) {
      AdminUser a= new AdminUser();
      a.showMessage();
      a.displayUserType();
      GuestUser g= new GuestUser();
     g.showMessage();
     g.displayUserType();
   }
}

