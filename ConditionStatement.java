import java.util.*;
public class ConditionStatement {
    public static void main(String[] args) {
        // int age = 16;
        // if(age >= 18){
        //     System.out.println("you are drive the car");
        // }
        // if(age > 13 && age < 18){
        //     System.out.println("teenager");
        // }
        // else{
        //     System.out.println("you can not drive car");
        // }

        int age = 23;

        if(age >= 18){
            System.out.println("adult");
        }
        else if (age >= 13 && age < 18){
            System.out.println("teenager");
        }
        else{
            System.out.println("child");
        }
    }
}
