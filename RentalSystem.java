interface Vehicle{
   public void start();
   public void stop();
}
interface FuelBased{
   public void Refuel();
   
}
class car implements Vehicle,FuelBased{

   public void start() {
      System.out.println("Car engine started.");
   }

   public void stop() {
      System.out.println("Car engine stopped.");
   } 
   public void Refuel() {
      System.out.println("Car is refueling at the station.");
   } 
}
class ElectricScooter implements Vehicle
{public void start() {
      System.out.println("Electric scooter powered on.");
   }

   public void stop() {
      System.out.println("Electric scooter powered off.");
   } 
}   
public class RentalSystem{
public static void main(String args[]) {
    car c = new car ();
    ElectricScooter e = new ElectricScooter ();
      c.start();
      c.stop();
       c.Refuel();
      e.start();
      e.stop();
      
   }
}
      
