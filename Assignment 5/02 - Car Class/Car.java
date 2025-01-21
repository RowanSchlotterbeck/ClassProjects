public class Car {

    // Fields that store data about the car
    private int yearModel;
    private String make;
    private int speed;

    /**
     * Constructor that initalizes the car's model and make. Also sets the speed to
     * 0
     * 
     * @param yearModel
     * @param make
     */
    public Car(int yearModel, String make) {

        this.yearModel = yearModel;
        this.make = make;
        this.speed = 0;

    }

    /**
     * Getter method that returns the car's year model
     * 
     * @return
     */
    public int getYearModel() {

        return yearModel;

    }

    /**
     * Getter method that returns the car's make
     * 
     * @return
     */
    public String getMake() {

        return make;

    }

    /**
     * Getter methods that returns the car's speed
     * 
     * @return
     */
    public int getSpeed() {

        return speed;

    }

    /**
     * Method to accelerate the car; increases speed by 5
     */
    public void accelerate() {

        speed += 5;

    }

    /**
     * Method to decelerate the car; decreases speed by 5
     */
    public void brake() {

        speed -= 5;

    }
}