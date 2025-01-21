public class FallingDistance {

    public static void main(String[] args) {

        // For loop that iterates through all of the
        for (int i = 1; i <= 10; i++) {

            // Calls function value to the variable "distance"
            double distance = fallingDistance(i);
            if (i == 1) {
                System.out.println("At " + i + " second the distance fallen would be " + distance + " meters");
            } else {
                System.out.println("At " + i + " seconds the distance fallen would be " + distance + " meters");
            }

        }

    }

    // Method that preforms the distance calculations
    public static double fallingDistance(double t) {
        double g = 9.8;
        return 0.5 * g * (t * t);
    }

}
