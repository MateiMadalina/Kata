import java.util.*;

public class discountCalculator {
    public static void main(String[] args) {
        Map<String, Double> prices = new HashMap<>();
        prices.put("Banana", 10.0);
        prices.put("Orange", 5.0);
        prices.put("Apple", 20.0);

        Map<String, Integer> discounts = new HashMap<>();
        discounts.put("Orange", 10);

        List<Node> shoppingList = List.of(
                new Node("Banana", 5),
                new Node("Orange", 2),
                new Node("Orange", 1)
        );

        GroceryReceipt groceryReceipt = new GroceryReceipt(prices, discounts);

        List<Grocery> invoice = groceryReceipt.Calculate(shoppingList);

        for (Grocery item : invoice) {
            System.out.println(item.fruit + " " + (double)item.total);
        }
    }
    }

    class Grocery {
        String fruit;
        double price, total;
        Grocery(String fruit, double price, double total) {
            this.fruit = fruit;
            this.price = price;
            this.total = total;
        }
    }

    class Node{
        String fruit;
        int count;
        Node(String fruit, int count){
            this.fruit = fruit;
            this.count = count;
        }
    }
    abstract class GroceryReceiptBase {
        private Map<String, Double> prices;
        private Map<String, Integer> discounts;

        public GroceryReceiptBase(Map<String, Double> prices, Map<String, Integer> discounts) {
            this.prices = prices;
            this.discounts = discounts;
        }

        public abstract List<Grocery> Calculate(List<Node> shoppingList);

        public Map<String, Double> getPrices() {
            return prices;
        }

        public Map<String, Integer> getDiscounts() {
            return discounts;
        }
    }

class GroceryReceipt extends GroceryReceiptBase {
    public GroceryReceipt(Map<String, Double> prices, Map<String, Integer> discounts) {
        super(prices, discounts);
    }

    @Override
    public List<Grocery> Calculate(List<Node> shoppingList) {
        List<Grocery> invoice = new ArrayList<>();

        for (Node node : shoppingList) {
            String itemName = node.fruit;
            int quantity = node.count;

            if (getPrices().containsKey(itemName)) {
                double price = getPrices().get(itemName);
                double discountPercentage = getDiscounts().getOrDefault(itemName, 0) / 100.0;
                double discountedPrice = price - (price * discountPercentage);
                double totalPrice = quantity * discountedPrice;

                invoice.add(new Grocery(itemName, discountedPrice, totalPrice));
            }
        }

        Collections.sort(invoice, Comparator.comparing(grocery -> grocery.fruit));
        return invoice;
    }
}

