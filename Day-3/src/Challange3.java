import java.util.Scanner;

public class Challange3{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the num : ");
        int n = scanner.nextInt();
        int[] num = new int[n];
        System.out.println("Enter numbers for finding missing :");
        for (int i = 0; i < n; i++) {
            num[i] = scanner.nextInt();
        }
        int exp = n * (n + 1) / 2;
        int actual = 0;
        for (int i = 0; i < n; i++) {
            actual = actual + num[i];
        }
        int missingno = exp - actual;
        System.out.println("The missing number is: " + missingno);
    }
}
