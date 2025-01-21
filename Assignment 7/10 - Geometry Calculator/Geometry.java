public class Geometry {

    /* Method to get the area of a circle */
    public static double getCircleArea(double radius) {
        if (radius < 0) {
            System.out.println("Error: Please enter a positive number");
            return -1;
        } else {
            return (Math.PI * (radius * radius));
        }
    }

    /* Method to get the area of a rectangle */
    public static double getRectangleArea(double length, double width) {
        if ((length < 0) || (width < 0)) {
            System.out.println("Error: Please enter a positive number");
            return -1;
        } else {
            return length * width;
        }
    }

    /* Method to get the area of a triangle */
    public static double getTriangleArea(double base, double height) {
        if ((base < 0) || (height < 0)) {
            System.out.println("Error: Please enter a positive number");
            return -1;
        } else {
            return base * height * 0.5;
        }
    }

}