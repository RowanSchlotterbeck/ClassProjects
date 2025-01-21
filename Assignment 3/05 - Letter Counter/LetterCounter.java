import java.util.Scanner;

public class LetterCounter {
   public static void main(String[] args) {
      // Open the Scanner "js" denotes keyboard input
      Scanner js = new Scanner(System.in);

      System.out.print("Enter a string: ");
      String s = js.nextLine();

      System.out.print("Enter a character: ");
      // Method for collecting a single char for the second input
      char c = js.next().charAt(0);

      // Establish variable that will be used to count the amt of times the char is
      // found in the string
      int count = 0;

      // Iterates over the string and adding to the count when the char matches with
      // the string
      for (int i = 0; i < s.length(); i++) {

         if (s.charAt(i) == c) {
            count++;
         }
      }

      // Prints out to the console the amt of times the char was in the string
      if (count == 1) {
         System.out.println("Character \"" + c + "\" appeared in \"" + s
               + "\" " + count + " time");
      } else {
         System.out.println("Character \"" + c + "\" appeared in \"" + s
               + "\" " + count + " times");
      }

   }
}