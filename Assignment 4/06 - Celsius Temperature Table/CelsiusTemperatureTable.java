public class CelsiusTemperatureTable {

    public static void main(String[] args) {

        // For loop that iterates through a list of 20
        for (int i = 0; i <= 20; i++) {

            // Calls function value to the variable "celsius"
            double celsius = celsiusToTemperature(i);
            System.out.println(
                    "The tempature in celcius at " + i + " degrees fahrenheit is " + celsius + " degrees celcius");

        }

    }

    // Method that computes the celsius calculation
    public static double celsiusToTemperature(int f) {

        return (double) 5 / 9 * (f - 32);

    }
}
