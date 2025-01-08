package day2;

public class arithmeticoperations {
public static void main(String[] args) {
	
	int firstNum = 40;
	int secondNum = 30;
	int thirdNum = 20;
	int fourthNum = 10;
	
	System.out.println("ARITHMETIC OPERATIONS:");
	System.out.println("Addition:"+ (firstNum+secondNum));
	System.out.println("Substraction:"+(firstNum-secondNum));
	System.out.println("Multiplication:"+(firstNum*secondNum));
	System.out.println("division:"+(firstNum/secondNum));
	System.out.println("Modulus:"+(firstNum % secondNum));
	
	System.out.println("RELATIONAL OPERATIONS:");
	System.out.println("is 40 greater than 30:"+(firstNum>secondNum));
	System.out.println("is 40 less than 30:"+(firstNum<secondNum));
	System.out.println("is 30 greather than or equal to 40:"+(firstNum<=secondNum));
	System.out.println("is 30 less than or equal to 40:"+(secondNum>=firstNum));
	System.out.println("is 40 equal to 30:"+(firstNum==secondNum));
	System.out.println("is 40 not equal to 30 :"+(firstNum!=secondNum));
	System.out.println("is 40 equal to equal:"+(firstNum==firstNum));
	
	System.out.println("LOGICAL OPERATIONS:");
	System.out.println((firstNum >secondNum) && (thirdNum<fourthNum));
	System.out.println((firstNum >secondNum) || (thirdNum<fourthNum));
	System.out.println((thirdNum>fourthNum) && (firstNum>secondNum));
	System.out.println((thirdNum <firstNum) || (fourthNum<secondNum));
	
	System.out.println("ASSIGNMENT OPERATIONS:");
	System.out.println("first Number:"+(firstNum));
	System.out.println("second Number:"+(secondNum));
	System.out.println("first Number+20:" +(firstNum+=20));
	System.out.println("second Number-20:"+(secondNum-=20));
	System.out.println("first Number*30:"+(firstNum*=30));
	System.out.println("seond Number/25:"+(secondNum*25));
	
	
	System.out.println("ASSIGNMENT OPERATIONS-2");
	System.out.println("Intial Value:10");
	 fourthNum+=12; System.out.println(fourthNum);
	 fourthNum-=12; System.out.println(fourthNum);
	 fourthNum*=12; System.out.println(fourthNum);
	 fourthNum/=10; System.out.println(fourthNum);
	 fourthNum%=12; System.out.println(fourthNum);
	
	 System.out.println("Unary Operations:");
	System.out.println("IntiaL Value:12");
	int intialvalue = 12;
	
	intialvalue++; System.out.println(intialvalue);
	intialvalue--; System.out.println(intialvalue);
	
	System.out.println("Conditional Operations:"); 
	
	int a = 12;
	int b = 12;
	
	System.out.println("12 is even:"+(a=b));
	
	
	
	
	
	
	
	
	
}
}