import java.util.Scanner;

public class WiFiDiagnostic {
   public static void main(String[] args) {

      // Create Scanner
      Scanner js = new Scanner(System.in);
      System.out.println("Reboot the computer and try to connect.");
      System.out.print("Did that fix the problem? ");
      String input = js.nextLine();

      // Conditionals to determine the root of the computer problem
      // Ends program if problem is fixed

      if (input.compareTo("yes") != 0) {

         System.out.println("Reboot the router and try to connect.");
         System.out.print("Did that fix the problem? ");
         input = js.nextLine();

         if (input.compareTo("yes") != 0) {

            System.out.println("Make sure the cables between the router and modem are plugged in firmly.");
            System.out.print("Did that fix the problem? ");
            input = js.nextLine();

            if (input.compareTo("yes") != 0) {

               System.out.println("Move the router to a new location and try to connect.");
               System.out.print("Did that fix the problem? ");
               input = js.nextLine();

               if (input.compareTo("yes") != 0) {

                  System.out.println("Get a new router.");

               }

            }

         }

      }

   }
}
