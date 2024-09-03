import java.util.Scanner;
class emp{
	String Ename;
	int Eid;
	double Basic;
	double DA;
	double Gross_Sal;
	double Net_Sal;


	emp(){
		System.out.println("Inside the default constructor");
		Ename="";
		Eid=0;
		Basic=0.0;

	}
	emp(String Ename,int Eid,double Basic){
		System.out.println("Inside the parameterised Constructor");
		this.Ename=Ename;
		this.Eid=Eid;
		this.Basic=Basic;

	}

	

    void compute_net_sal(){
    	DA=0.52*Basic;
    	Gross_Sal=Basic+DA;
    	double IT=0.3*Gross_Sal;
    	Net_Sal=Gross_Sal-IT;

    }

    void Display(){
    	System.out.println("Name:"+Ename);
    	System.out.println("ID:"+Eid);
    	System.out.println("Basic Salary:"+Basic);
    	System.out.println("DA:"+DA);
    	
    	System.out.println("Gross Salary:"+Gross_Sal);
    	System.out.println("Net Salary:"+Net_Sal);
    }


}

class FullTimeEmp extends emp{
	double bonus;
	double deduction;
	double NetSalary;
	FullTimeEmp(String Ename, int Eid,double Basic){
		super(Ename, Eid,Basic);
		this.bonus=bonus;
		this.deduction=deduction;
	}
	void compute_net_sal(){
		NetSalary=super.Net_Sal+bonus-deduction;
	}
	void Display(){
		System.out.println("Name:"+Ename);
    	System.out.println("ID:"+Eid);
    	System.out.println("Basic Salary:"+Basic);
    	System.out.println("DA:"+DA);
    	
    	System.out.println("Gross Salary:"+Gross_Sal);
    	System.out.println("Net Salary:"+NetSalary);
	}
	
}
class PartTimeEmp extends emp{
	int hoursWorked;
	double NetSal;
	final static double hourlyRate=80;

	PartTimeEmp(String Ename, int Eid,int hoursWroked){
		super(Ename, Eid,Basic);
		this.hoursWorked=hoursWorked;
	}
	void compute_net_sal(){
		NetSal=super.Net_Sal+(hoursWorked*hourlyRate);
	}

		void Display(){
		System.out.println("Name:"+Ename);
    	System.out.println("ID:"+Eid);
   
    	System.out.println("Hours worked: "+hoursWorked);
    	System.out.println("Hourly Rate: "+hourlyRate);
    	System.out.println("Net Salary:"+NetSal);

	}

	}






class EmployeeInherit{
	public static void main(String args[]){
		int N,i,j;
		Scanner sc=new Scanner(System.in);
		EMPLOYEE employeee=new EMPLOYEE();
		employeee.Display();
		
		int Eid;
		double Basic;
		//Full time Employee
		
		System.out.println("Enter the name:");
		String Ename=sc.nextLine();
        System.out.println("Enter the Employee ID: ");
		Eid=sc.nextInt();
		System.out.println("Enter the Basic salary: ");
		Basic=sc.nextInt();
		FullTimeEmployee emp1=new FullTimeEmployee(Ename,Eid,Basic);
		emp1.compute_net_sal();
		emp1.Display();

		//Part time Employee
		System.out.println("Enter the name:");
		String Ename_part=sc.nextLine();
        System.out.println("Enter the Employee ID: ");
		Eid_part=sc.nextInt();
		System.out.println("Enter the number of hours worked: ");
		int hours=sc.nextInt();
		PartTimeEmployee emp2=new PartTimeEmployee(Ename_part,Eid_part,hours);
		emp2.compute_net_sal();
		emp2.Display();

			



	

}
		}