import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class HelloWorldTest {
    String helloWorld;
    String testing;

    @Test
    public void testIfHelloWorldWorks() {
        assertEquals(helloWorld, testing);
    }

   @Test
    public void testIfZeroIsNotFour() {
        assertNotEquals(0,4);
   }
}
