import java.util.ArrayList;

public class Asn5
{
    public static void main(String[] args)
    {
        // Create two ArrayLists
        ArrayList<String> cars = new ArrayList<String>();
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        // Add 4 cars
        cars.add("Honda");
        cars.add("Toyota");
        cars.add("BMW");
        cars.add("Lexus");

        // Add 4 numbers
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        // Display cars
        System.out.println("Cars:");
        for (String car : cars)
        {
            System.out.println(car);
        }

        // Display numbers
        System.out.println("\nNumbers:");
        for (Integer number : numbers)
        {
            System.out.println(number);
        }

        // Two more ArrayList methods
        cars.remove("BMW");
        numbers.set(0, 100);

        // Display lists again
        System.out.println("\nCars after changes:");
        for (String car : cars)
        {
            System.out.println(car);
        }

        System.out.println("\nNumbers after changes:");
        for (Integer number : numbers)
        {
            System.out.println(number);
        }
    }
}