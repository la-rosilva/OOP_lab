import java.util.Scanner;
class stud{
	String sname;
	int [] marks_array;
	int total;
	double avg;
	
	stud(){
		System.out.println("Inside the default constructor:");
		sname="";
		marks_array=new int[0];
		total=0;
		avg=0.0;
	}
	stud(String sname, int marks_array[]){
		System.out.println("Inside the parameterised constructor:");
		this.sname=sname;
		this.marks_array=marks_array;

	}
	void compute(){
		total=0;
		int count=0;
		for(int m:marks_array){
			total+=m;
			count++;
		}
		avg=(double)total/count;
	}

	void display(){
	System.out.println("Name: "+sname);
	System.out.println("Marks: ");
	for(int k:marks_array){
		System.out.println(k);
	}
	System.out.println("Total: "+total);
	System.out.println("Average: "+avg);


	}
}

	class ScienceStudent extends stud{
		private int Practical_marks;
		ScienceStudent(String name, int marks_array[],int Practical_marks){
		super(name,marks_array);
		this.Practical_marks=Practical_marks;}


		void compute(){
			int total_marks=Practical_marks+super.total;
			double average=total_marks/4;

		}
		void DisplayPracticalMarks(int Pract){
			System.out.println("The Practical marks is:"+Practical_marks);
		}


	}
	class ArtsStudent extends stud{
		private String electiveSubject;
		ArtsStudent(String name, int marks_array[], String electiveSubject){
		super(name, marks_array);
		this.electiveSubject=electiveSubject;}

	
	void DisplayElective(String elective){
		System.out.println("The elective Subject is: "+electiveSubject);
	}


}

class StudentInherit{
	public static void main(String args[]){
		int N,i,j;
		Scanner sc=new Scanner(System.in);
		stud student=new stud();
		student.display();
		

			//Student
			System.out.println("Enter the name: ");
			String name=sc.nextLine();
			System.out.println("Enter the number of subjects: ");
	        int sub=sc.nextInt();
            int [] marks=new int[sub];
			for(j=0; j<sub;j++){
				System.out.println("Enter the marks for subject"+(j+1));
				marks[j]=sc.nextInt();
			}
			stud student1=new stud(name,marks);
			student1.compute();
			student1.display();
			System.out.println();

           //Science Student
			System.out.println("Enter the name: ");
			String name_sci=sc.nextLine();
			System.out.println("Enter the number of subjects: ");
	        int sub_sci=sc.nextInt();
            int [] marks_sci=new int[sub_sci];
			for(j=0; j<sub_sci;j++){
				System.out.println("Enter the marks for subject"+(j+1));
				marks_sci[j]=sc.nextInt();
			}
			System.out.println("Enter the practical Exam marks");
			int practical=sc.nextInt();
			ScienceStudent student2=new ScienceStudent(name_sci,marks_sci,practical);
			stud ref=student2;
			
			ref.compute();
			ref.display();
		
			ref.DisplayPracticalMarks(practical);
		



		   //Arts student
			System.out.println("Enter the name: ");
			String name_arts=sc.nextLine();
			System.out.println("Enter the number of subjects: ");
	        int sub_arts=sc.nextInt();
            int [] marks_arts=new int[sub_arts];
			for(j=0; j<sub_arts;j++){
				System.out.println("Enter the marks for subject"+(j+1));
				marks_arts[j]=sc.nextInt();
			}
			System.out.println("Enter the Elective subject");
			String elective=sc.nextLine();
			 ArtsStudent student3=new ArtsStudent(name_arts,marks_arts,elective);

			ref=student3;
			ref.compute();
			ref.display();
			
			ref.DisplayElective(elective);
	      


		
		


			// students[i]=new STUDENT(name,marks);
			// students[i].compute();




			}
			// for(STUDENT stud:students){
			// 	stud.display();
			// 	System.out.println();

			// }

}
		
