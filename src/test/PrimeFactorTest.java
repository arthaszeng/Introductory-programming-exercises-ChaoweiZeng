import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PrimeFactorTest {

    PrimeFactor primeFactor = new PrimeFactor();

    @Test
    public void testShouldReturnNull() throws Exception {
        assertTrue(primeFactor.generate(1).isEmpty());
    }

    @Test
    public void testNIs30() throws Exception {
        List result = primeFactor.generate(30);

        assertEquals(2, result.get(0));
        assertEquals(3, result.get(1));
        assertEquals(5, result.get(2));
    }

    @Test
    public void testNIs70() throws Exception {
        List result = primeFactor.generate(70);
        assertEquals(2, result.get(0));
        assertEquals(5, result.get(1));
        assertEquals(7, result.get(2));
    }

    @Test
    public void testNIs90() throws Exception {
        List result = primeFactor.generate(2310);
        assertEquals(2, result.get(0));
        assertEquals(3, result.get(1));
        assertEquals(5, result.get(2));
        assertEquals(7, result.get(3));
        assertEquals(11, result.get(4));
    }

}
