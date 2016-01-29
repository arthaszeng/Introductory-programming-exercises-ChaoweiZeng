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

        assertEquals("1\n2\nfizz\n4\n5\nfizz\n7\n8\nfizz\n10\n11\nfizz\n13\n14\nfizz\n", outContent.toString());
    }
}
