import java.util.Scanner;
class Prime{
public static boolean isPrime(int num) {
	if(num <= 1) {
		return false;
	}
	else {
		for(int i = 2; i<= num; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check : ");
        int num = sc.nextInt();    
        
        Prime p1 = new Prime();
        if(p1.isPrime(num)) {
        	System.out.println("The Number is Prime : "+num);
        }
        else {
        	System.out.println("The number is not prime : "+num);
        }
        
    }
}