import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTester {

    Person dave;
    Person alsoDave;
    Person davesClone;
    Person brittany;

    @Before
    public void setUp() {
        this.dave = new Person("Dave");
        this.alsoDave = new Person("Dave");
        this.davesClone = dave;
        this.brittany = new Person("Brittany");
    }

    @Test
    public void personConstructorTest() {
        assertNotNull(dave);
        assertNotNull(brittany);
    }

    @Test
    public void getNameTest() {
        assertEquals("Dave", dave.getName());
        assertEquals("Brittany", brittany.getName());
    }

    @Test
    public void setNameTest() {
        dave.setName("David");
        brittany.setName("Britt");

        assertEquals("David", dave.getName());
        assertEquals("Britt", brittany.getName());
    }
}
