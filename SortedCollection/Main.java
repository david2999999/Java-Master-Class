package SortedCollection;

import java.util.Map;

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

        temp = new StockItem("cup", 0.50, 200);
        stockList.addStock(temp);
        temp = new StockItem("cup", 0.45, 7);
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

        Basket myBasket = new Basket("Dav");
        sellItem(myBasket, "car",1);
        System.out.println(myBasket);

        sellItem(myBasket, "car", 1);
        System.out.println(myBasket);

        sellItem(myBasket, "car", 3);
        sellItem(myBasket, "spanner", 3);

        sellItem(myBasket, "juice", 4);
        sellItem(myBasket, "cup", 12);
        sellItem(myBasket, "bread", 1);

        System.out.println();
        Basket basket = new Basket("customer");
        sellItem(basket,"cup", 100);
        sellItem(basket, "juice", 3);
        removeItem(basket, "cup", 1);
        System.out.println(basket);

        removeItem(basket, "car", 1);
        removeItem(basket, "cup", 10);
        removeItem(basket, "car", 1);
        System.out.println("cars removed " + removeItem(basket, "car", 1));

        System.out.println(basket);

        removeItem(basket, "bread", 1);

    }

    public static int sellItem(Basket basket, String item, int quantity) {
        // retrieve the item from stock list
        StockItem stockItem = stockList.get(item);
        if (stockItem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }

        if (stockList.reserveStock(item, quantity) != 0) {
            return basket.addToBasket(stockItem, quantity);
        }

        return 0;
    }

    public static int removeItem(Basket basket, String item, int quantity) {
        // retrieve the item from stock list
        StockItem stockItem = stockList.get(item);
        if (stockItem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }

        if (basket.removeFromBasket(stockItem, quantity) == quantity) {
            return stockList.unreserveStock(item, quantity);
        }

        return 0;
    }

    public static void checkOut(Basket basket) {
        for (Map.Entry<StockItem, Integer> item: basket.Items().entrySet()) {
            stockList.sellStock(item.getKey().getName(), item.getValue());
        }
        basket.clearBasket();
    }
}
