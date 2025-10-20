import java.util.Scanner;

public class ReversedNumber {
    
  
   
    	  public static void main(String[] args) {
    	        Scanner sc = new Scanner(System.in);

    	        System.out.print("Enter a number: ");
    	        int n = sc.nextInt();

    	        int revs = 0;
    	        int temp = n;

    	        while (temp > 0) {
    	            int digit = temp % 10;          // find last digit
    	            revs = revs* 10 + digit;        // Add digit to reversed number
    	            temp /= 10;                     // Remove last digit
    	        }

    	        System.out.println("Reversed of " + n + " is " + revs);
    	    }
    }