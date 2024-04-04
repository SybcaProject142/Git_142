package git_142;

import java.util.Scanner;

public class Teachers {
    protected String type;

    // Constructor
    public Teachers(String type) {
        this.type = type;
    }

    // Method to display what the teacher teaches
    public void Teaches() {
        System.out.println("This teacher teaches " + type);
    }

    public static void main(String[] args) {
        TeacherTeaches teacher = new TeacherTeaches("Math");
        teacher.Subjects();
    }
}

class TeacherTeaches extends Teachers {
    private String name;

    // Constructor
    public TeacherTeaches(String type) {
        super(type);
    }

    // Method to input and display the subject taught
    public void Subjects() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the subject: ");
        name = scanner.nextLine();
        scanner.close();
        System.out.println("The teacher is teaching " + name);
    }
}
