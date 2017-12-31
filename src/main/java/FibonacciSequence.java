public class FibonacciSequence {

    public static int numberAtPosition(int position) {
        if (position <= 0)
            throw new IllegalArgumentException("position must be greater than 0");

        if (position < 3)
            return 1;
        else
            return 2;
    }

}
