public class Calc
{
    private double num1;
    private double num2;

    // Default constructor
    public Calc()
    {
        num1 = 0;
        num2 = 0;
    }

    // Set methods
    public void setNum1(double n1)
    {
        num1 = n1;
    }

    public void setNum2(double n2)
    {
        num2 = n2;
    }

    // Get methods
    public double getNum1()
    {
        return num1;
    }

    public double getNum2()
    {
        return num2;
    }

    // Addition
    public double add()
    {
        return num1 + num2;
    }

    // Subtraction
    public double subtract()
    {
        return num1 - num2;
    }

    // Multiplication
    public double multiply()
    {
        return num1 * num2;
    }

    // Division
    public double divide()
    {
        return num1 / num2;
    }

    // Display private data fields
    public String toString()
    {
        return "Displaying private data fields using toString():\n"
             + "Num1: " + num1 + "\n"
             + "Num2: " + num2;
    }
}
