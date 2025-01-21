public class Circle {

    // Fields to store the radius of the circle and constant of pi
    private double radius;
    private final double PI = 3.14159;

    /**
     * Constructor that intializes the radius
     * 
     * @param radius
     */
    public Circle(double radius) {

        setRadius(radius);

    }

    /**
     * Defualt constructor; initializes the radius to 0
     */
    public Circle() {

        setRadius(0.0);

    }

    /**
     * Setter method that sets the circle's radius
     * 
     * @param radius
     */
    public void setRadius(double radius) {

        this.radius = radius;

    }

    /**
     * Getter method that returns the circle's radius
     * 
     * @return
     */
    public double getRadius() {

        return radius;

    }

    /**
     * Calculuates the area of the circle
     * 
     * @return area
     */
    public double area() {

        return PI * radius * radius;

    }

    /**
     * Calculuates the diameter of the circle
     * 
     * @return diameter
     */
    public double diameter() {

        return radius * 2;

    }

    /**
     * Calculuates the circumference of the circle
     * 
     * @return circumference
     */
    public double circumference() {

        return 2 * PI * radius;

    }
}