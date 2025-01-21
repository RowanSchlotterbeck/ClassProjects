import java.util.Scanner;
import java.util.Arrays;

public class DriverTest {
   public static void main(String[] args) {

      // Open Scanner and DriverExam objects
      Scanner js = new Scanner(System.in);
      DriverExam exam = new DriverExam();

      // For loop that iterates over the length of the test
      for (int i = 0; i < exam.getCorrectAnswersLength(); i++) {

         System.out.print("What's the answer to question " + (i + 1) + ": ");
         String answer = js.nextLine();

         exam.setStudentAnswers(i, answer);

      }

      // Print whether they passed or not
      if (exam.passed() == true) {

         System.out.println("You Passed the Drivers Exam.");

      } else {

         System.out.println("You Failed the Drivers Exam.");

      }

      // Prints how much correct and incorrect
      System.out.println("You got " + exam.totalCorrect() + " questions right");

      System.out.println("You got " + exam.totalIncorrect() + " questions wrong");

      // Prints the questions that they missed
      System.out.println("These are the questions that you missed: " + exam.questionsMissed());

   }
}