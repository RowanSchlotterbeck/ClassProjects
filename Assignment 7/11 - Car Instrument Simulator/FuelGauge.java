public class FuelGauge {
    // Create fields that store values
    private int currentFuelAmt;

    /* Constructor to initilize the value of the current fuel */
    FuelGauge(int fuelAmt) {
        currentFuelAmt = fuelAmt;
    }

    /* Method to get the current fuel amount */
    public int getCurrentFuelAmt() {
        return currentFuelAmt;
    }

    /* Method to increment the fuel amount */
    public int incrementFuel() {
        if (currentFuelAmt < 15) {
            currentFuelAmt++;
            return currentFuelAmt;
        } else {
            return currentFuelAmt;
        }
    }

    /* Method to decrement the fuel amount */
    public int decrementFuel() {
        if (currentFuelAmt > 0) {
            currentFuelAmt--;
            return currentFuelAmt;
        } else {
            return currentFuelAmt;
        }
    }

}