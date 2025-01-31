package day2;

import java.util.Scanner;

public class ExamGrade {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter  Your Marks:");
	int marks= sc.nextInt();
	 if (marks>=35 && marks<=100) {
		  System.out.println("pass");
	 }if (marks>=90 && marks<=100) {
		System.out.println("grade O");
	} else if (marks>=80 && marks<=89) {
		System.out.println("grade A");
	} else if (marks>=70 && marks<79) {
		System.out.println("grade B");
	} else if (marks>=60 && marks<69) {
		System.out.println("grade C");	
	} else if (marks>=50 && marks<59) {
		System.out.println("grade D");
	} else if (marks>=40 && marks<49) {
		System.out.println("grade E");
	} else if (marks>=35 && marks<39) {
		System.out.println("grade F");
	}else if ((marks<0)||(marks>100)) {
		System.out.println("Invalid Marks");
	} else  {
		System.out.println("fail");
	
}
}
}