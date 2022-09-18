package Instrument;

public class Trumpet extends Instrument{
    private int valves;
    private char pitch;
    private boolean piston;

    public Trumpet(String material, String manufacturer, String colour, double buyPrice, double sellPrice, int valves, char pitch, boolean piston) {
        super("Trumpet", material, manufacturer, colour, InstrumentType.BRASS, buyPrice, sellPrice);
        this.valves = valves;
        this.pitch = pitch;
        this.piston = piston;
    }

    public int getValves() {
        return valves;
    }

    public void setValves(int valves) {
        this.valves = valves;
    }

    public char getPitch() {
        return pitch;
    }

    public void setPitch(char pitch) {
        this.pitch = pitch;
    }

    public boolean isPiston() {
        return piston;
    }

    public void setPiston() {
        this.piston = !piston;
    }

    @Override
    public String play() {
        return "Toot";
    }
}
