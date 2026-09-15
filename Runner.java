import java.util.Scanner;

public class Runner
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // Pet 1
        Pet pet1 = new Pet();
        System.out.println(pet1);
        System.out.println();

        // Pet 2 - Dog named Eight
        Pet pet2 = new Pet("Dog", "Eight", 11);
        System.out.println(pet2);
        System.out.println();

        // Pet 3 - User enters the information
        Pet pet3 = new Pet();

        System.out.println("Enter animal type:");
        String type = input.nextLine();

        System.out.println("Enter animal name:");
        String name = input.nextLine();

        System.out.println("Enter animal age:");
        int age = input.nextInt();

        pet3.setType(type);
        pet3.setName(name);
        pet3.setAge(age);

        System.out.println();
        System.out.println(pet3);

        input.close();
    }
}