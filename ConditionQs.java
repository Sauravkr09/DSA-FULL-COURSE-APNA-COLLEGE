import java.util.*;
public class ConditionQs {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int x = sc.nextInt();

        // if(x> 0){
        //     System.out.println(" x is greater than 0");
        // }else{
        //     System.out.println("x is less than or equal 0");
        // }
        // double temp = 103.5;
        // if(temp > 100){
        //     System.out.println("you have a fever");
        // }else{
        //     System.out.println("you don't have a fever");
        // }

        // week (1-7)
        // Scanner sc = new Scanner (System.in);
        // System.out.println(" Enter week number (1-7)");
        // int week = sc.nextInt();

        // switch(week){
        //     case 1: 
        //     System.out.println("Monday");
        //     break;
        //     case 2: 
        //     System.out.println("Tuesday");
        //     break;
        //     case 3: 
        //     System.out.println("Wednesday");
        //     break;
        //     case 4: 
        //     System.out.println("Thursday");
        //     break;
        //     case 5: 
        //     System.out.println("Friday");
        //     break;
        //     case 6: 
        //     System.out.println("Saturday");
        //     break;
        //     case 7: 
        //     System.out.println("Sunday");
        //     break;
        //     default:
        //     System.out.println("invalid input ! week enter between (1-7)");
        // }
        // Qs 4 
        // int a = 63, b = 36;
        // boolean x = (a<b) ? true : false;
        // int y = (a>b) ? a : b;
        // System.out.println(x);
        // System.out.println(y);

        // leap year
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the year: ");
        int year = sc.nextInt();

        boolean x = (year % 4) == 0;
        boolean y = (year % 100) != 0;
        boolean z = ((year % 100 == 0) && (year % 400 == 0));

        if(x && (y || z)){
            System.out.println(year + " is a leap year");

        }else {
            System.out.println(year + " is not a leap year");
        }
        
    }
    
}
