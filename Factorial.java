package java_tasks;

public class Factorial {
	

	public static void main (String[] args) { // execution starts from main method it is a static Because is only one
		int i, fact=1;
		int number =5;
		for (i=1;i<=number;i++) {
			fact = fact*i;
		}
		System.out.println("the factorial of number " +number+ " is " +fact);
	}
	}
