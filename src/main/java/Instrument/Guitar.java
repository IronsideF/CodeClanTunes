package Instrument;

public class Guitar extends Instrument{
    private int numberOfStrings;
    private boolean acoustic;

    public Guitar(String material, String manufacturer, String colour, double buyPrice, double sellPrice, int numberOfStrings, boolean acoustic) {
        super("Guitar", material, manufacturer, colour, InstrumentType.STRING, buyPrice, sellPrice);
        this.numberOfStrings = numberOfStrings;
        this.acoustic = acoustic;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    public boolean isAcoustic() {
        return acoustic;
    }

    public void setAcoustic() {
        this.acoustic = !acoustic;
    }

    @Override
    public String play() {
        return "Twang";
    }
}
