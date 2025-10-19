import java.util.Scanner;

public class OddAndEven {
	public static void OddEven(int num) {
			if(num % 2 == 0) {
				System.out.println(" Even");
			}
			else {
				System.out.println(" odd");
			}
		}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		OddEven(n);
		
	}

}
