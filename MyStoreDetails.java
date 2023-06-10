import java.util.Objects;

public class MyStoreDetails {
    private String stockName;
    private Double stockPrice;
    private Integer quantity;

    public MyStoreDetails(String stockName, Double stockPrice, Integer quantity){
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
        return "MyStoreDetails{" +
                "stockName='" + stockName + '\'' +
                ", stockPrice='" + stockPrice + '\'' +
                ", quantity=" + quantity +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyStoreDetails myStoreDetails = (MyStoreDetails) o;
        return Objects.equals(stockName, myStoreDetails.stockName) && quantity == myStoreDetails.quantity && Double.compare(myStoreDetails.stockPrice, stockPrice) == 0;
    
    }
    @Override
    public int hashCode() {
        return Objects.hash(stockName, stockPrice, quantity);
    }
}
