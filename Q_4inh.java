import java.util.Scanner;

class Building {
    private double square_footage;
    private int stories;
    Building(double sf, int st){
        square_footage=sf;
        stories=st;
    }
    int getStories(){
        return stories;
    }
    double getSquareFootage(){
        return square_footage;
    }
    int getstories(){
        return stories;
    }
    void setStories(int st){
        stories=st;
    }

}
class  House extends Building{

    House(double square_footage, int stories, int bedrooms, int baths) {
        super(square_footage, stories);
        this.bedrooms=bedrooms;
        this.baths=baths;
    }
    private int bedrooms;
    private int baths;

    int getbedrooms(){
        return bedrooms;

    }
   void setbedrooms(int x){
        bedrooms=x;
        
   }
   int getbaths(){
        return baths;
   }
   void setbaths(int x){
        baths=x;
   }


}
class School extends Building {
    School(double square_footage, int stories, int bedrooms, int baths, int classrooms, String grade_level){
        super(square_footage,stories);
        this.classrooms=classrooms;
        this.grade_level=grade_level;

    }
    int classrooms;
    String grade_level;

}


class Q_4inh{
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
        Building obj=new Building(sf,st);
        House obj1=new House(sf,st,bed,bath);
        School obj2=new School(sf,st,bed,bath,c,grade);
        System.out.println("The square footage is: "+obj.getSquareFootage());
        System.out.println("The number of stories are: "+obj.getstories());
        System.out.println("The number of bedrooms are: "+obj1.getbedrooms());
        System.out.println("The number of baths are: "+obj1.getbaths());
        System.out.println("The number of Classrooms are: "+obj2.classrooms);
        System.out.println("The grade level is: "+obj2.grade_level);
        System.out.println("\n--- Modifying values using setters ---");

        System.out.println("Enter the updated number of stories: ");
        int newStories = sc.nextInt();
        obj1.setStories(newStories);

        System.out.println("Enter the updated number of bedrooms: ");
        int newBedrooms = sc.nextInt();
        obj1.setbedrooms(newBedrooms);

        System.out.println("Updated number of stories: " + obj1.getStories());
        System.out.println("Updated number of bedrooms: " + obj1.getbedrooms());









    }


}