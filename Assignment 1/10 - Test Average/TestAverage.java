import java.util.Scanner;

public class TestAverage {
   public static void main(String[] args) {
      // Prompt User for test score 1
      Scanner query1 = new Scanner(System.in);
      System.out.print("Enter 1st Score: ");
      double score1 = query1.nextInt();

      // Prompt User for test score 2
      Scanner query2 = new Scanner(System.in);
      System.out.print("Enter 2nd Score: ");
      double score2 = query2.nextInt();

      // Prompt User for test score 3
      Scanner query3 = new Scanner(System.in);
      System.out.print("Enter 3rd Score: ");
      double score3 = query3.nextInt();

      // Perform Average calculation
      double average = ((score1 + score2 + score3) / 3);

      // Print the results to the terminal
      System.out.println("Score 1: " + score1);
      System.out.println("Score 2: " + score2);
      System.out.println("Score 3: " + score3);
      System.out.println("Average: " + average);

   }
}