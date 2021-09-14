package java_tasks;

import java.util.Scanner;

public class Perfectnumber {
	public static void main(String arg[])	 // execution starts from main method it is a static Because is only one
		{
		    long n,sum=0;
	             	    Scanner sc=new Scanner(System.in);	   	 
		    System.out.println("Enter a number");
	                   n=sc.nextLong();
		    int i=1;
		    while(i<=n/2)
		    {
		       if(n%i==0) 
		       {
			sum+=i;
		       }
		      i++;
		    }
		if(sum==n)
		{
		System.out.println(n+" is a perfect number");
	               } 
		else
		System.out.println(n+" is not a  perfect number"); 
		}
	}
