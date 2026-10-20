import java.util.Arrays;
import java.util.Random;

public class IntArray
{
    private int length;
    private int[] myArray;

    public IntArray(int l)
    {
        length = l;
        myArray = new int[length];
    }

    public void clear()
    {
        length = 0;
        myArray = new int[0];
    }

    public void fillRand()
    {
        Random rand = new Random();

        for (int i = 0; i < length; i++)
        {
            myArray[i] = rand.nextInt(6) + 1;
        }
    }

    public int get(int element)
    {
        return myArray[element];
    }

    public void set(int element, int newValue)
    {
        myArray[element] = newValue;
    }

    public int size()
    {
        return length;
    }

    public boolean isEmpty()
    {
        return length == 0;
    }

    public void sort()
    {
        Arrays.sort(myArray);
    }

    public String toString()
    {
        return Arrays.toString(myArray);
    }
}