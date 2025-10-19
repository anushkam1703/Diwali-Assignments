import java.util.Scanner;

public class Fibonacci {

    public static void Fib(int num) {
        int a = 0;
        int b = 1;
        int sum;

        System.out.print("Fibonacci series : ");

        for (int i = 1; i <= num; i++) {
            System.out.print(a+"  ");
            sum = a + b;
            a = b;
            b = sum;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        Fib(n);
    }
}
