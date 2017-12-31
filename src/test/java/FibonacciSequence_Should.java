import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;


public class FibonacciSequence_Should {

    @Test(expected = IllegalArgumentException.class) public void
    throw_exception_if_position_is_negative() {
        int fibAtPos = FibonacciSequence.numberAtPosition(-1);
    }

    @DisplayName("Fibonacci number at position")
    @ParameterizedTest(name = "{0} should be {1}")
    @CsvSource({ "0,0", "1,1", "2,1", "3,2", "4,3", "5,5", "6,8", "7,13" })
    public void fibonacci_number_at_position(int position, int expectedResult) {
        int fibAtPos = FibonacciSequence.numberAtPosition(position);

        assertThat(fibAtPos, is(expectedResult));
    }

}
