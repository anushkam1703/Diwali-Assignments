import java.util.Scanner;

public class GeneratePrimes {

    public static boolean CheckPrime(int num) {
        if (num <= 1) {
            return false;
        }
        
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        System.out.println("All prime numbers :");
        for (int i = 2; i < num; i++) {
            if (CheckPrime(i)) {
                System.out.println(i);
            }
        }
    }
}
