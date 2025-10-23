import java.util.Scanner;
public class Addition{
    public static int Add(int a,int b){
        return a + b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first num (a): ");
        int a = sc.nextInt();
        System.out.print("Enter second num (b): ");
        int b = sc.nextInt();

        int sum = Add(a, b);
        System.out.println("The sum  is: " + sum);

    }
}
    