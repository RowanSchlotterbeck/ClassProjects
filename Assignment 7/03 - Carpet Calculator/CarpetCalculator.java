import java.util.Scanner;

public class CarpetCalculator

{
   public static void main(String[] args) {

      // Establishes Scanner for the application
      Scanner js = new Scanner(System.in);

      // Prompts user to enter values for the carpet
      System.out.print("Width: ");
      double w = js.nextDouble();

      System.out.print("Length: ");
      double l = js.nextDouble();

      System.out.print("Price per Sqft: ");
      double p = js.nextDouble();

      // Establishes Objects used for computation
      RoomDimension dim = new RoomDimension(l, w);
      RoomCarpet roomCarpet = new RoomCarpet(dim, p);

      // Prints results to the console
      System.out.println(roomCarpet.toString());

   }
}
