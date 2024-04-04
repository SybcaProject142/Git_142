package git_142;

public class Employee {
    private String name;
    private String jobTitle;
    private double basicSalary;
    
    // Constants for allowances
    private static final double DA_PERCENTAGE = 0.10;
    private static final double HRA_AMOUNT = 5000;

    public Employee(String name, String jobTitle, double basicSalary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.basicSalary = basicSalary;
    }

    public void calculateAndUpdateSalary() {
        double da = basicSalary * DA_PERCENTAGE;
        double totalSalary = basicSalary + da + HRA_AMOUNT;
        System.out.println("Total salary for employee " + name + " is: " + totalSalary);
    }

    public String getName() {
        return name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Melanie Doel", "Software Engineer", 80000);
        emp.calculateAndUpdateSalary();
    }
}
