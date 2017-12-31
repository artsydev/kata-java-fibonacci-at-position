public class FibonacciSequence {

    public static int numberAtPosition(int position) {
        if (position < 0)
            throw new IllegalArgumentException("position must be positive");

        if (position < 2)
            return position;

        int prevFibNumber = 0;
        int currentFibNumber = 1;
        while (position-- > 1) {
            int nextFibNumber = currentFibNumber + prevFibNumber;
            prevFibNumber = currentFibNumber;
            currentFibNumber = nextFibNumber;
        }

        return currentFibNumber;
    }

}
