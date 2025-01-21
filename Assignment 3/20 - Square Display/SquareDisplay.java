import java.util.Scanner;

public class SquareDisplay {
   public static void main(String[] args) {
      // Open the Scanner "js" denotes keyboard input
      Scanner js = new Scanner(System.in);

      System.out.print("Enter a positive integer less than or equal to 15: ");
      int squareSize = js.nextInt();

      // For loops iterates twice to create the square
      for (int i = 0; i < squareSize; i++) {
         for (int j = 0; j < squareSize; j++) {
            System.out.print("X");
         }
         // Lines breaks in between rows
         System.out.println();

      }
   }
}