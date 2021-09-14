package java_tasks;

/*153 ---> 1 5 3
 * 1*1*1 + 5*5*5 + 3*3*3
 *  1 + 125 + 27
 *    153 
 *  Armstrong number is a to sum of cubes of digits of given number is equal to original number.
 */

public class Armstrong {
	public static void main(String[] args) { // execution starts from main method it is a static Because is only one

	        int num = 153, number, temp, total = 0;

	        number = num;
	        while (number != 0)
	        {
	            temp = number % 10;
	            total = total + temp*temp*temp;
	            number /= 10;
	        }

	        if(total == num)
	            System.out.println(num + " is an Armstrong number");
	        else
	            System.out.println(num + " is not an Armstrong number");
	    }
	}
