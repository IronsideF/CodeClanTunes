package StockItems;

import Behaviour.ISell;

public abstract class StockItem implements ISell {
    protected String desc;
    protected double buyPrice;
    protected double sellPrice;

    public StockItem(String desc, double buyPrice, double sellPrice) {
        this.desc = desc;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    @Override
    public double calculateMarkup() {
        return sellPrice-buyPrice;
    }
}
