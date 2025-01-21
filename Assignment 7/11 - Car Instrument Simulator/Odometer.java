public class Odometer {
    // Creates necessary fields
    private int currentMileage;
    private FuelGauge fuelGauge;

    /* Constuctor that initlizes values */
    public Odometer(int mileage, FuelGauge fuel) {
        currentMileage = mileage;
        fuelGauge = fuel;
    }

    /* Method that gets the current mileage */
    public int getCurrentMileage() {
        return currentMileage;
    }

    /* Method that increments the mileage and also decrements the fuel */
    public void incrementMileage() {
        if (fuelGauge.getCurrentFuelAmt() > 0) {
            currentMileage++;
            if (currentMileage > 999999) {
                currentMileage = 0;
            }

            if (currentMileage % 24 == 0) {
                fuelGauge.decrementFuel();
            }
        } else {
            System.out.println("Car is out of fuel");
        }

    }

}
