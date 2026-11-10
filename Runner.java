import javax.swing.JOptionPane;

public class Runner
{
    public static void main(String[] args)
    {
        int questions = 0;
        int missed = 0;
        boolean valid = false;

        // Get number of questions
        while (!valid)
        {
            try
            {
                String input = JOptionPane.showInputDialog(
                    "How many questions are on the exam?"
                );

                questions = Integer.parseInt(input);

                if (questions == 0)
                {
                    throw new ArithmeticException();
                }

                valid = true;
            }
            catch (NumberFormatException e)
            {
                JOptionPane.showMessageDialog(
                    null,
                    "Please enter a number."
                );
            }
            catch (ArithmeticException e)
            {
                JOptionPane.showMessageDialog(
                    null,
                    "The number of questions cannot be 0."
                );
            }
        }

        valid = false;

        // Get number missed
        while (!valid)
        {
            try
            {
                String input = JOptionPane.showInputDialog(
                    "How many questions did the student miss?"
                );

                missed = Integer.parseInt(input);
                valid = true;
            }
            catch (NumberFormatException e)
            {
                JOptionPane.showMessageDialog(
                    null,
                    "Please enter a number."
                );
            }
        }

        // Create Exam object
        Exam exam = new Exam(questions, missed);

        // Display results
        String message = "Each question counts "
                + exam.getPointsEach();

        message += " points.\nThe exam score is "
                + exam.getScore();

        message += "\nThe exam grade is "
                + exam.getGrade();

        JOptionPane.showMessageDialog(null, message);

        System.exit(0);
    }
}