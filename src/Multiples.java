public class Multiples {
    public static Object main(int j, int a, int b) {
        int count = 0;
        // Count multiples of 3 or 5 below 1000
        for (int i = 0; i < j; i++)

            // Print our appropriate result.
            if (i % a == 0 || i % b == 0) {

                count++;

            }
        System.out.println(count);
        return count;
    }

    public static Object main() {
        return main(1000, 3, 5);
    }

}
