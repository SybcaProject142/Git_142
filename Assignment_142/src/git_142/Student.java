package git_142;

public class Student {
    private String name;
    private int age;
    private String address;

    // Constructor with default values
    public Student() {
        this.name = "Max";
        this.age = 19;
        this.address = "Margao";
    }

    // Method to set name and age
    public void setInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to set name, age, and address
    public void setInfo(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Method to print student information
    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.printInfo();
        System.out.println();

        Student student2 = new Student();
        student2.setInfo("Alice", 20);
        student2.printInfo();
        System.out.println();

        Student student3 = new Student();
        student3.setInfo("Bob", 22, "123 Main St");
        student3.printInfo();
    }
}
