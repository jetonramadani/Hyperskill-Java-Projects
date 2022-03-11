import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class StockItem {
    private String name;
    private double pricePerUnit;
    private int quantity;

    public StockItem(String name, double pricePerUnit, int quantity) {
        this.name = name;
        this.pricePerUnit = pricePerUnit;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return name + ": " + pricePerUnit + ", " + quantity + ";";
    }

    public String getName() {
        return name;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotalValue() {
        return this.quantity * this.pricePerUnit;
    }
}

class Utils {
    public static List<StockItem> sort(List<StockItem> stockItems) {
        return stockItems
                .stream()
                .sorted(Comparator.comparing(StockItem::getTotalValue).reversed())
                .collect(Collectors.toList());
    }
}