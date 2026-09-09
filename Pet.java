public class Pet
{
    // Private data
    private String name;

    // Default constructor
    public Pet()
    {
        setName("Pet Name");
    }

    // Set method
    public void setName(String petName)
    {
        name = petName;
    }

    // Get method
    public String getName()
    {
        return name;
    }

    // Returns the Pet information
    public String toString()
    {
        return "Pet information:\nName: " + name;
    }

    public static void main(String[] args)
    {
        // First Pet object
        Pet pet1 = new Pet();
        System.out.println(pet1.toString());

        System.out.println();

        // Second Pet object
        Pet pet2 = new Pet();
        pet2.setName("Eight");
        System.out.println(pet2.toString());
    }
}
