package BitWiseOpeter;

public class BitWise {

    // Get the ith bit of the number n
    public static int getIthBit(int n, int i) {
        int bitMask = 1 << i;
        if ((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    // Set the ith bit of the number n
    public static int setIthBit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

    // Clear the ith bit of the number n
    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    // Update the ith bit of the number n to newBit (0 or 1)
    public static int updateIthBit(int n, int i, int newBit) {
        n = clearIthBit(n, i);
        int bitMask = newBit << i;
        return n | bitMask;
    }

    // Clear all bits from the ith position to the LSB
    public static int clearIthBits(int n, int i) {
        int bitMask = (~0) << i;
        return n & bitMask;
    }

    public static int clearBitsRange(int n, int i, int j) {
        int a = ((~0) << (j + 1));
        int b = (1 << i) - 1;
        int bitMask = a | b;
        return n & bitMask;
    }

    public static boolean inPowerOfTwo(int n) {
        return (n & (n - 1)) == 0;
    }

    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    public static int fastExpo(int a, int n) {
        int ans = 1;

        while (n > 0) {
            if ((n & 1) != 0) { // check lsb
                ans = ans * a;
            }
            a = a*a;
            n = n>>1;
        }
        return ans;
    }

    public static void main(String[] args) {
        // Test cases
        // System.out.println(5 & 6); // Example bitwise AND operation

        // System.out.println(getIthBit(10, 2)); // Output: 0
        // System.out.println(setIthBit(10, 2)); // Output: 14
        // System.out.println(clearIthBit(10, 1)); // Output: 8
        // System.out.println(updateIthBit(10, 2, 1)); // Output: 14

        // System.out.println(clearIthBit(15, 2));
        // Output: 11
        // System.out.println(clearBitsRange(10,2,4));
        // System.out.println(inPowerOfTwo(8));
        // System.out.println(countSetBits(10));
        System.out.println( fastExpo(3,5));
    }
}
