import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class exampleTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    DrawAsterisk drawAsterisk = new DrawAsterisk();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testOutputOneAsterisk() throws Exception {

        drawAsterisk.oneAsterisk();

        assertEquals("*\n", outContent.toString());
    }

    @Test
    public void testHorizontalLine() throws Exception {

        drawAsterisk.horizontalLine(8);

        assertEquals("********\n", outContent.toString());
    }

    @Test
    public void testVerticalLine() throws Exception {

        drawAsterisk.verticalLine(3);

        assertEquals("*\n" +
                     "*\n" +
                     "*\n", outContent.toString());
    }

    @Test
    public void testTriangle() throws Exception {

        drawAsterisk.triangle(3);

        assertEquals("*\n" +
                     "**\n" +
                     "***\n", outContent.toString());
    }

    @Test
    public void testIsoscelesTriangle() throws Exception {

        drawAsterisk.isoscelesTriangle(4);

        assertEquals("   *\n" +
                     "  ***\n" +
                     " *****\n" +
                     "*******\n", outContent.toString());
    }

    @Test
    public void testDiamondTest() throws Exception {

        drawAsterisk.diamond(3);

        assertEquals("  *\n" +
                     " ***\n" +
                     "*****\n" +
                     " ***\n" +
                     "  *\n", outContent.toString());
    }

    @Test
    public void testDiamondWithName() throws Exception {

        drawAsterisk.diamondWithName(3);

        assertEquals("  *\n" +
                     " ***\n" +
                     "*****\n" +
                     " ***\n" +
                     "  *\n", outContent.toString());
    }
}
