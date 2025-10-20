import java.util.Scanner;

public class CheckPalindromeNo {
    
  
    public static boolean isPalindrome(int num) {
        int og = num;
        int revs= 0;

        while (num > 0) {
            int lastDigit = num % 10;
            revs= revs * 10 + lastDigit;
            num =num/ 10;
        }

        return og == revs;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        if (isPalindrome(n)) {
            System.out.println(n + " is a Palindrome.");
        } else {
            System.out.println(n + " is not a Palindrome.");
        }
    }
}
