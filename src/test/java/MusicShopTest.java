import Behaviour.ISell;
import Instrument.*;
import StockItems.DrumStick;
import StockItems.GuitarString;
import StockItems.SheetMusic;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class MusicShopTest {

    Guitar myGuitar;
    Piano myPiano;
    Bassoon myBassoon;
    Trumpet myTrumpet;
    Keyboard myKeyboard;
    DrumStick myDrumsticks;
    GuitarString myGuitarStrings;
    SheetMusic mySheetMusic;
    MusicShop myMusicShop;
    @org.junit.Before
    public void setUp(){
        myBassoon = new Bassoon("Wood", "Dolby", "Brown", 30.0, 55.0, "Bilbo", "French");
        myGuitar = new Guitar("Wood", "Gibson", "Red", 25.0, 45.0, 5, true);
        myKeyboard = new Keyboard("Plastic", "Yamaha", "Black", 15.0, 45.0, 15, 11);
        myPiano = new Piano("Wood", "Fazioli", "White", 100.0, 165.0, false, "Ivory");
        myTrumpet = new Trumpet("Metal", "Bach", "Brass", 50.0, 97.0, 4, 'b', true);
        myDrumsticks = new DrumStick(2.0, 5.0);
        myGuitarStrings = new GuitarString(1.0, 3.5);
        mySheetMusic = new SheetMusic(0.5, 3.0);
        ArrayList<ISell> testStock = new ArrayList<ISell>(){
            {
                add(myBassoon);
                add(myGuitar);
                add(myKeyboard);
                add(myPiano);
                add(myDrumsticks);
                add(myGuitarStrings);
            }
        };
        myMusicShop = new MusicShop(testStock);
    }

    @Test
    public void getStockSize(){
        assertEquals(6, myMusicShop.getStockSize());
    }

    @org.junit.Test
    public void addToStock() {
        myMusicShop.addToStock(myTrumpet);
        assertEquals(7, myMusicShop.getStockSize());
    }

    @org.junit.Test
    public void removeFromStock() {
        myMusicShop.removeFromStock(myGuitar);
        assertEquals(5, myMusicShop.getStockSize());
    }

    @org.junit.Test
    public void calculateTotalPotentialProfit() {
        assertEquals(145.5, myMusicShop.calculateTotalPotentialProfit(), 0.0);
    }
}