import java.util.Scanner;

public class LargestAndSmallest {
   public static void main(String[] args) {
      // Open the Scanner "js" denotes keyboard input
      Scanner js = new Scanner(System.in);

      // Intizlies useful integers to min and max values (used for comparison later)
      int biggest = Integer.MIN_VALUE, smallest = Integer.MAX_VALUE;

      System.out.println("Enter a series of integers with \"-99\" denoting a stop");

      // While "-99" isn't entered, the while loops takes and evaluates the numbers in
      // the series
      while (true) {
         System.out.print("Enter a number: ");

         int number = js.nextInt();

         if (number == -99) {
            break;
         }

         if (number > biggest) {
            biggest = number;
         }

         if (number < smallest) {
            smallest = number;
         }

      }

      // Print Results to the console
      System.out.println("The largest number entered was " + biggest);
      System.out.println("The smallest number entered was " + smallest);
   }
}