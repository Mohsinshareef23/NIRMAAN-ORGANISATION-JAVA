package day4;

import java.util.Scanner;

public class ForLoop {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Values:");
	int value = sc.nextInt();
	for(int i = value;i>=10;i--){
		System.out.println(i);
	}
}
}

