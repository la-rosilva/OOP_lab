import java.util.Scanner;
class Person{

    private String name;
    private String DOB;
    Person(){

        name="";
        DOB="";

    }
    Person(String name, String DOB){

        this.name=name;
        this.DOB=DOB;
    }

    String getName() {
        return name;
    }
    String getDOB(){
        return DOB;
    }

}

class Graduate extends Person {


    private double GPA;
    private int YOG;


    Graduate() {
        super();


        GPA = 0.0;
        YOG = 0;
    }

    Graduate(String name, String DOB, double GPA, int YOG) {
        super(name, DOB);

        this.GPA = GPA;
        this.YOG = YOG;
    }

    double getGPA() {
        return GPA;
    }

    int getYOG() {
        return YOG;
    }
}


class Q_3inh{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the name: ");
        String name=sc.nextLine();
        System.out.println("Enter the DOB: ");
        String DOB=sc.nextLine();
        System.out.println("Enter the GPA");
        double GPA=sc.nextDouble();
        System.out.println("Enter the Year of Graduation");
        int YOG=sc.nextInt();
        Graduate grad=new Graduate(name, DOB, GPA, YOG);

        System.out.println("Graduation details: ");
        System.out.println("Name: "+grad.getName());
        System.out.println("DOB: "+grad.getDOB());
        System.out.println("GPA: "+grad.getGPA());
        System.out.println("Year of Graduation: "+grad.getYOG());


    }
}