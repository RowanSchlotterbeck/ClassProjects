import java.util.Scanner;

public class CompoundInterest {
      public static void main(String[] args) {

            // Get Principal Amount from user
            Scanner princpleAmtQuery = new Scanner(System.in);
            System.out.print("Enter principal amount: $");
            double princpleAmt = princpleAmtQuery.nextDouble();

            // Get Interest Rate from user
            Scanner interestRateQuery = new Scanner(System.in);
            System.out.print("Enter Interest Rate: ");
            double interestRate = interestRateQuery.nextDouble();

            // Get compound frequency from user
            Scanner compoundFrequencyQuery = new Scanner(System.in);
            System.out.print("Enter the number of times per year that the interest is compounded: ");
            double compoundFrequency = compoundFrequencyQuery.nextDouble();

            // How many years does the user want their money to appreciate?
            Scanner yearsQuery = new Scanner(System.in);
            System.out.print("Years: ");
            int years = yearsQuery.nextInt();

            // Implement Interest Rate Logic
            double money_Accumulated = (princpleAmt
                        * Math.pow(((1 + ((interestRate * .01) / compoundFrequency))), (years * compoundFrequency)));

            // Print to the console
            System.out.println("Principal: $" + princpleAmt);
            System.out.println("Interest Rate: " + interestRate);
            System.out.println("Compound Frequency: " + compoundFrequency);
            System.out.println("Years: " + years);
            System.out.println(
                        "There will be $" + Math.round(money_Accumulated - .99) + " after " + years
                                    + " years at an interest rate of "
                                    + interestRate + "%");

      }
}