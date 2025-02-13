package dayunknown2;

import java.util.Scanner;

public class CalcFunctionandVariabale {
int num;
String name;
double salary;
     
     int add(int a,int b,int c) {
    	 return(a+b+c);
   
     }
     int sub(int a,int b,int c) {
    	 return(a-b-c);
   
     }
     int mul(int a,int b,int c) {
    	 return(a*b*c);
   
     }
     int div(int a,int b,int c) {
    	 return(a/b/c);
   
     }
     int modulus(int a,int b,int c) {
    	 return(a%b%c);
   
     }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CalcFunctionandVariabale Cfv = new CalcFunctionandVariabale();
		System.out.println("Enter your first Num:");
		int fnum = sc.nextInt();
		System.out.println("Enter your Second Num:");
		int snum = sc.nextInt();
		System.out.println("Addition:"+Cfv.add(fnum,snum,10));
		System.out.println("Subtraction:"+Cfv.sub(fnum,snum,10));
		System.out.println("Multiplication:"+Cfv.mul(fnum,snum,10));
		System.out.println("Division:"+Cfv.div(fnum,snum,10));
		System.out.println("Modulus:"+Cfv.modulus(fnum,snum,10));
		
		
	}
}
