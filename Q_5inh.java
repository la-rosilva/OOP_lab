import java.util.Scanner;

abstract class figure {
    double dim1;
    double dim2;

    figure(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }


    abstract double area();
}
class Rectanglee extends figure{
    Rectanglee(double dim1, double dim2){
        super(dim1,dim2);


    }
    double area(){
        return dim1*dim2;
    }
}

class square extends figure{
    square(double dim1, double dim2){
        super(dim1,dim2);

    }
    double area(){
        return dim1*dim2;

    }
}

class Triangle extends figure{
    Triangle(double base, double height){
        super(base, height);
    }
    double area(){
        return 0.5*dim1*dim2;
    }
}


class Q_5ing{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length and breadth of the rectangle: ");
        double lenr,breadthr;
        lenr=sc.nextDouble();
        breadthr=sc.nextDouble();
        System.out.println("Enter the length of the square: ");
        double lens=sc.nextDouble();
        System.out.println("Enter the height and base length of the triangle: ");
        double height=sc.nextDouble();
        double base=sc.nextDouble();
        Rectanglee obj1=new Rectanglee(lenr,breadthr);
        square obj2=new square(lens,lens);
        Triangle obj3=new Triangle(base,height);
        figure fig;
        fig=obj1;
        System.out.println("The area of the rectangle is: "+fig.area());
        fig=obj2;
        System.out.println("The area of the square is: "+fig.area());
        fig=obj3;
        System.out.println("The area of the triangle is: "+fig.area());


    }
}