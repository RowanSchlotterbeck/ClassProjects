public class LandTract {

    // Establishes fields within the class
    private double length;
    private double width;

    /* Constructor used to intiliaze values */
    public LandTract(double len, double w) {
        length = len;
        width = w;
    }

    /* Method to get the area of a tract */
    public double getTractArea() {
        return length * width;
    }

    /* Method to check the equality of two tracts */
    public boolean equals(double tract1, double tract2) {
        if (tract1 == tract2) {
            System.out.println("The tracts are of equal size");
            return true;
        } else {
            System.out.println("The tracts are not of equal size");
            return false;
        }
    }

    /* Method to put the length and width into a string */
    public String toString() {
        return "Length: " + length + "Width" + width;
    }

}