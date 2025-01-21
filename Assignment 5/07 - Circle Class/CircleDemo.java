import java.util.Scanner;

public class CircleDemo {
   public static void main(String[] args) {

      // Collect user input
      Scanner js = new Scanner(System.in);
      System.out.print("Enter the radius of the circle: ");
      double r = js.nextDouble();

      // Create new circle object
      Circle circle1 = new Circle(r);

      // Print to the console
      System.out.println("The area of the circle is: " + circle1.area());
      System.out.println("The diameter of the circle is: " + circle1.diameter());
      System.out.println("The circumference of the circle is: " + circle1.circumference());

   }
}