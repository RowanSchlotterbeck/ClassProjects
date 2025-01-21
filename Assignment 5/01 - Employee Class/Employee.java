public class Employee {

    // Fields that store employee information
    private String name;
    private int idNumber;
    private String department;
    private String position;

    /**
     * Contrustor that initalizes all of the fields
     * 
     * @param name       Employee's name
     * @param idNumber   Employee's ID number
     * @param department Employee's department
     * @param position   Employeee's position within the comapny
     */

    public Employee(String name, int idNumber, String department, String position) {

        this.name = name;
        this.idNumber = idNumber;
        this.department = department;
        this.position = position;

    }

    /**
     * Contstuctor to inialize only name and ID number while leaving department and
     * position empty
     * 
     * @param name
     * @param idNumber
     */
    public Employee(String name, int idNumber) {
        this.name = name;
        this.idNumber = idNumber;
        this.department = "";
        this.position = "";
    }

    /**
     * Default constuctor; initializes all fields to a default value
     */
    public Employee() {

        this.name = "";
        this.idNumber = 0;
        this.department = "";
        this.position = "";

    }

    /**
     * Getter method that returns employee's name
     */
    public String getName() {

        return name;

    }

    /**
     * Getter method that returns employee's ID number
     */
    public int getIdNumber() {

        return idNumber;

    }

    /**
     * Getter method that returns employee's department
     */
    public String getDepartment() {

        return department;

    }

    /**
     * Getter method that returns employee's position
     */
    public String getPosition() {

        return position;

    }

    /**
     * Setter method that sets the employee's name
     */
    public void setName(String name) {

        this.name = name;

    }

    /**
     * Setter method that sets the employee's ID number
     */
    public void setIdNumber(int idNumber) {

        this.idNumber = idNumber;

    }

    /**
     * Setter method that sets the employee's department
     */
    public void setDepartment(String department) {

        this.department = department;

    }

    /**
     * Setter method that sets the employee's position within the company
     */
    public void setPosition(String position) {

        this.position = position;

    }

    /**
     * Created another method to print all of an employee's info upon calling
     */
    public void printInfo() {

        System.out.println("Name: " + name);
        System.out.println("ID Number: " + idNumber);
        System.out.println("Department: " + department);
        System.out.println("Position: " + position);
        System.out.println();

    }
}