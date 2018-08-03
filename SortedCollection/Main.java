package SortedCollection;

public class Main {
    private static StockList stockList = new StockList();

    public static void main(String[] args) {
        StockItem temp = new StockItem("bread", 0.86, 100);
        stockList.addStock(temp);

        temp = new StockItem("cake", 1.10, 7);
        stockList.addStock(temp);

        temp = new StockItem("car", 12.50, 2);
        stockList.addStock(temp);

        temp = new StockItem("chair", 62.0, 10);
        stockList.addStock(temp);

        temp = new StockItem("cup", 0.50, 7);
        stockList.addStock(temp);

        temp = new StockItem("door", 80.0, 4);
        stockList.addStock(temp);

        temp = new StockItem("juice", 1.10, 7);
        stockList.addStock(temp);

        temp = new StockItem("phone", 1.10, 40);
        stockList.addStock(temp);

        temp = new StockItem("towel", 1.10, 30);
        stockList.addStock(temp);

        temp = new StockItem("vase", 8.76, 7);
        stockList.addStock(temp);

        System.out.println(stockList);

    }
}
