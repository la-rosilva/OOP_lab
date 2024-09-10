import java.util.Scanner;

class stud {
    String sname;
    int[] marks_array;
    int total;
    double avg;

    stud() {
        System.out.println("Inside the default constructor:");
        sname = "";
        marks_array = new int[0];
        total = 0;
        avg = 0.0;
    }

    stud(String sname, int[] marks_array) {
        System.out.println("Inside the parameterised constructor:");
        this.sname = sname;
        this.marks_array = marks_array;
    }

    void compute() {
        total = 0;
        int count = 0;
        for (int m : marks_array) {
            total += m;
            count++;
        }
        avg = (double) total / count;
    }

    void display() {
        System.out.println("Name: " + sname);
        System.out.println("Marks: ");
        for (int k : marks_array) {
            System.out.println(k);
        }
        System.out.println("Total: " + total);
        System.out.println("Average: " + avg);
    }
}

class ScienceStudent extends stud {
    private int Practical_marks;

    ScienceStudent(String name, int[] marks_array, int Practical_marks) {
        super(name, marks_array);
        this.Practical_marks = Practical_marks;
    }

    void compute() {
        super.compute();
        int total_marks = Practical_marks + super.total;
        double average = (double) total_marks / (marks_array.length + 1);
        System.out.println("Total Marks (including practical): " + total_marks);
        System.out.println("Average Marks: " + average);
    }

    void DisplayPracticalMarks() {
        System.out.println("The Practical marks are: " + Practical_marks);
    }
}

class ArtsStudent extends stud {
    private String electiveSubject;

    ArtsStudent(String name, int[] marks_array, String electiveSubject) {
        super(name, marks_array);
        this.electiveSubject = electiveSubject;
    }

    void DisplayElective() {
        System.out.println("The elective subject is: " + electiveSubject);
    }
}

public class employeeinherit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Student
        System.out.println("Enter the name: ");
        String name = sc.nextLine();
        System.out.println("Enter the number of subjects: ");
        int sub = sc.nextInt();
        int[] marks = new int[sub];
        for (int j = 0; j < sub; j++) {
            System.out.println("Enter the marks for subject " + (j + 1) + ":");
            marks[j] = sc.nextInt();
        }
        sc.nextLine(); // Consuming leftover newline
        stud student1 = new stud(name, marks);
        student1.compute();
        student1.display();
        System.out.println();

        // Science Student
        System.out.println("Enter the name for the science student: ");
        String name_sci = sc.nextLine();
        System.out.println("Enter the number of subjects: ");
        int sub_sci = sc.nextInt();
        int[] marks_sci = new int[sub_sci];
        for (int j = 0; j < sub_sci; j++) {
            System.out.println("Enter the marks for subject " + (j + 1) + ":");
            marks_sci[j] = sc.nextInt();
        }
        System.out.println("Enter the practical exam marks:");
        int practical = sc.nextInt();
        sc.nextLine(); // Consuming leftover newline
        ScienceStudent student2 = new ScienceStudent(name_sci, marks_sci, practical);
        student2.compute();
        student2.display();
        student2.DisplayPracticalMarks();
        System.out.println();

        // Arts Student
        System.out.println("Enter the name for the arts student: ");
        String name_arts = sc.nextLine();
        System.out.println("Enter the number of subjects: ");
        int sub_arts = sc.nextInt();
        int[] marks_arts = new int[sub_arts];
        for (int j = 0; j < sub_arts; j++) {
            System.out.println("Enter the marks for subject " + (j + 1) + ":");
            marks_arts[j] = sc.nextInt();
        }
        sc.nextLine(); // Consuming leftover newline
        System.out.println("Enter the elective subject: ");
        String elective = sc.nextLine();
        ArtsStudent student3 = new ArtsStudent(name_arts, marks_arts, elective);
        student3.compute();
        student3.display();
        student3.DisplayElective();
    }
}
