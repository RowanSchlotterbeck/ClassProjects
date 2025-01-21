import java.util.Scanner;

public class FreezeBoilDemo {
   public static void main(String[] args) {

      // Gathers user input
      Scanner js = new Scanner(System.in);
      System.out.print("Enter the temperature in fahrenheit: ");
      double f = js.nextDouble();

      // Intializes Freezboil
      FreezeBoil freezeBoil = new FreezeBoil(f);

      // Prints freezing/boiling information to the console
      System.out.println();
      freezeBoil.isEthylBoiling();
      freezeBoil.isEthylFreezing();
      freezeBoil.isOxygenBoiling();
      freezeBoil.isOxygenFreezing();
      freezeBoil.isWaterBoiling();
      freezeBoil.isWaterFreezing();
      System.out.println();
   }
}