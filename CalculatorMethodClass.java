package dayunknown;

import java.util.Scanner;

public class CalculatorMethodClass {
	
	void add(int a,int b) {
		System.out.println(a+b);
	}
	void sub(int a,int b) {
		System.out.println(a-b);
	}
	void mul(int a,int b) {
		System.out.println(a*b);
	}
	void div(int a,int b) {
		System.out.println(a/b);
	}
	void mod(int a,int b) {
		System.out.println(a%b);
	}

	
	public static void main(String[] args) {
		CalculatorMethodClass cmc = new CalculatorMethodClass();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first Number:");
		int fnum=sc.nextInt();
		System.out.println("Enter Second Number:");
		int snum=sc.nextInt();
		System.out.println("Addition:");
		cmc.add(fnum, snum);
		
		System.out.println("Subtraction:");
		cmc.sub(fnum, snum);
		System.out.println("Multiplication:");
		cmc.mul(fnum, snum);
		System.out.println("Division:");
		cmc.div(fnum, snum);
		System.out.println("Modulus:");
		cmc.mod(fnum, snum);
		
		
	}

}
