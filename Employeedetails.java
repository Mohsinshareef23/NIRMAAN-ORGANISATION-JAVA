package Oops;

public class Employeedetails {
	String name;
	long phone;
	float salary ;
	public static void main(String[] args) {
		
		Employeedetails Ed = new Employeedetails();
		Ed.name ="mohsin";
		Ed.phone = 7010774256L;
		Ed.salary =50.000F;
		
				System.out.println("Employee1 Name:"+(Ed.name));
				System.out.println("Employee1 Phone No:"+(Ed.phone));
				System.out.println("Employee1 Salary:"+(Ed.salary));
				
				Employeedetails Ed2 = new Employeedetails();
				Ed2.name ="Shareef";
				Ed2.phone =7010774256L;
				Ed2.salary =50.000F;
				
				System.out.println("Employee2 Name:"+(Ed2.name));
				System.out.println("Employee2 Phone No:"+(Ed2.phone));
				System.out.println("Employee2 Salary:"+(Ed2.salary));
				
				Employeedetails Ed3 = new Employeedetails();
				Ed3.name ="mansoor";
				Ed3.phone =8807825248L;
				Ed3.salary =40.000F;
				

				System.out.println("Employee3 Name:"+(Ed3.name));
				System.out.println("Employee3 Phone No:"+(Ed3.phone));
				System.out.println("Employee3 Salary:"+(Ed3.salary));
				
				Employeedetails Ed4 = new Employeedetails();
				
				Ed4.name ="Adnan";
				Ed4.phone =999888661L;
				Ed4.salary =30.000F;
				

				System.out.println("Employee4 Name:"+(Ed4.name));
				System.out.println("Employee4 Phone No:"+(Ed4.phone));
				System.out.println("Employee4 Salary:"+(Ed4.salary));
				
				Employeedetails Ed5 = new Employeedetails();
				Ed5.name ="Nowmaan";
				Ed5.phone =8888999955L;
				Ed5.salary =35.000F;
				
				System.out.println("Employee5 Name:"+(Ed5.name));
				System.out.println("Employee5 Phone No:"+(Ed5.phone));
				System.out.println("Employee5 Salary:"+(Ed5.salary));
	}

}
