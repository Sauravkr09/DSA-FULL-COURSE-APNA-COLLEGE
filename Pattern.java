public class Pattern {
    public static void main(String [] args){
        // for(int i =1; i<=5; i++){
        //     for(int j =1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // reverse pattern
        // int n =4;
        // for(int i=1; i<=5; i++){
        //     for(int j=1; j<=n-i+1; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // Half Payridmid pattern

        // int n = 5;
        // for(int line=1; line<=n; line++){
        //     for(int number=1; number<=line; number++){
        //         System.out.print(number);
        //     }
        //     System.out.println();
        // }
       
        // CHARACTER print 
        int n = 5;
;
        char ch = 'A';
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print(ch);
                ch++;

            }
            System.out.println();
        }
    }
    
}
