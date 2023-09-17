public class Reduce {
    public static Object main(int start) {
        // print number of steps from 0 to 100
        int count = 0;
        while (start > 0) {
            if (start % 2 == 0){
                start = start / 2;
            }
            else {
                start = start - 1;
            }
            count ++;
        }
        System.out.println(count);
        return count;
    }

}
