// Employee class (base class)
class Employee {
    protected String name;
    protected String employeeId;
    protected double basicSalary;

    public Employee(String name, String employeeId, double basicSalary) {
        this.name = name;
        this.employeeId = employeeId;
        this.basicSalary = basicSalary;
    }

    public double calculateSalary() {
        return basicSalary;
    }

    public void displaySalarySlip() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Basic Salary: " + basicSalary);
    }
}

// Manager class (subclass)
class Manager extends Employee {
    private double allowance;

    public Manager(String name, String employeeId, double basicSalary, double allowance) {
        super(name, employeeId, basicSalary);
        this.allowance = allowance;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + allowance;
    }

    @Override
    public void displaySalarySlip() {
        super.displaySalarySlip();
        System.out.println("Allowance: " + allowance);
        System.out.println("Total Salary: " + calculateSalary());
    }
}

// Developer class (subclass)
class Developer extends Employee {
    private double bonus;

    public Developer(String name, String employeeId, double basicSalary, double bonus) {
        super(name, employeeId, basicSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + bonus;
    }

    @Override
    public void displaySalarySlip() {
        super.displaySalarySlip();
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + calculateSalary());
    }
}

// PayrollSystem class
public class PayrollSystem {
    public static void main(String[] args) {
        try {
            Manager manager = new Manager("John Doe", "M001", 50000, 10000);
            Developer developer = new Developer("Jane Doe", "D001", 40000, 5000);

            System.out.println("Manager Salary Slip:");
            manager.displaySalarySlip();

            System.out.println("\nDeveloper Salary Slip:");
            developer.displaySalarySlip();

            // Test exception handling
            Employee employee = new Employee("Unknown", "U001", -10000);
            if (employee.basicSalary < 0) {
                throw new InvalidSalaryException("Invalid salary amount");
            }
        } catch (InvalidSalaryException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

// Custom exception class
class InvalidSalaryException extends Exception {
    public InvalidSalaryException(String message) {
        super(message);
    }
}

