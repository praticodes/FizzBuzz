public class Multiples {
    public static void main() {
        int count = 0;
        // Count multiples of 3 or 5 below 1000
        for (int i = 0; i < 1000; i++)

            // Print our appropriate result.
            if (i % 3 == 0 || i % 5 == 0) {

                count++;

            }
        System.out.println(count);
    }

}
