public class Exam extends Assessment
{
    private int numQuestions;
    private int numMissed;
    private double pointsEach;

    public Exam(int questions, int missed)
    {
        numQuestions = questions;
        numMissed = missed;

        pointsEach = 100.0 / numQuestions;

        double score = 100.0 - (numMissed * pointsEach);

        setScore((int) score);
    }

    public double getPointsEach()
    {
        return pointsEach;
    }

    public int getNumQuestions()
    {
        return numQuestions;
    }

    public int getNumMissed()
    {
        return numMissed;
    }
}