public class Module2Assignment
{
    public static void main(String[] args)
    {
        // Three test scores
        double testScore1=88.2;
        double testScore2=78.9;
        double testScore3=97.6;
        
        // Calculate the average 
        double average = (testScore1 + testScore2 + testScore3) / 3;
        
        // Display the scores and average 
        System.out.println("Test score 1: " + testScore1);
        System.out.println("Test score 2: " + testScore2);
        System.out.println("Test score 3: " + testScore3);
        System.out.printf("The average of 3 test scores is: %.2f%n", average);
    
    }

}
