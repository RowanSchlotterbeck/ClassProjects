import java.util.Scanner;
import java.io.*;

public class UppercaseFileConverter {
   public static void main(String[] args) throws IOException {
      // Open the Scanner "js" denotes keyboard input
      Scanner js = new Scanner(System.in);

      // Get the names of the files to recieve input from and to write output to
      System.out.print("Enter the name of the file to read from: ");
      String inputFile = js.nextLine();

      System.out.print("Enter the name of the file to write to: ");
      String outputFile = js.nextLine();

      // Open file Scanner to read from input file
      File fileOriginal = new File(inputFile);
      Scanner fileScanner = new Scanner(fileOriginal);

      // Open FileWriter to write to the output file
      FileWriter fileEditor = new FileWriter(outputFile);

      // While loop takes lines in input file and writes an uppercase version to the
      // output file
      while (fileScanner.hasNextLine()) {

         String line = fileScanner.nextLine();

         String upperCaseLine = line.toUpperCase();

         fileEditor.write(upperCaseLine + "\n");
      }

      // Close file scanner and file writer
      fileScanner.close();
      fileEditor.close();
   }
}