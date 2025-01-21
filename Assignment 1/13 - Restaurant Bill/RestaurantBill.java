import java.util.Scanner;

public class RestaurantBill {
   public static void main(String[] args) {
      // Create new Scanner object that will inquire aobut the cost of the meal charge
      Scanner billQuery = new Scanner(System.in);
      System.out.print("Enter the charge of the meal: $");
      double billSubTotal = billQuery.nextDouble();

      // Calculate the tax, tip, and total cost of the meal using simple arthimetic
      double taxOnMeal = (billSubTotal * .0675);
      double tipOnMeal = ((billSubTotal * 1.0675) * .2);
      double totalCost = (billSubTotal + taxOnMeal + tipOnMeal);

      // Print the results of the calculations to the console
      System.out.println("Meal Charge: " + billSubTotal);
      System.out.println("Tax Amount: " + taxOnMeal);
      System.out.println("Tip Amount: " + tipOnMeal);
      System.out.println("Total Cost: " + (Math.round(totalCost * 100.00) / 100.00));

   }
}