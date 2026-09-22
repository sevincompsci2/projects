import java.util.Scanner;

public class Tests
{
    private double average;
    private int numberOfScores;

    // Constructor
    public Tests()
    {
        average = 0;
        numberOfScores = 0;
    }

    // Gets scores from the user and calculates average
    public void getAverage()
    {
        Scanner input = new Scanner(System.in);

        double sum = 0;
        double score;
        int count = 0;

        System.out.println("Enter a test score (-1 to quit):");
        score = input.nextDouble();

        while (score != -1)
        {
            sum = sum + score;
            count++;

            System.out.println("Enter a test score (-1 to quit):");
            score = input.nextDouble();
        }

        numberOfScores = count;
        average = sum / count;
    }

    public double getTestAverage()
    {
        return average;
    }

    public int getNumberOfScores()
    {
        return numberOfScores;
    }

    public String toString()
    {
        return String.format(
            "The average of the %d scores entered is %.2f.",
            numberOfScores, average
        );
    }
}