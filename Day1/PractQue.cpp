#include <iostream>
using namespace std;

// Q1. Check number is prime or Not Prime
bool checkPrime(int n) {

    if (n <= 1) {
        return false;
    }
        
    for (int i = 2; i * i <= n; i++)
     {
        if (n % i == 0) 
        return false;
    }
    return true;
}

// Q2. prime numbers up to given number
void allPrimes(int n) {

    cout << "all Prime numbers up to " << n << ": ";
    for (int i = 2; i <= n; i++) {
        if (checkPrime(i)) {
            cout << i << " ";
        }
    }
    cout << endl;
}

// Q3. Factorial of number
long factorial(int n) {
    long fact = 1;

    for (int i = 1; i <= n; i++) {
        fact *= i;
    }
    return fact;
}

//  Q4.Fibonacci Series
void fibonacci(int n) {
    long a = 0, b = 1, c;
    cout << "Fibonacci Series: ";
    if (n >= 1) {
        cout << a << " ";
    }
    if (n >= 2) {
        cout << b << " ";
    }
    for (int i = 3; i <= n; i++) {
        c = a + b;
        cout << c << " ";
        a = b;
        b = c;
    }
    cout << endl;
}

//  Q5.Even or Odd
void evenOdd(int n) {
    if (n % 2 == 0) {
        cout << "Even number" << endl;
    } else {
        cout << "Odd number" << endl;
    }
}



int main() {
    int choice, n;


    do {
        
        cout << "1. Check number is  Prime or not\n";
        cout << "2. Prime numbers up to n\n";
        cout << "3. Factorial of n\n";
        cout << "4. Fibonacci Series\n";
        cout << "5. Check number is Even or Odd number\n";
        cout << "6. Exit\n";

        cout << "Enter choice: ";
        cin >> choice;

        if (choice == 6) 
        break;

        cout << "Enter number: ";
        cin >> n;

        switch (choice) {
            case 1:
                if (checkPrime(n)) {
                 cout << "no is Prime" << endl;
                } else {
                 cout << "no is Not Prime" << endl;
                }

                break;

            case 2:
                allPrimes(n);
                break;

            case 3:
                cout << "Factorial = " << factorial(n) << endl;
                break;

            case 4:
                fibonacci(n);
                break;

            case 5:
                evenOdd(n);
                break;

            default:
                cout << "Invalid choice!" << endl;
        }

      
    } while (choice != 6);

    return 0;
}
