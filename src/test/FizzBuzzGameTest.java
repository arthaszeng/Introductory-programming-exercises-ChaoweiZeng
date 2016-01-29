import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class FizzBuzzGameTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testCouldPrintNumbersOneThroughOneHundred() throws Exception {
        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();
        fizzBuzzGame.normalNumber(15);

        assertEquals("1\n" +
                "2\n" +
                "3\n" +
                "4\n" +
                "5\n" +
                "6\n" +
                "7\n" +
                "8\n" +
                "9\n" +
                "10\n" +
                "11\n" +
                "12\n" +
                "13\n" +
                "14\n" +
                "15\n", outContent.toString());
    }

    @Test
    public void testFizzIsRight() throws Exception {
        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();
        fizzBuzzGame.fizz(15);

        assertEquals("1\n" +
                "2\n" +
                "Fizz\n" +
                "4\n" +
                "5\n" +
                "Fizz\n" +
                "7\n" +
                "8\n" +
                "Fizz\n" +
                "10\n" +
                "11\n" +
                "Fizz\n" +
                "13\n" +
                "14\n" +
                "Fizz\n", outContent.toString());
    }

    @Test
    public void testBuzzIsRight() throws Exception {
        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();
        fizzBuzzGame.buzz(15);

        assertEquals("1\n" +
                "2\n" +
                "3\n" +
                "4\n" +
                "Buzz\n" +
                "6\n" +
                "7\n" +
                "8\n" +
                "9\n" +
                "Buzz\n" +
                "11\n" +
                "12\n" +
                "13\n" +
                "14\n" +
                "Buzz\n", outContent.toString());
    }

    @Test
    public void testFizzBuzzIsRight() throws Exception {
        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();
        fizzBuzzGame.fizzBuzz(15);

        assertEquals("1\n" +
                "2\n" +
                "Fizz\n" +
                "4\n" +
                "Buzz\n" +
                "Fizz\n" +
                "7\n" +
                "8\n" +
                "Fizz\n" +
                "Buzz\n" +
                "11\n" +
                "Fizz\n" +
                "13\n" +
                "14\n" +
                "FizzBuzz\n", outContent.toString());
    }
}
