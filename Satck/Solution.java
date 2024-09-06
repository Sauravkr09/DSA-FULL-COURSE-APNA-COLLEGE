import java.util.Stack;

class Solution {
    static String decode(String str) {
        Stack<Integer> integerstack = new Stack<>();
        Stack<Character> stringstack = new Stack<>();
        String temp = "", result = "";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;

            // If the current character is a digit
            if (Character.isDigit(str.charAt(i))) {
                while (Character.isDigit(str.charAt(i))) {
                    count = count * 10 + str.charAt(i) - '0';
                    i++;
                }
                i--; // Adjust the position after reading the number
                integerstack.push(count);
            } 
            // If the current character is a closing bracket
            else if (str.charAt(i) == ']') {
                temp = "";
                count = 0;

                // Get the repeat count for the sequence
                if (!integerstack.isEmpty()) {
                    count = integerstack.pop();
                }

                // Form the string within the brackets
                while (!stringstack.isEmpty() && stringstack.peek() != '[') {
                    temp = stringstack.pop() + temp;
                }

                // Pop the opening bracket
                if (!stringstack.isEmpty() && stringstack.peek() == '[') {
                    stringstack.pop();
                }

                // Repeat the string and push it back into the stack
                result = "";
                for (int j = 0; j < count; j++) {
                    result = result + temp;
                }

                // Push the repeated string back to the stack
                for (int j = 0; j < result.length(); j++) {
                    stringstack.push(result.charAt(j));
                }
                result = "";
            } 
            // If the current character is an opening bracket
            else if (str.charAt(i) == '[') {
                if (Character.isDigit(str.charAt(i - 1))) {
                    stringstack.push(str.charAt(i));
                } else {
                    stringstack.push(str.charAt(i));
                    integerstack.push(1); // Default count of 1 if no number before '['
                }
            } 
            // Push other characters to the string stack
            else {
                stringstack.push(str.charAt(i));
            }
        }

        // Pop all the elements from the stack to form the final result
        while (!stringstack.isEmpty()) {
            result = stringstack.pop() + result;
        }

        return result;
    }

    public static void main(String args[]) {
        String str = "3[b2[ca]]";
        System.out.println(decode(str)); // Output: "bcacabcacabcaca"
    }
}
