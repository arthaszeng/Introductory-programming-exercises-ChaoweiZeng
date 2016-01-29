import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class FizzBuzzGameTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    DrawAsterisk drawAsterisk = new DrawAsterisk();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testCouldPrintNumbersOneThroughOneHundred() throws Exception {
        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();
        fizzBuzzGame.normalNumber(15);

        assertEquals("1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n11\n12\n13\n14\n15\n", outContent.toString());
    }

    @Test
    public void testFizzIsRight() throws Exception {
        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();
        fizzBuzzGame.fizz(15);

        assertEquals("1\n2\nFizz\n4\n5\nFizz\n7\n8\nFizz\n10\n11\nFizz\n13\n14\nFizz\n", outContent.toString());
    }

    @Test
    public void testBuzzIsRight() throws Exception {
        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();
        fizzBuzzGame.buzz(15);

        assertEquals("1\n2\n3\n4\nBuzz\n6\n7\n8\n9\nBuzz\n11\n12\n13\n14\nBuzz\n", outContent.toString());
    }

    @Test
    public void testFizzBuzzIsRight() throws Exception {
        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();
        fizzBuzzGame.fizzBuzz(15);

        assertEquals("1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\nFizz\n13\n14\nFizzBuzz\n", outContent.toString());
    }
}
