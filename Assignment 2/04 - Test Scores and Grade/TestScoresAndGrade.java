import java.util.Scanner;

public class TestScoresAndGrade {
   public static void main(String[] args) {

      // Collect User inputs
      Scanner js = new Scanner(System.in);
      System.out.print("Enter Test Score 1: ");
      int score1 = js.nextInt();

      Scanner js2 = new Scanner(System.in);
      System.out.print("Enter Test Score 1: ");
      int score2 = js2.nextInt();

      Scanner js3 = new Scanner(System.in);
      System.out.print("Enter Test Score 1: ");
      int score3 = js3.nextInt();

      // Compute Average score
      double average = ((score1 + score2 + score3) / 3);

      // Assign the Average score a letter grade
      if (90 <= average && average <= 100) {
         System.out.println("Average: " + average);
         System.out.println("Grade: A");
      } else if (80 <= average && average < 90) {
         System.out.println("Average: " + average);
         System.out.println("Grade: B");
      } else if (70 <= average && average < 80) {
         System.out.println("Average: " + average);
         System.out.println("Grade: C");
      } else if (60 <= average && average < 70) {
         System.out.println("Average: " + average);
         System.out.println("Grade: D");
      } else if (average < 60) {
         System.out.println("Average: " + average);
         System.out.println("Grade: F");
      }

   }
}