import java.util.*;
public class Loop {
    
        // int counter =0;
        // while(counter <100){
        //     System.out.println("hello world");
        //     counter++;
        // }
        // System.out.println("prated hello world 100 times");

        // print number 1 to 10
        // int number = 1;
        // while(number<=10){
        //     System.out.println(number);
        //     number++;
        // }
        // System.out.println("1 to 10 number printed");

        // print a number 1 to n 
        // Scanner sc = new Scanner(System.in);
        // int range = sc.nextInt();
        // int counter = 1;
        // while(counter <= range){
        //     System.out.print(counter + " ");
        //     counter ++;
        // }
        // System.out.println();

        // sum of n natural number 
//         Scanner sc = new Scanner(System.in);
//         int n= sc.nextInt();
//         int sum = 0;
//         int i = 1;
        
//         while( i<= n){
//             sum += i;
//    i++;
//         }
//         System.out.println(sum);

   // Print square pattern using while loop
//    int i = 1;
//    while(i<=4){
//     System.out.println("****");
//     i++;
//    }
           

    //   For  loop

    // for(int i =1; i<=10; i++){
    //     System.out.println("hello world");
    // }

    // for(int i =1; i<=4; i++){
    //     System.out.println("****");
    // }

    //Print Reverse of a number using for loop
    // for(int i=10; i>=0; i--){
    //     System.out.println(i);
    // }

    //Print Reverse of a number using for loop 10899
    //  int n = 10899;
    //  while (n > 0){
    //     int lastDigit = n% 10;
    //     System.out.print(lastDigit);
    //     n=n/10;
    //  }
    //  System.out.println();

    // Reverse the given number 
    // int n = 10899;
    // int rev = 0;
    // while(n>0){
    //    int lastDigit = n%10;
    //     n = n/10;
    //   rev = (rev*10)+lastDigit;  
    
    // }
    // System.out.println(rev);

    // Do While loop

    // int counter = 1;
    // do{
    //     System.out.println("Hello world");
    //     counter++;
    // }while(counter<=10);

    // break statement
    // for(int i=1; i<=5; i++){
    //     if(i == 3){
    //         break;
    //     }
    //     System.out.println(i);
    // }
    // System.out.println("out of range ");

    // Scanner sc = new Scanner(System.in);
    // do{
    //     System.out.print("enter your number");
    //     int n = sc.nextInt();
    //     if(n % 10 == 0){
    //         break;
    //     }
    //     System.out.println(n);
    // }while(true);

    // Continue statement
    // for(int i=1; i<=5; i++){
    //     if(i == 3){
    //         continue;
    //     }
    //     System.out.println(i);
    // }
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();

// if(n==2){
//     System.out.println(" n is prime ");
// }else{
//     boolean isPrime = true;
//     for(int i=2; i<=Math.sqrt(n); i++){
//         if(n % i == 0){
//             isPrime = false;
//         }
//     }
//     if(isPrime == true){
//         System.out.println("n is prime");
//     }else{
//         System.out.println(" n is not prime ");
//     }
// }
 

    // lOOp Question 
    // for(int i=0; i<5; i++){
    //     System.out.println("hello");
    //     i+=2;
    // }

    // Second question 
    // Scanner sc = new Scanner(System.in);

    //     int number;
    //     int choice;
    //     int evenSum = 0;
    //     int oddSum = 0;

    //     do {
    //         System.out.print("Enter the number: ");
    //         number = sc.nextInt();

    //         if (number % 2 == 0) {
    //             evenSum += number;
    //         } else {
    //             oddSum += number;
    //         }
    //         System.out.print("Do you want to continue? Press 1 for yes or 0 for no: ");
    //         choice = sc.nextInt();

    //     } while (choice == 1);

    //     System.out.println("Sum of even numbers: " + evenSum);
    //     System.out.println("Sum of odd numbers: " + oddSum);


    // Question three 
//     Scanner sc = new Scanner(System.in);
//     int num ;
//     int fact = 1;

//     System.out.print("Enter any Positive integer:");
//     num = sc.nextInt();

//     for(int i=1; i<=num; i++){
//         fact *= i;
//     }
// System.out.println("Factorial : " + fact);


    // Question 4
    public static void printMultiplicationTable(int number){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number :");
        int n = sc.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(n + " * " + i+ "="+n*i);
        }
    }
public static void main(String[] args) {
    printMultiplicationTable(5);
    }
}
