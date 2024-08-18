public class PassFail {
    public static void main(String[] args) {
        int marks = 67;
        // if(marks >= 33){
        //     System.out.println("Pass");
        // }
        // else if(marks < 33){
        //     System.out.println("Fail");
        // }
        // else{
        //     System.out.println("not attend exam");
        // }
        String status = marks >= 33 ? "PASS" : " FAIL";
        System.out.println(status);

    }
    
}
