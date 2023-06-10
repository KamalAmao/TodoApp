import java.util.Objects;
public class StoreInfo {
    private String stockName;
    private Double stockPrice;
    private Integer quantity;


    public StoreInfo(String stockName, Double stockPrice, Integer quantity){
        this.stockName = stockName;
        this.stockPrice = stockPrice;
        this.quantity = quantity;
    }

    public String getStockName(){
        return stockName;
    }
    public Double getStockPrice(){
        return stockPrice;
    }
    public Integer getQuantity(){
        return quantity;
    }

    @Override
    public String toString() {
        return "StoreInfo{" +
                "stockName='" + stockName + '\'' +
                ", stockPrice='" + stockPrice + '\'' +
                ", quantity=" + quantity +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StoreInfo storeInfo = (StoreInfo) o;
        return Objects.equals(stockName, storeInfo.stockName) && quantity == storeInfo.quantity && Double.compare(storeInfo.stockPrice, stockPrice) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(stockName, stockPrice, quantity);
    }
}

