import java.util.Scanner;

public class RomanNumerals {
   public static void main(String[] args) {
      // Collect input from the user
      Scanner userInput = new Scanner(System.in);

      System.out.print("Enter Number: ");

      // Declare variable
      int romanNumeral = userInput.nextInt();

      // Conditionals
      if (romanNumeral == 1) {
         System.out.println("Roman Numeral: I");
      } else if (romanNumeral == 2) {
         System.out.println("Roman Numeral: II");
      } else if (romanNumeral == 3) {
         System.out.println("Roman Numeral: III");
      } else if (romanNumeral == 4) {
         System.out.println("Roman Numeral: IV");
      } else if (romanNumeral == 5) {
         System.out.println("Roman Numeral: V");
      } else if (romanNumeral == 6) {
         System.out.println("Roman Numeral: VI");
      } else if (romanNumeral == 7) {
         System.out.println("Roman Numeral: VII");
      } else if (romanNumeral == 8) {
         System.out.println("Roman Numeral: VIII");
      } else if (romanNumeral == 9) {
         System.out.println("Roman Numeral: IX");
      } else if (romanNumeral == 10) {
         System.out.println("Roman Numeral: X");
      } else {
         System.out.println("Number must be 1-10");
      }

   }
}