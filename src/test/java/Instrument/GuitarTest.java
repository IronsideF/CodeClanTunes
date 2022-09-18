package Instrument;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuitarTest {
    Guitar myGuitar;

    @Before
    public void setUp() {
        myGuitar = new Guitar("Wood", "Gibson", "Red", 25.0, 45.0, 5, true);
    }

    @Test
    public void getMaterial() {
        assertEquals("Wood", myGuitar.getMaterial());
    }

    @Test
    public void setMaterial() {
        myGuitar.setMaterial("Plastic");
        assertEquals("Plastic", myGuitar.getMaterial());
    }

    @Test
    public void getManufacturer() {
        assertEquals("Gibson", myGuitar.getManufacturer());
    }

    @Test
    public void setManufacturer() {
        myGuitar.setManufacturer("Fender");
        assertEquals("Fender", myGuitar.getManufacturer());
    }

    @Test
    public void getColour() {
        assertEquals("Red", myGuitar.getColour());
    }

    @Test
    public void setColour() {
        myGuitar.setColour("Green");
        assertEquals("Green", myGuitar.getColour());
    }

    @Test
    public void getInstrumentType() {
        assertEquals(InstrumentType.STRING, myGuitar.getInstrumentType());
    }

    @Test
    public void setInstrumentType() {
        myGuitar.setInstrumentType(InstrumentType.BRASS);
        assertEquals(InstrumentType.BRASS, myGuitar.getInstrumentType());
    }

    @Test
    public void getDesc() {
        assertEquals("Guitar", myGuitar.getDesc());
    }

    @Test
    public void setDesc() {
        myGuitar.setDesc("Flying V");
        assertEquals("Flying V", myGuitar.getDesc());
    }

    @Test
    public void getBuyPrice() {
        assertEquals(25.0, myGuitar.getBuyPrice(), 0.0);
    }

    @Test
    public void setBuyPrice() {
        myGuitar.setBuyPrice(30.0);
        assertEquals(30.0, myGuitar.getBuyPrice(), 0.0);
    }

    @Test
    public void getSellPrice() {
        assertEquals(45.0, myGuitar.getSellPrice(), 0.0);
    }

    @Test
    public void setSellPrice() {
        myGuitar.setSellPrice(80.0);
        assertEquals(80.0, myGuitar.getSellPrice(), 0.0);
    }

    @Test
    public void calculateMarkup() {
        assertEquals(20.0, myGuitar.calculateMarkup(), 0.0);
    }

    @Test
    public void getNumberOfStrings() {
        assertEquals(5, myGuitar.getNumberOfStrings());
    }

    @Test
    public void setNumberOfStrings() {
        myGuitar.setNumberOfStrings(6);
        assertEquals(6, myGuitar.getNumberOfStrings());
    }

    @Test
    public void isAcoustic() {
        assertTrue(myGuitar.isAcoustic());
    }

    @Test
    public void setAcoustic() {
        myGuitar.setAcoustic();
        assertFalse(myGuitar.isAcoustic());
    }

    @Test
    public void play() {
        assertEquals("Twang", myGuitar.play());
    }
}