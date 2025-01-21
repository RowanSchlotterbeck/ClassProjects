import java.util.Scanner;

public class BodyMassIndex {
   public static void main(String[] args) {
      // Ask User for weight
      Scanner weightInput = new Scanner(System.in);

      System.out.print("Enter Weight(lbs): ");

      int weight = weightInput.nextInt();

      // Ask User for weight

      Scanner heightInput = new Scanner(System.in);

      System.out.print("Enter Height(inches): ");

      int height = heightInput.nextInt();

      // Calculate BMI

      double bodyMassIndex = ((weight) * (703 / (Math.pow(height, 2))));

      // Conditionals

      if (bodyMassIndex < 18.5) {
         System.out.println(bodyMassIndex + " is considered to be underweight");
      } else if ((18.5 <= bodyMassIndex) && (bodyMassIndex <= 25)) {
         System.out.println(bodyMassIndex + " is considered to be at an optimal weight");
      } else if (25 < bodyMassIndex) {
         System.out.println(bodyMassIndex + " is considered to be at an overweight");
      }
   }
}