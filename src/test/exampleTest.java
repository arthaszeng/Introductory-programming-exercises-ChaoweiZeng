import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class exampleTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testOutputOneAsterisk() throws Exception {
        Main main = new Main();
        main.oneAsterisk();

        assertEquals("*\n", outContent.toString());
    }
}
