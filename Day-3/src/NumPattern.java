import java.util.Scanner;
public class NumPattern {
    public static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println(); 
        }
    }
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = scanner.nextInt();
        pattern(n);   
     
    }
}
