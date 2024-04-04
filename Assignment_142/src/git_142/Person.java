package git_142;

public class Person {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Alice");
        person1.setAge(30);

        Person person2 = new Person();
        person2.setName("Bob");
        person2.setAge(25);

        System.out.println("Name: " + person1.getName() + ", Age: " + person1.getAge());
        System.out.println("Name: " + person2.getName() + ", Age: " + person2.getAge());
    }
}
