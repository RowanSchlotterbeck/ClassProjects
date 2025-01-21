public class Payroll {
    // Establish nessecary fields for the class
    private int[] employeeId = { 5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7580489 };

    private int[] hours = new int[7];

    private double[] payRate = new double[7];

    private double[] wages = new double[7];

    /* Mutator method for setting the pay rate */
    public void setPayRate(int i, double r) {

        payRate[i] = r;

    }

    /* Mutator method for setting the hours */
    public void setHours(int i, int h) {

        hours[i] = h;

    }

    /* Method that calculates the gross pay of an empployee given an index */
    public void calculateGrossPay(int i, int h, double r) {

        wages[i] = h * r;

    }

    /* Accessor method for the employee given an index */
    public int getEmployeeId(int i) {

        return employeeId[i];

    }

    /* Accessor method for the employee array length */
    public int getEmployeeIdLength() {

        return employeeId.length;

    }

    /* Accessor method for the wages of an employee given an index */
    public double getWages(int i) {

        return wages[i];

    }

}