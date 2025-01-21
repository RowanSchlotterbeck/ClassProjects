import java.util.Scanner;

public class PayrollDemo {
   public static void main(String[] args) {

      // Establish Scanner and payroll class
      Scanner js = new Scanner(System.in);
      Payroll payroll = new Payroll();

      // For loop that iterates through each of the indicies of the employees array
      // Collects user input and uses the methods in the payroll method
      for (int i = 0; i < payroll.getEmployeeIdLength(); i++) {

         System.out.println("Employee: " + payroll.getEmployeeId(i));

         System.out.print("Enter hours: ");
         int hours = js.nextInt();
         payroll.setHours(i, hours);

         System.out.print("Enter Rate: ");
         double rate = js.nextDouble();
         payroll.setPayRate(i, rate);

         payroll.calculateGrossPay(i, hours, rate);

      }

      // For loop that iterates through the employees array
      // Prints the inforamtion of each employee
      for (int i = 0; i < payroll.getEmployeeIdLength(); i++) {

         System.out.println(
               "The gross wages of employee " + "\"" + payroll.getEmployeeId(i) + "\"" + " is $" + payroll.getWages(i));

      }

   }
}