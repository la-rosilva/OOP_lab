import com.course.structure.Building;
import com.course.structure.School;
import com.course.structure.House;
import java.util.Scanner;
class Building_packmain{

    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the square footage of buildings");
        double sf=sc.nextDouble();


        System.out.println("Enter the number of stories: ");
        int st=sc.nextInt();

        System.out.println("Enter the number of bedrooms: ");
        int bed=sc.nextInt();
        System.out.println("Enter the number of baths: ");
        int bath=sc.nextInt();
        System.out.println("Enter the number of Classrooms: ");
        int c=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the grade level: ");
        String grade=sc.nextLine();
        Building b=new Building(sf,st);
        House h=new House(sf,st,bed,bath);
        School s=new School(sf,st,bed,bath, c, grade);
        System.out.println("The square footage is: "+b.getSquareFootage());
        System.out.println("The number of stories are: "+b.getstories());
        System.out.println("The number of bedrooms are: "+h.getbedrooms());
        System.out.println("The number of baths are: "+h.getbaths());
        System.out.println("The number of Classrooms are: "+s.classrooms);
        System.out.println("The grade level is: "+s.grade_level);
        System.out.println("\n--- Modifying values using setters ---");

        System.out.println("Enter the updated number of stories: ");
        int newStories = sc.nextInt();
        b.setStories(newStories);

        System.out.println("Enter the updated number of bedrooms: ");
        int newBedrooms = sc.nextInt();
        h.setbedrooms(newBedrooms);

        System.out.println("Updated number of stories: " + b.getStories());
        System.out.println("Updated number of bedrooms: " + h.getbedrooms());









    }


}