package java_tasks;

 public class Reversenumber {
  
 	public static void main(String[] args)    // execution starts from main method it is a static Because is only one
 	{  
 	int number = 9949, reverse = 0;  
 	while(number != 0)   
 	{  
 	int remainder = number % 10;  
 	reverse = reverse * 10 + remainder;  
 	number = number/10;  
 	}  
 	System.out.println("The reverse of the input number is: " + reverse);  
 	}  
 	}










