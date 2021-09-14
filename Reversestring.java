package java_tasks;

import java.util.Scanner;
public class Reversestring {
     public static void main(String[] args) { // execution starts from main method it is a static Because is only one
    	 
        Scanner ak = new Scanner(System.in);
        System.out.print("Input a string: ");
        
        char[] letters = ak.nextLine().toCharArray();
        System.out.print("Reverse string: ");
        
        for (int i = letters.length - 1; i >= 0; i--) {
            System.out.print(letters[i]);
            
        }
        System.out.print("\n");
    }
}	
