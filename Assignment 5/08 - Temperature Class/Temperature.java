public class Temperature {

    // Field to store the degrees in fahrenheit
    private double fahrenheit;

    /**
     * Constructor that initializes the temperature
     * 
     * @param fahrenheit
     */
    public Temperature(double fahrenheit) {

        this.fahrenheit = fahrenheit;

    }

    /**
     * Setter method that sets the temperature
     * 
     * @param fahrenheit
     */
    public void setFahrenheit(double fahrenheit) {

        this.fahrenheit = fahrenheit;

    }

    /**
     * Getter method that returns the temperature
     */
    public double getFahrenheit() {

        return fahrenheit;

    }

    /**
     * Retunrs the conversion of fahrenheit to celsius
     * 
     * @return
     */
    public double fahrenheitToCelsius() {

        return (5.0 / 9) * (fahrenheit - 32);

    }

    /**
     * Retunrs the conversion of fahrenheit to Kelvin
     * 
     * @return
     */
    public double fahrenheitToKelvin() {

        return ((5.0 / 9) * (fahrenheit - 32)) + 273;

    }
}