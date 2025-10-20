import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int og = n;
        
        int sum = 0;

        // Count Total digits in number
        int totalDigits = 0, temp = n;
        while (temp > 0) {
            totalDigits++;
            temp /= 10;
        }

        // Calculate sum of powers
        temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, totalDigits); 
            temp =temp/ 10;
        }

        if (sum == og) {
            System.out.println(og + " is an Armstrong Number.");
        } else {
            System.out.println(og + " is not an Armstrong Number.");
        }
    }
}
