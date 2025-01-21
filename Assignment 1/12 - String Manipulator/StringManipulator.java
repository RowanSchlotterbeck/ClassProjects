import java.util.Scanner;

public class StringManipulator {
   public static void main(String[] args) {
      // Creates Scanner Object
      Scanner userInput = new Scanner(System.in);
      System.out.println("Whats your fgavorite city? ");

      // Reads string input from the user
      String cityName = userInput.nextLine();

      // Methods
      int cityStringSize = cityName.length();
      System.out.println("There are " + cityStringSize + " characters in " + cityName);

      String cityUppercase = cityName.toUpperCase();
      System.out.println("Uppercase: " + cityUppercase);

      String cityLowercase = cityName.toLowerCase();
      System.out.println("Lowercase: " + cityLowercase);

      char cityFirstCharacter = cityName.charAt(0);
      System.out.println("The first character of " + cityName + " is " + cityFirstCharacter);

   }
}