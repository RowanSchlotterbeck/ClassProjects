import java.util.Scanner;

public class SortedNames {
   public static void main(String[] args) {
      // Ask user to input names; establish scanners
      Scanner js = new Scanner(System.in);
      System.out.print("Enter the first name: ");
      String name1 = js.nextLine();

      Scanner js2 = new Scanner(System.in);
      System.out.print("Enter the second name: ");
      String name2 = js.nextLine();

      Scanner js3 = new Scanner(System.in);
      System.out.print("Enter the third name: ");
      String name3 = js.nextLine();

      String output = "";

      // Sort names into alphabetical order

      // If name 1 is the first
      if (name1.compareToIgnoreCase(name2) < 0 && name1.compareToIgnoreCase(name3) < 0) {

         output += name1 + "\n";

         if (name2.compareToIgnoreCase(name3) < 0) {

            output += name2 + "\n";
            output += name3 + "\n";

         } else if (name2.compareToIgnoreCase(name3) > 0) {

            output += name3 + "\n";
            output += name2 + "\n";

         } else {

            output = "Please input all unqiue names";

         }
         // If name 2 is the first
      } else if ((name2.compareToIgnoreCase(name1)) < 0 && (name2.compareToIgnoreCase(name3) < 0)) {

         output += name2 + "\n";

         if (name1.compareToIgnoreCase(name3) < 0) {

            output += name1 + "\n";
            output += name3 + "\n";

         } else if (name1.compareToIgnoreCase(name3) > 0) {

            output += name3 + "\n";
            output += name1 + "\n";

         }
         // If name 3 is the first
      } else if ((name3.compareToIgnoreCase(name2)) < 0 && (name3.compareToIgnoreCase(name1) < 0)) {

         output += name3 + "\n";

         if (name1.compareToIgnoreCase(name2) < 0) {

            output += name1 + "\n";
            output += name2 + "\n";

         } else if (name1.compareToIgnoreCase(name2) > 0) {

            output += name2 + "\n";
            output += name1 + "\n";

         }

      }
      // Print sorted names to console
      System.out.println(output);
   }
}