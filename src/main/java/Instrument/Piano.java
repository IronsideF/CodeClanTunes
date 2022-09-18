package Instrument;

public class Piano extends Instrument{
    private boolean grand;
    private String keyMaterial;

    public Piano(String material, String manufacturer, String colour, double buyPrice, double sellPrice, boolean grand, String keyMaterial) {
        super("Piano", material, manufacturer, colour, InstrumentType.PERCUSSION, buyPrice, sellPrice);
        this.grand = grand;
        this.keyMaterial = keyMaterial;
    }

    public boolean isGrand() {
        return grand;
    }

    public void setGrand() {
        this.grand = !grand;
    }

    public String getKeyMaterial() {
        return keyMaterial;
    }

    public void setKeyMaterial(String keyMaterial) {
        this.keyMaterial = keyMaterial;
    }

    @Override
    public String play() {
        return "Plink";
    }
}
