public class Pet
{
    private String name;
    private String type;
    private int age;

    // Default constructor
    public Pet()
    {
        setName("Pet Name");
        setType("Animal");
        setAge(1);
    }

    // Custom constructor
    public Pet(String type, String name, int age)
    {
        setType(type);
        setName(name);
        setAge(age);
    }

    // Set methods
    public void setName(String name)
    {
        this.name = name;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    // Get methods
    public String getName()
    {
        return name;
    }

    public String getType()
    {
        return type;
    }

    public int getAge()
    {
        return age;
    }

    // Speak method
    public String speak()
    {
        if (type.equalsIgnoreCase("dog"))
        {
            return "Woof";
        }
        else if (type.equalsIgnoreCase("cat"))
        {
            return "Meow";
        }
        else
        {
            return "Yowl";
        }
    }

    // Pet information
    public String toString()
    {
        String output = "Pet information:\n";
        output += "Type: " + type + "\n";
        output += "Name: " + name + "\n";
        output += "Sound: " + speak() + "\n";
        output += "Age: " + age;

        return output;
    }
}