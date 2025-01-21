public class CarDemo {
   public static void main(String[] args) {

      // Create a car object
      Car car1 = new Car(2012, "Toyota");

      // Accelerate the car

      System.out.println();

      car1.accelerate();
      System.out.println("Current speed of the car: " + car1.getSpeed());

      car1.accelerate();
      System.out.println("Current speed of the car: " + car1.getSpeed());

      car1.accelerate();
      System.out.println("Current speed of the car: " + car1.getSpeed());

      car1.accelerate();
      System.out.println("Current speed of the car: " + car1.getSpeed());

      car1.accelerate();
      System.out.println("Current speed of the car: " + car1.getSpeed());

      // Put the brakes on
      car1.brake();
      System.out.println("Current speed of the car: " + car1.getSpeed());

      car1.brake();
      System.out.println("Current speed of the car: " + car1.getSpeed());

      car1.brake();
      System.out.println("Current speed of the car: " + car1.getSpeed());

      car1.brake();
      System.out.println("Current speed of the car: " + car1.getSpeed());

      car1.brake();
      System.out.println("Current speed of the car: " + car1.getSpeed());

      System.out.println();
   }
}