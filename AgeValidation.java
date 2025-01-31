package day2;

import java.util.Scanner;

public class AgeValidation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Age:");
		int age = sc.nextInt();
		
		if ((age>=18)&&(age<=150)) { //(age>=18&&age<=150) 
			System.out.println("You are Eligible");
		}else if ((1 < age &&  age<18)||(age>151)) {  
		System.out.println("You are Not Eligible");
		} 
		 else {
			    System.out.println("Invalid Age");
		}
		

	}
}
