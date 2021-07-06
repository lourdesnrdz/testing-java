package fizzbuzz;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class FizzBuzzShould {

    @Test
    public void return_fizz_when_n_is_divisible_by_3() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.fizzBuzz(3), is("Fizz"));
        assertThat(fizzBuzz.fizzBuzz(6), is("Fizz"));
    }

    @Test
    public void return_buzz_when_n_is_divisible_by_5() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.fizzBuzz(5), is("Buzz"));
        assertThat(fizzBuzz.fizzBuzz(10), is("Buzz"));
    }

    @Test
    public void return_fizzbuzz_when_n_is_divisible_by_3_and_5() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.fizzBuzz(15), is("FizzBuzz"));
        assertThat(fizzBuzz.fizzBuzz(30), is("FizzBuzz"));
    }

    @Test
    public void return_number_when_n_is_not_divisible_by_3_and_or_5() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        assertThat(fizzBuzz.fizzBuzz(2), is("2"));
        assertThat(fizzBuzz.fizzBuzz(16), is("16"));
    }
}