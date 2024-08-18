import java.util.*;

public class Function {

    public static void printHelloWorld() {
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("Hello world");
    }

    public static void calculateSum() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("sum is : " + sum);
    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static int binCoefficient(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n - r);

        return fact_n / (fact_r * fact_nmr);
    }

    // function to calculate integer sum
    public static int sum(int a, int b) {
        return a + b;
    }

    // function to calculate float sum
    public static float sum(float a, float b) {
        return a + b;
    }

    // check if a number is prime or not 
    public static boolean isPrime(int n) {
        boolean isPrime = true;
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    // print all primes in a range
    public static void primeInRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    public static void  binToDec(int binNum){
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;

        while(binNum > 0){
            int lastDigit = binNum % 10;
            decNum = decNum +(lastDigit * (int) Math.pow(2,pow));
            pow++;
            binNum = binNum/10;
        }
        System.out.println(" decimal of " + myNum + " = " + decNum);
    }

    public static void decToBin(int n){
        int myNum = n;
        int pow = 0;
        int binNum = 0;

        while(n>0){
            int rem = n% 2;
            binNum = binNum + (rem * (int) Math.pow(10 , pow));

            pow++;
            n=n/2;
        }
        System.out.println("binary form of " + myNum + " = "+ binNum);
    }

    public static void main(String[] args) {
        // Uncomment the methods to test them

        // printHelloWorld();

        // calculateSum();

        // int a = 5;
        // int b = 10;
        // swap(a, b);

        // int a = 3;
        // int b = 5;
        // int prod = multiply(a, b);
        // System.out.println(prod);

        // factorial of n 
        // System.out.println(factorial(4));

        // binomial coefficient
        // System.out.println(binCoefficient(5, 2));

        // sum of integers
        // System.out.println(sum(3, 6));

        // sum of floats
        // System.out.println(sum(3.5f, 4.5f));

        // check if a number is prime
        // System.out.println(isPrime(5));

        // print primes in a range
        // primeInRange(16);
        // binToDec(101);
        decToBin(7);
    }
}
