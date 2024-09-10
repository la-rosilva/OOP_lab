import myPackages.p1.Maximum;
import java.util.Scanner;

class Maximum_Demo{
	public static void main(String[] args){
		Maximum m=new Maximum();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value a,b and c (integers): ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		System.out.println("The maximum integer is: "+m.max(a,b,c));

		System.out.println("Enter the value of a,b and c(Float)");
		float a1=sc.nextFloat();
		float b1=sc.nextFloat();
		float c1=sc.nextFloat();
		System.out.println("The maximum floating point number is: "+m.max(a1,b1,c1));

		System.out.println("Enter the number of elements in the matrix: ");
		int num;
		num=sc.nextInt();
		int []arr=new int[num];
		System.out.println("Enter the elemnts in the array: ");   
		for(int i=0; i<num;i++){
			arr[i]=sc.nextInt();

		}
		System.out.println("The maximum element in the array is: "+m.max(arr));


		System.out.println("Enter the number of rows in the matrix: ");
		System.out.println("Enter the number of columns in the Matrix: ");
		int rows, cols;
		rows=sc.nextInt();
		cols=sc.nextInt();
		int[][] matrix=new int[rows][cols];
		System.out.println("Enter the elements in the matrix: ");
		for(int i=0; i<rows;i++){
			for(int j=0; j<cols;j++){
				matrix[i][j]=sc.nextInt();

			}
		}
		System.out.println("The maximum element in the matrix is: "+m.max(matrix));



	}
}