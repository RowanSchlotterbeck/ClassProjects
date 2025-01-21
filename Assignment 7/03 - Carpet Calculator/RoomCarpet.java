public class RoomCarpet {
    private RoomDimension size;
    private double carpetCost;

    /* Constuctor to set the values */
    public RoomCarpet(RoomDimension dim, double cost) {
        size = dim;
        carpetCost = cost;
    }

    /* Method to get the total cost of the carpet */
    public double getTotalCost() {
        return size.getArea() * carpetCost;
    }

    /* Method to get the string of the output */
    public String toString() {
        return "Dimensions: " + size.toString() + "\n" + "Carpet Cost (per sqft): " + carpetCost + "\n" + "Total Cost: "
                + getTotalCost();
    }

}
