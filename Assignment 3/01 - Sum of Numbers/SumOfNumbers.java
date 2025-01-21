import java.util.Scanner;

public class SumOfNumbers {
   public static void main(String[] args) {
      // Open the Scanner "js" denotes keyboard input
      Scanner js = new Scanner(System.in);
      System.out.print("Enter a nonzero integer value: ");

      // Declare integers that will be used in the loop
      int n = js.nextInt(), j = 0;

      // Loops through every number that leads up to n and adds them to the integer j
      for (int i = 0; i <= n; i++) {

         j += i;

      }
      // Prints final sum to the console
      System.out.println(j);

   }
}