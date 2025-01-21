import java.util.Scanner;

public class GeometryCalculator {
   public static void main(String[] args) {
      // Open a scanner
      Scanner js = new Scanner(System.in);

      // Initalize choice variable
      int choice;

      // Do while loop to keep the program running as long as the user hasn't selected
      // 4
      do {
         // Get user input
         System.out.println("1. Calculate the Area of a Circle");
         System.out.println("2. Calculate the Area of a Rectangle");
         System.out.println("3. Calculate the Area of a Triangle");
         System.out.println("4. Quit");
         System.out.print("Enter your choice: ");

         choice = js.nextInt();

         // Conditionals that call computational methods and print to console
         if (choice == 1) {
            System.out.print("Enter the radius: ");
            double radius = js.nextDouble();
            System.out.println("The area of the circle is: " + Geometry.getCircleArea(radius));
         } else if (choice == 2) {
            System.out.print("Enter the length: ");
            double length = js.nextDouble();

            System.out.print("Enter the width: ");
            double width = js.nextDouble();

            System.out.println("The area of the circle is: " + Geometry.getRectangleArea(length, width));
         } else if (choice == 3) {
            System.out.print("Enter the base: ");
            double base = js.nextDouble();

            System.out.print("Enter the height: ");
            double height = js.nextDouble();

            System.out.println("The area of the circle is: " + Geometry.getTriangleArea(base, height));
         } else if (choice == 4) {

         } else {
            System.out.println("The number you entered is invalid");
         }
      } while (choice != 4);
   }
}