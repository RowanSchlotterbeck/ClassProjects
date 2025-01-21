import java.io.*;

public class PrimeNumberList {

    public static void main(String[] args) throws IOException {

        // Establish FileWrite to be able to write to file
        FileWriter outputFile = new FileWriter("list.txt");

        // Initalize string to be able to add to
        String list = "List: ";

        // For loop iterates from 1 to 100 and checks for prime numbers
        for (int i = 1; i <= 100; i++) {

            if (isPrime(i) == true) {

                list = list + i + ", ";

            }

        }

        // Writes back to the file
        outputFile.write(list);
        // Closes the FileWriter
        outputFile.close();

        // Prints to console
        System.out.println(list);

    }

    // Method to determine if a number is prime
    public static boolean isPrime(int n) {

        // For loop iterates through all possible numbers at and beyond 2 to check for
        // prime numbers
        for (int i = 2; i <= Math.sqrt(n); i++) {

            if (n % i == 0) {

                return false;

            }

        }

        return true;

    }

}