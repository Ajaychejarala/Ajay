package java_tasks;

import java.util.Scanner;

public class Checkprime
{
    public static void main(String args[]) // execution starts from main method it is a static Because is only one
    {
        int num, i, count=0;
        Scanner scan = new Scanner(System.in); //to read input during run tym 
      
        System.out.print("Enter a Number : ");
        num = scan.nextInt();
      
        for(i=2; i<num; i++) 
        {
            if(num%i == 0)
            {
                count++;
                break;
            }
        }
        if(count == 0)
        {
            System.out.print("This is a Prime Number");
        }
        else
        {
            System.out.print("This is not a Prime Number okay");
        }
    }
}