public class Animal
{
    private String species;

    // Default constructor
    public Animal()
    {
        species = "Unknown";
    }

    // Custom constructor
    public Animal(String newSpecies)
    {
        species = newSpecies;
    }

    // Set method
    public void setSpecies(String newSpecies)
    {
        species = newSpecies;
    }

    // Get method
    public String getSpecies()
    {
        return species;
    }

    // toString method
    public String toString()
    {
        return "Species: " + species;
    }
}