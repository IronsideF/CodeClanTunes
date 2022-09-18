import Behaviour.ISell;

import java.util.ArrayList;

public class MusicShop {
    private ArrayList<ISell> stock;

    public MusicShop(ArrayList<ISell> stock) {
        this.stock = stock;
    }
    public int getStockSize(){
        return stock.size();
    }
    public void addToStock(ISell stockItem){
        stock.add(stockItem);
    }
    public boolean removeFromStock(ISell stockItem){
        return stock.remove(stockItem);
    }
    public double calculateTotalPotentialProfit(){
       return stock.stream().map(ISell::calculateMarkup).reduce(0.0, (sum, num)->sum+=num);
    }
}
