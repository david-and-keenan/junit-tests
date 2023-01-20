import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarTest {
    private Car miata;
    private Car ptCruiser;
    private Car jalopy;

    @Before
    public void setUp(){
        this.miata = new Car("Mazda", "Miata", (short) 1999, (byte) 4, "petrol");
        this.ptCruiser = new Car("Chrysler", "PT Cruiser", (short) 2002, (byte) 4, "petrol");
        this.jalopy = new Car();
    }

    @Test
    public void jalopyIsEmpty() {
        assertNull(jalopy.getMake());
        assertNull(jalopy.getModel());
        assertNull(jalopy.getPowerSource());
        assertEquals(jalopy.getYear(), 0);
        assertEquals(jalopy.getCylinders(), 0);
    }

    @Test
    public void getModel() {
        assertEquals("Miata", miata.getModel());
        assertEquals("PT Cruiser", ptCruiser.getModel());
    }

    @Test
    public void setModel() {
        miata.setModel("Eunos Roadster");
        ptCruiser.setModel("PT Turbo");

        assertEquals("Eunos Roadster", miata.getModel());
        assertEquals("PT Turbo", ptCruiser.getModel());
    }

    @Test
    public void getMake() {
        assertEquals("Mazda", miata.getMake());
        assertEquals("Chrysler", ptCruiser.getMake());
    }

    @Test
    public void setMake() {
        miata.setMake("Ford");
        ptCruiser.setMake("Plymouth");

        assertEquals("Ford", miata.getMake());
        assertEquals("Plymouth", ptCruiser.getMake());
    }

    @Test
    public void getYear() {
        assertEquals(1999, miata.getYear());
        assertEquals(2002, ptCruiser.getYear());
    }

    @Test
    public void setYear() {
        miata.setYear((short) 1989);
        ptCruiser.setYear((short) 2001);

        assertEquals(1989, miata.getYear());
        assertEquals(2001, ptCruiser.getYear());
    }

    @Test
    public void getCylinders() {
        assertEquals(4, miata.getCylinders());
        assertEquals(4, ptCruiser.getCylinders());
    }

    @Test
    public void setCylinders() {
        miata.setCylinders((byte) 6);
        ptCruiser.setCylinders((byte) 12);

        assertEquals(6, miata.getCylinders());
        assertEquals(12, ptCruiser.getCylinders());
    }

    @Test
    public void getPowerSource() {
        assertEquals("petrol", miata.getPowerSource());
        assertEquals("petrol", ptCruiser.getPowerSource());
    }

    @Test
    public void setPowerSource() {
        miata.setPowerSource("hydrogen cell");
        ptCruiser.setPowerSource("diesel");

        assertEquals("hydrogen cell", miata.getPowerSource());
        assertEquals("diesel", ptCruiser.getPowerSource());
    }
}
