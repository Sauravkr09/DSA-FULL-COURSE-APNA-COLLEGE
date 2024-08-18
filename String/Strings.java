package String;
import java.util.*;

public class Strings {

    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            int n = str.length();
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false; // Not a palindrome
            }
        }
        return true;
    }

    public static float getShortPath(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            if (dir == 'S') {
                y--;
            } else if (dir == 'N') {
                y++;
            } else if (dir == 'W') {
                x--;
            } else if (dir == 'E') {
                x++;
            }
        }
        return (float) Math.sqrt(x * x + y * y);
    }

    public static String subString(String str, int si, int ei) {
        return str.substring(si, ei);
    }

    public static String toUpperCase(String str) {
        StringBuilder sb = new StringBuilder();

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static String compress(String str) {
        StringBuilder newStr = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            int count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            newStr.append(str.charAt(i));
            if (count > 1) {
                newStr.append(count);
            }
        }
        return newStr.toString();
    }

    public static void main(String[] args) {
        // Test palindrome
        // String str = "racecar";
        // System.out.println(isPalindrome(str)); // should print true

        // // Test shortest path
        // String path = "WNEENESENNN";
        // System.out.println(getShortPath(path)); // should print the shortest path

        // // Test substring
        // String helloWorld = "HelloWorld";
        // System.out.println(subString(helloWorld, 0, 5)); // should print "Hello"

        // // Find the largest string lexicographically
        // String fruits[] = { "apple", "mango", "banana" };
        // String largest = fruits[0];
        // for (int i = 1; i < fruits.length; i++) {
        //     if (largest.compareTo(fruits[i]) < 0) {
        //         largest = fruits[i];
        //     }
        // }
        // System.out.println(largest); // should print "mango"

        // // StringBuilder example
        // StringBuilder sb = new StringBuilder();
        // for (char ch = 'a'; ch <= 'z'; ch++) {
        //     sb.append(ch);
        // }
        // System.out.println(sb.toString()); // should print "abcdefghijklmnopqrstuvwxyz"

        // String str = "hii, i am saurav";
        // System.out.println(toUpperCase(str)); // should print "Hii, I Am Saurav"

        // Test compress
        // String str = "aaabbcccdd";
        // System.out.println(compress(str)); // should print "a3b2c3d2"

        // Corrected replace method usage
        String str = "ApnaCollage".replace("1", "");
        System.out.println(str); // should print "ApnaCollage"
    }
}
