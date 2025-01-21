import java.util.Scanner;

public class ConversionProgram {

    public static void main(String[] args) {
        // Establish scanner for keyboard input
        Scanner js = new Scanner(System.in);

        // Initialize integer variables
        int meters;
        int choice;

        System.out.print("Enter a distance in meters: ");
        meters = js.nextInt();

        // While loop that will continully reject negative numbers
        while (meters < 0) {
            System.out.println("Please enter a positive number.");
            System.out.print("Enter a distance in meters: ");
            meters = js.nextInt();
        }

        // While loop that calls menu and houses the decision structure for the program
        while (true) {

            menu();

            System.out.print("Enter your choice: ");
            choice = js.nextInt();

            if (choice == 1) {
                showKilometers(meters);
            } else if (choice == 2) {
                showInches(meters);
            } else if (choice == 3) {
                showFeet(meters);
            } else if (choice == 4) {
                System.out.println("Bye!");
                break;
            } else {
                System.out.println("Invalid choice. Please choose again.");
            }
        }
    }

    // Method to convert meters into kilometers
    public static void showKilometers(int meters) {
        double kilometers = meters * 0.001;
        System.out.println(meters + " meters is " + kilometers + " kilometers");
    }

    // Method to convert meters into inches
    public static void showInches(int meters) {
        double inches = meters * 39.37;
        System.out.println(meters + " meters is " + inches + " inches");
    }

    // Method to convert meters into feet
    public static void showFeet(int meters) {
        double feet = meters * 3.281;
        System.out.println(meters + " meters is " + feet + " feet");
    }

    // Method that prints the menu of options
    public static void menu() {
        System.out.println("1. Convert to Kilometers");
        System.out.println("2. Convert to Inches");
        System.out.println("3. Convert to Feet");
        System.out.println("4. Quit the Program");
    }

}
