public class CarInstrumentSimulator {
   public static void main(String[] args) {
      // Initialize objects
      FuelGauge fuelGauge = new FuelGauge(0);
      Odometer odometer = new Odometer(0, fuelGauge);

      // For loop that simulates filling a car up to 15 gallons
      for (int i = 0; i < 15; i++) {
         fuelGauge.incrementFuel();
         System.out.println(
               "Fuel Level: " + fuelGauge.getCurrentFuelAmt() + " gallons, Mileage: " + odometer.getCurrentMileage());
      }

      // While loop that terminates when the car is out of gas
      while (fuelGauge.getCurrentFuelAmt() > 0) {
         odometer.incrementMileage();
         System.out.println("Mileage: " + odometer.getCurrentMileage() + " miles, Fuel Level: "
               + fuelGauge.getCurrentFuelAmt() + " gallons");

      }

      System.out.println("The car is out of fuel");
   }
}