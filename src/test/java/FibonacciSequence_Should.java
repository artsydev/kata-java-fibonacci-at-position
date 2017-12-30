import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;


public class FibonacciSequence_Should {

    @Test(expected = IllegalArgumentException.class) public void
    throw_exception_if_position_is_negative() {
        int fibAtPos = FibonacciSequence.numberAtPosition(-1);
    }

    @Test public void
    return_one_at_position_one() {
        int fibAtPos = FibonacciSequence.numberAtPosition(1);

        assertThat(fibAtPos, is(1));
    }

}
