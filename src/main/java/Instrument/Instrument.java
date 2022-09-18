package Instrument;

import Behaviour.IPlay;
import Behaviour.ISell;
import StockItems.StockItem;

public abstract class Instrument extends StockItem implements IPlay, ISell {
    protected String material;
    protected String manufacturer;
    protected String colour;
    protected InstrumentType instrumentType;

    public Instrument(String desc, String material, String manufacturer, String colour, InstrumentType instrumentType, double buyPrice, double sellPrice) {
        super(desc, buyPrice, sellPrice);
        this.material = material;
        this.manufacturer = manufacturer;
        this.colour = colour;
        this.instrumentType = instrumentType;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

    public void setInstrumentType(InstrumentType instrumentType) {
        this.instrumentType = instrumentType;
    }

}
