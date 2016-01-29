import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class exampleTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    Main main = new Main();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testOutputOneAsterisk() throws Exception {

        main.oneAsterisk();

        assertEquals("*\n", outContent.toString());
    }

    @Test
    public void testHorizontalLine() throws Exception {

        main.horizontalLine(8);

        assertEquals("********\n", outContent.toString());
    }

    @Test
    public void testVerticalLine() throws Exception {

        main.verticalLine(3);

        assertEquals("*\n*\n*\n", outContent.toString());
    }

    @Test
    public void testTriangle() throws Exception {

        main.triangle(3);

        assertEquals("*\n**\n***\n", outContent.toString());
    }

    @Test
    public void testIsoscelesTriangle() throws Exception {

        main.isoscelesTriangle(4);

        assertEquals("   *\n  ***\n *****\n*******\n", outContent.toString());
    }

    @Test
    public void testDiamondTest() throws Exception {

        main.diamond(3);

        assertEquals("  *\n ***\n*****\n ***\n  *\n", outContent.toString());
    }
}
