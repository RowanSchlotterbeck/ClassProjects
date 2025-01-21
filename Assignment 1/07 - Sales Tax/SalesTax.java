import java.util.Scanner; // importation of scanner class; necessary for asking user for input

public class SalesTax {
   public static void main(String[] args) {
      // Decleration of variables
      double stateTax = 0.04;
      double countyTax = 0.02;

      // Establish scanner
      Scanner myQuestion = new Scanner(System.in);

      // Prints out question
      System.out.print("Enter Amount: ");

      // User Input
      int amount = myQuestion.nextInt();

      // Perform arthiemtic and assign values
      double finalStateTax = amount * stateTax;
      double finalCountyTax = amount * countyTax;
      double finalSalesTax = finalStateTax + finalCountyTax;
      double finalSale = amount + finalSalesTax;

      // Print it all out
      System.out.println("Amount = $" + amount);
      System.out.println("State Tax = $" + finalStateTax);
      System.out.println("County Tax = $" + finalCountyTax);
      System.out.println("Total Sale = $" + finalSale);

   }
}