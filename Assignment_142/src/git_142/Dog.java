package git_142;

public class Dog {
    private String name;
    private String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Buddy", "Labrador");
        Dog dog2 = new Dog("Max", "Poodle");

        // Modifying attributes using setter methods
        dog1.setName("Charlie");
        dog2.setBreed("German Shepherd");

        // Printing the updated values
        System.out.println("Dog 1: Name - " + dog1.getName() + ", Breed - " + dog1.getBreed());
        System.out.println("Dog 2: Name - " + dog2.getName() + ", Breed - " + dog2.getBreed());
    }
}
