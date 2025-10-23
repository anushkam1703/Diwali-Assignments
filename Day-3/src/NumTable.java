import java.util.Scanner;
public class NumTable{

    public static void Table(int num) {
        System.out.println("Table of number is :");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        Table(n);
    }
}
