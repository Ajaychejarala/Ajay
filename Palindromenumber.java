package java_tasks;

//it will remains same when in both sides ex:- akka

import java.util.Scanner;
public class Palindromenumber  { 

    public static void main(String args[]) // execution starts from main method it is a static Because is only one
    {
	 Scanner in = new Scanner(System.in);
     System.out.print("Input a number: ");
     int n = in.nextInt();
     int sum = 0, r;
	 int temp = n;    
     while(n>0) 
	   {    
        r = n % 10;   
        sum = (sum*10)+r;    
        n = n/10;    
       }    
      if(temp==sum)    
        System.out.println("It is a Palindrome number.");    
      else    
        System.out.println("Not a palindrome");    
     }  
}