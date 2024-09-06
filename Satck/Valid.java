import java.util.*;
public class Valid {
    public static boolean isValid(String str){
        Stack<Character> s = new Stack<>();

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if(ch == '(' || ch == '{' || ch == '['){
                s.push(ch);
            } else {
                if(s.isEmpty()){
                    return false;
                }
                if((s.peek() == '(' && ch == ')') || 
                (s.peek() == '{' && ch == '}')
                 || (s.peek() == '[' && ch == ']')){
                    s.pop();
                } else {
                    return false;
                }
            }
        }
        return s.isEmpty();
    }

    public static boolean isDuplicate(String str){
        Stack<Character> s = new Stack<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            //opening ,, operator, operands

            //closing
            if(ch == ')'){
                int count = 0;
                while(s.peek() != '('){
                    s.pop();
                    count++;
                }
                if(count <1){
                    return true;
                }else{
                    s.pop(); //opening pairs
                }
            }else{
                    //opening
                    s.push(ch);

                }
            }
            return false;

        }
    
    public static void main(String[] args) {
        // String str = "({})[]"; // true
        String str = "((a+b))";
        String str2 = "(a-b)";
        System.out.println(isDuplicate(str));
    }
}
