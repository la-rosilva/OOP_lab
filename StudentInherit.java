import java.util.Scanner;

// Base class
class emp {
    String Ename;
    int Eid;
    double Basic;
    double DA;
    double Gross_Sal;
    double Net_Sal;

    // Default constructor
    emp() {
        System.out.println("Inside the default constructor");
        Ename = "";
        Eid = 0;
        Basic = 0.0;
    }

    // Parameterized constructor
    emp(String Ename, int Eid, double Basic) {
        System.out.println("Inside the parameterized constructor");
        this.Ename = Ename;
        this.Eid = Eid;
        this.Basic = Basic;
    }

    // Method to compute net salary
    void compute_net_sal() {
        DA = 0.52 * Basic;
        Gross_Sal = Basic + DA;
        double IT = 0.3 * Gross_Sal;
        Net_Sal = Gross_Sal - IT;
    }

    // Method to display details
    void Display() {
        System.out.println("Name: " + Ename);
        System.out.println("ID: " + Eid);
        System.out.println("Basic Salary: " + Basic);
        System.out.println("DA: " + DA);
        System.out.println("Gross Salary: " + Gross_Sal);
        System.out.println("Net Salary: " + Net_Sal);
    }
}

// Full-time employee class (subclass)
class FullTimeEmp extends emp {
    double bonus;
    double deduction;
    double NetSalary;

    FullTimeEmp(String Ename, int Eid, double Basic) {
        super(Ename, Eid, Basic);
        this.bonus = 1000;  // Example value
        this.deduction = 500;  // Example value
    }

    // Overriding the method to compute net salary
    @Override
    void compute_net_sal() {
        super.compute_net_sal();  // Call base class computation
        NetSalary = super.Net_Sal + bonus - deduction;
    }

    // Overriding the display method
    @Override
    void Display() {
        super.Display();  // Call base class display
        System.out.println("Bonus: " + bonus);
        System.out.println("Deduction: " + deduction);
        System.out.println("Final Net Salary: " + NetSalary);
    }
}

// Part-time employee class (subclass)
class PartTimeEmp extends emp {
    int hoursWorked;
    double NetSal;
    final static double hourlyRate = 80;

    PartTimeEmp(String Ename, int Eid, int hoursWorked) {
        super(Ename, Eid, 0);  // Part-time employees may not have basic salary
        this.hoursWorked = hoursWorked;
    }

    // Overriding the method to compute net salary
    @Override
    void compute_net_sal() {
        NetSal = hoursWorked * hourlyRate;
    }

    // Overriding the display method
    @Override
    void Display() {
        System.out.println("Name: " + Ename);
        System.out.println("ID: " + Eid);
        System.out.println("Hours worked: " + hoursWorked);
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println("Net Salary: " + NetSal);
    }
}

// Main class to test employee inheritance and dynamic polymorphism
class StudentInherit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Full time employee
        System.out.println("Enter the name for full-time employee:");
        String EnameFull = sc.nextLine();
        System.out.println("Enter the Employee ID: ");
        int EidFull = sc.nextInt();
        System.out.println("Enter the Basic salary: ");
        double BasicFull = sc.nextDouble();

        emp emp1 = new FullTimeEmp(EnameFull, EidFull, BasicFull);  // Polymorphism
        emp1.compute_net_sal();
        emp1.Display();

        sc.nextLine();  // Consume leftover newline

        // Part time employee
        System.out.println("\nEnter the name for part-time employee:");
        String EnamePart = sc.nextLine();
        System.out.println("Enter the Employee ID: ");
        int EidPart = sc.nextInt();
        System.out.println("Enter the number of hours worked: ");
        int hoursWorked = sc.nextInt();

        emp emp2 = new PartTimeEmp(EnamePart, EidPart, hoursWorked);  // Polymorphism
        emp2.compute_net_sal();
        emp2.Display();
    }
}
