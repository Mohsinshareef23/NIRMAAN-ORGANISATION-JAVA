package day5;

import java.util.Scanner;
public class CalculatorUsingWhileLoop {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	while(true) {
		
		System.out.println("Enter your choice:");
		System.out.println("1 For Addition:");
		System.out.println("2 For Subtraction:");
		System.out.println("3 For Multipliccation");
		System.out.println("4 For Division");
		System.out.println("5 For modulus");
		System.out.println("6 For End");
		int num = sc.nextInt();
		
	System.out.println("Enter first Number:");
	int fnum = sc.nextInt();
	System.out.println("Enter second Number:");
	int snum = sc.nextInt();
	
	if(num==1) {
		System.out.println("Addition:"+(fnum+snum));
	}else if(num==2) {
	System.out.println("Subtraction:"+(fnum-snum));
	}else if(num==3) {
		System.out.println("Multiplication:"+(fnum*snum));
	}else if(num==4) {
		System.out.println("Divison:"+(fnum/snum));
	}else if(num==5) {
		System.out.println("modulus:"+(fnum%snum));
	} else {
		System.out.println("Thank You");
		break;
	}
}
}
}