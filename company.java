// Abstract Base Class
abstract class Employee {
    protected String name;

    public Employee(String name) {
        this.name = name;
    }

    // Abstract method for salary calculation
    public abstract double calculateSalary();

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + calculateSalary());
    }
}

// Subclass: Full-Time Employee
class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(String name, double monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}

// Subclass: Part-Time Employee
class PartTimeEmployee extends Employee {
    private double hourlyWage;
    private int hoursWorked;

    public PartTimeEmployee(String name, double hourlyWage, int hoursWorked) {
        super(name);
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyWage * hoursWorked;
    }
}

// Main Program
public class EmployeeSalarySystem {
    public static void main(String[] args) {
        FullTimeEmployee fullTime = new FullTimeEmployee("Alice", 5000);
        PartTimeEmployee partTime = new PartTimeEmployee("Bob", 20, 120);

        System.out.println("=== Full-Time Employee ===");
        fullTime.displayDetails();

        System.out.println("\n=== Part-Time Employee ===");
        partTime.displayDetails();
    }
}
