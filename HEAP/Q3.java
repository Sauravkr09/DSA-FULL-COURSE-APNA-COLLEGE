import java.util.Stack;

public class Q3 {
    static String decode(String str) {
        Stack<Integer> integerStack = new Stack<>();
        Stack<Character> stringStack = new Stack<>();
        String temp = "", result = "";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;

            // If the character is a digit
            if (Character.isDigit(str.charAt(i))) {
                while (Character.isDigit(str.charAt(i))) {
                    count = count * 10 + str.charAt(i) - '0';
                    i++;
                }
                i--;  // Adjust the position after the loop
                integerStack.push(count);

            // If the character is a closing bracket ']'
            } else if (str.charAt(i) == ']') {
                temp = "";
                count = 0;

                if (!integerStack.isEmpty()) {
                    count = integerStack.pop();
                }

                // Extract the encoded string inside brackets
                while (!stringStack.isEmpty() && stringStack.peek() != '[') {
                    temp = stringStack.pop() + temp;
                }

                // Pop the '['
                if (!stringStack.isEmpty() && stringStack.peek() == '[') {
                    stringStack.pop();
                }

                // Repeat the extracted string 'count' times
                for (int j = 0; j < count; j++) {
                    result = result + temp;
                }

                // Push the decoded string back to the stack
                for (int j = 0; j < result.length(); j++) {
                    stringStack.push(result.charAt(j));
                }
                result = "";

            // If the character is an opening bracket '['
            } else if (str.charAt(i) == '[') {
                if (Character.isDigit(str.charAt(i - 1))) {
                    stringStack.push(str.charAt(i));
                } else {
                    stringStack.push(str.charAt(i));
                    integerStack.push(1);
                }

            // Otherwise, push the character onto the stack
            } else {
                stringStack.push(str.charAt(i));
            }
        }

        // Pop all elements from the stack to form the final result
        while (!stringStack.isEmpty()) {
            result = stringStack.pop() + result;
        }

        return result;
    }

    public static void main(String[] args) {
        String str = "3[a2[c]]";
        System.out.println(decode(str));
    }
}


 // output is accaccacc copy me likhna hai