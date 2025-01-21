public class FreezeBoil {

    // Field that stores the temperature
    private double temperature;

    /**
     * Constuctor that intializes the temperature
     * 
     * @param temperature
     */
    public FreezeBoil(double temperature) {

        this.temperature = temperature;

    }

    /**
     * Setter method that sets the temperature
     * 
     * @param temperature
     */
    public void setTemperature(double temperature) {

        this.temperature = temperature;

    }

    /**
     * Getter methods that returns the temperature
     * 
     * @return
     */
    public double getTemperature() {

        return temperature;

    }

    /**
     * Method that checks weather Ethyl is freezing
     * 
     * @return True or False
     */
    public boolean isEthylFreezing() {

        if (temperature <= -173) {

            System.out.println("Ethyl will freeze at this temperature");
            return true;

        } else {

            return false;

        }

    }

    /**
     * Method that checks weather Ethyl is boiling
     * 
     * @return True or False
     */
    public boolean isEthylBoiling() {

        if (temperature >= 172) {

            System.out.println("Ethyl will boil at this temperature");
            return true;

        } else {

            return false;

        }

    }

    /**
     * Method that checks weather Oxygen is freezing
     * 
     * @return True or False
     */
    public boolean isOxygenFreezing() {

        if (temperature <= -362) {

            System.out.println("Oxygen will freeze at this temperature");
            return true;

        } else {

            return false;

        }

    }

    /**
     * Method that checks weather Oxygen is boiling
     * 
     * @return True or False
     */
    public boolean isOxygenBoiling() {

        if (temperature >= -306) {

            System.out.println("Oxygen will boil at this temperature");
            return true;

        } else {

            return false;

        }

    }

    /**
     * Method that checks weather Water is freezing
     * 
     * @return True or False
     */
    public boolean isWaterFreezing() {

        if (temperature <= 32) {

            System.out.println("Water will freeze at this temperature");
            return true;

        } else {

            return false;

        }

    }

    /**
     * Method that checks weather Water is boiling
     * 
     * @return True or False
     */
    public boolean isWaterBoiling() {

        if (temperature >= 212) {

            System.out.println("Water will boil at this temperature");
            return true;

        } else {

            return false;

        }

    }

}