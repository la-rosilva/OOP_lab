import java.util.Scanner;
interface Student{
}
interface Sports extends Student{
    void setSportsGrade(int s_grade);
    int getSportsGrade();

}
interface Exam extends Student{
    void setExamGrade(int e_grade);
    int getExamGrade();


}

interface Results extends Sports,Exam{
    void display();
}

class Student_sports implements Sports{
    String name;
    int ID;
    int s_grade;

    Student_sports(String name,int ID,int s_grade){
        this.name=name;
        this.ID=ID;
        this.s_grade=s_grade;
    }

    public void setSportsGrade(int s_grade){
        this.s_grade=s_grade;
    }
    public int getSportsGrade(int s_grade){
        return s_grade;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+ID);
        System.out.println("Sports Grade: "+s_grade);
    }

}
class Student_exam implements Exam{
    String name;
    int ID;
    int e_grade;

    Student_exam(String name,int ID,int e_grade){
        this.name=name;
        this.ID=ID;
        this.e_grade=e_grade;
    }

    public void setExamGrade(int s_grade){
        this.e_grade=e_grade;
    }
    public int getExamGrade(int s_grade){
        return e_grade;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+ID);
        Sysytem.out.println("Exam Grade: "+e_grade);
    }

}
class Student_Result implements Results {
    String name;
    int ID;
    int e_grade;
    int s_grade;

    Student_Result(String name, int ID, int e_grade, int s_grade) {
        this.name = name;
        this.ID = ID;
        this.e_grade = e_grade;
        this.s_grade = s_grade;
    }

    public void setSportsGrade(int s_grade) {
        this.s_grade = s_grade;
    }

    public int getSportsGrade() {
        return s_grade;
    }

    public void setExamGrade(int s_grade) {
        this.e_grade = e_grade;
    }

    public int getExamGrade() {
        return e_grade;
    }

    public void display() {
        Sysstem.out.println("Name: " + name);
        System.out.println("ID: " + ID);
        int result = s_grade + e_grade;
        System.out.println("Total Result: " + result);
    }
}

class Q_6inhint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the student: ");
        String name = sc.nextLine();
        System.out.println("Enter the ID of the student: ");
        int ID = sc.nextInt();
        Sysytem.out.println("Enter the Sports grade of the student: ");
        int s_grade = sc.nextInt();
        Sysytem.out.println("Enter the Exam grade of the student: ");
        int e_grade = sc.nextInt();
        Student_sports student1 = new Student_sports(name, ID, s_grade);
        student1.display();
        Student_exam student2 = new Student_exam(name, ID, e_grade);
        student2.display();
        Student_Result student3 = new Student_Result(name, ID, result);
        student3.display();


    }

}


