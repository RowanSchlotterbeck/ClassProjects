import java.util.Scanner;

public class LandTractDemo {
   public static void main(String[] args) {
      // Establish Scanner for user input
      Scanner js = new Scanner(System.in);

      // Get values from the user
      System.out.print("Enter the length for the first tract: ");
      double l1 = js.nextDouble();

      System.out.print("Enter the width for the first tract: ");
      double w1 = js.nextDouble();

      System.out.print("Enter the length for the second tract: ");
      double l2 = js.nextDouble();

      System.out.print("Enter the width for the second tract: ");
      double w2 = js.nextDouble();

      // Establish tract objects
      LandTract tractOne = new LandTract(l1, w1);
      LandTract tractTwo = new LandTract(l2, w2);

      // Print results to the console
      System.out.println("The area of the first tract is: " + tractOne.getTractArea());
      System.out.println("The area of the second tract is: " + tractTwo.getTractArea());
      tractOne.equals(tractOne.getTractArea(), tractTwo.getTractArea());

   }
}