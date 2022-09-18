package Instrument;

public class Bassoon extends Instrument{
    private String reedBrand;
    private String form;

    public Bassoon(String material, String manufacturer, String colour, double buyPrice, double sellPrice, String reedBrand, String form) {
        super("Bassoon", material, manufacturer, colour, InstrumentType.WOODWIND, buyPrice, sellPrice);
        this.reedBrand = reedBrand;
        this.form = form;
    }

    public String getReedBrand() {
        return reedBrand;
    }

    public void setReedBrand(String reedBrand) {
        this.reedBrand = reedBrand;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    @Override
    public String play() {
        return "Honk";
    }
}
