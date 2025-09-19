interface Animal{
   public void makeSound();
   public void move();
}
class bird implements Animal{

   public void makeSound() {
      System.out.println("chirp");
   }

   public void move() {
      System.out.println("Fly");
   } 
}
class Dog implements Animal{

   public void makeSound() {
      System.out.println("bark");
   }

   public void move() {
      System.out.println("run");
   } 
}
public class zoo{
public static void main(String args[]) {
     bird b = new bird ();
    Dog d = new Dog ();
      b.makeSound();
      b.move();
       d.makeSound();
      d.move();
   }
}
      