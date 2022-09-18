package Instrument;

public class Keyboard extends Instrument{
    private int voices;
    private int speakerVolume;

    public Keyboard(String material, String manufacturer, String colour, double buyPrice, double sellPrice, int voices, int speakerVolume) {
        super("Keyboard", material, manufacturer, colour, InstrumentType.KEYBOARD, buyPrice, sellPrice);
        this.voices = voices;
        this.speakerVolume = speakerVolume;
    }

    public int getVoices() {
        return voices;
    }

    public void setVoices(int voices) {
        this.voices = voices;
    }

    public int getSpeakerVolume() {
        return speakerVolume;
    }

    public void setSpeakerVolume(int speakerVolume) {
        this.speakerVolume = speakerVolume;
    }

    @Override
    public String play() {
        return "Plink";
    }
}
