import java.util.ArrayList;

public class DriverExam {

    // String array that contains all of the correct answers
    private String[] correctAnswers = {
            "B", "D", "A", "A", "C", "A", "B", "A",
            "C", "D", "B", "C", "D", "A", "D", "C",
            "C", "B", "D", "A"
    };

    // Initializes a new String array of size 20
    private String[] studentAnswers = new String[20];

    /* Method to check if student passed drivers exam */
    public boolean passed() {

        int r = 0;
        for (int i = 0; i < correctAnswers.length; i++) {

            if (correctAnswers[i].equalsIgnoreCase(studentAnswers[i])) {

                r++;

            }

        }

        if (r >= 15) {
            return true;
        } else {
            return false;
        }

    }

    /* Method to find the amount of correct answers */
    public int totalCorrect() {

        int r = 0;
        for (int i = 0; i < correctAnswers.length; i++) {

            if (correctAnswers[i].equalsIgnoreCase(studentAnswers[i])) {

                r++;

            }

        }

        return r;

    }

    /* Method to find the amount of incorrect answers */
    public int totalIncorrect() {

        return correctAnswers.length - totalCorrect();

    }

    /* Method to find what questions were missed */
    public ArrayList<Integer> questionsMissed() {

        ArrayList<Integer> questionsMissed = new ArrayList<Integer>();

        for (int i = 0; i < correctAnswers.length; i++) {

            if ((correctAnswers[i].equalsIgnoreCase(studentAnswers[i])) == false) {

                questionsMissed.add(i + 1);

            }

        }

        return questionsMissed;

    }

    /* Accessor method to get the length of the correctAnswers array */
    public int getCorrectAnswersLength() {

        return correctAnswers.length;

    }

    /* Accessor method to get the studentAnswers array */
    public String[] getStudentAnswers() {

        return studentAnswers;

    }

    /* Mutator method to set the studentAnswers array */
    public void setStudentAnswers(int i, String s) {

        studentAnswers[i] = s;

    }

}