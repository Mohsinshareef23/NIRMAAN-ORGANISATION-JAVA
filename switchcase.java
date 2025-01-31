package day3;

import java.util.Scanner;

public class switchcase {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter your choice");
	int num = sc.nextInt();
	 switch(num) {
	 case 1: System.out.println("yes");
	 break;
	 case 2: System.out.println("no");
	 break;
	 }
}
}
