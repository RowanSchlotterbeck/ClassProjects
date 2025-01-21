public class RoomDimension {
    private double length;
    private double width;

    /* Constuctor to get the necessary values */
    public RoomDimension(double len, double w) {
        length = len;
        width = w;
    }

    /* Method to get the area of the carpet */
    public double getArea() {
        return length * width;
    }

    /* Method to return the string of the carpet dimensions */
    public String toString() {
        return "Length: " + length + " and " + "Width: " + width;
    }
}