import java.util.Scanner;

public class TemperatureDemo {
   public static void main(String[] args) {

      // Collect User input
      Scanner js = new Scanner(System.in);
      System.out.print("Enter the temperature in fahrenheit: ");
      double f = js.nextDouble();

      // Create new temperature object
      Temperature temperature = new Temperature(f);

      // Prints conversions to the console
      System.out.println("The tempature in celsius is: " + temperature.fahrenheitToCelsius());
      System.out.println("The tempature in kelvin is: " + temperature.fahrenheitToKelvin());

   }
}