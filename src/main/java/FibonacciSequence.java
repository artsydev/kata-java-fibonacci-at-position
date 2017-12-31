public class FibonacciSequence {

    public static int numberAtPosition(int position) {
        if (position <= 0)
            throw new IllegalArgumentException("position must be greater than 0");

        int currentPosition = 1;
        int prevFibNumber = 0;
        int nextFibNumber = 1;
        int fibNumber = 1;
        while (currentPosition < position) {
            fibNumber = nextFibNumber + prevFibNumber;
            prevFibNumber = nextFibNumber;
            nextFibNumber = fibNumber;
            currentPosition++;
        }

        return fibNumber;
    }

}
