import java.util.List;
import java.util.Objects;

public class DojoCakeShop {
    public static void main(String[] args) {
        Product pancake = new Pancake(List.of("vanilla", "chocolate", "strawberry"));
        Product chimneyCake = new chimneyCake(List.of("vanilla", "chocolate", "strawberry"));
        Product pancake2 = new Pancake(List.of("vanilla", "strawberry"));
        Product chimneyCake2 = new chimneyCake(List.of("vanilla", "chocolate"));
        Shop shop = new Shop(List.of(pancake, pancake2, chimneyCake, chimneyCake2));
        System.out.println("Total income is: " + shop.getTotalIncome());
        String ceva = "anada";


    }

    public abstract static class Product {
        public String type;
        public List<String> flavors;
        public String ovenType;

        public Product(String type, List<String> flavors, String ovenType) {
            this.type = type;
            this.flavors = flavors;
            this.ovenType = ovenType;
        }

        public int getFlavorPrice() {
            int flavorsPrice = flavors.stream()
                    .mapToInt(flavor -> {
                        if (flavor.equals("vanilla")) return 30;
                        if (flavor.equals("chocolate")) return 40;
                        if (flavor.equals("strawberry")) return 55;
                        return 0;
                    })
                    .sum();
            System.out.println("total flavor price of " + this.flavors + " is " + flavorsPrice);
            return flavorsPrice;
        }
    }

    public static class Pancake extends Product {
        public Pancake(List<String> flavors) {
            super("pancake", flavors, "pancake Oven");
        }
    }

    public static class chimneyCake extends Product {
        public chimneyCake(List<String> flavors) {
            super("chimney cake", flavors, "chimney cake Oven");
        }
    }

    public static class Shop {
        private final List<Product> products;

        public Shop(List<Product> products) {
            this.products = products;
        }

        public int getTotalIncome() {
            return products.stream()
                    .mapToInt(product -> {
                        if (product instanceof Pancake pancake) {
                            return 1 + pancake.getFlavorPrice();
                        } else if (product instanceof chimneyCake chimneyCake) {
                            return 2 + chimneyCake.getFlavorPrice();
                        } else {
                            return 0;
                        }
                    })
                    .sum();
        }
    }
}
