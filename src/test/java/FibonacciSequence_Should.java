import org.junit.Test;


public class FibonacciSequence_Should {

    @Test(expected = IllegalArgumentException.class) public void
    throw_exception_if_position_is_negative() {
        int fibAtPos = FibonacciSequence.numberAtPosition(-1);
    }

}
