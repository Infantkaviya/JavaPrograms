import java.util.Scanner;

class Product {
    int pid;
    double price;
    int quantity;

    public Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }
}

class ProductMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product[] products = new Product[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter product ID, price, and quantity for product " + (i + 1) + ":");
            int pid = scanner.nextInt();
            double price = scanner.nextDouble();
            int quantity = scanner.nextInt();
            products[i] = new Product(pid, price, quantity);
        }
        int maxPricePid = products[0].pid;
        double maxPrice = products[0].price;
        for (int i = 1; i < 5; i++) {
            if (products[i].price > maxPrice) {
                maxPrice = products[i].price;
                maxPricePid = products[i].pid;
            }
        }
        System.out.println("Product ID with highest price: " + maxPricePid);
        double totalAmount = calculateTotalAmount(products);
        System.out.println("Total amount spent on all products: " + totalAmount);

        scanner.close();
    }

    public static double calculateTotalAmount(Product[] products) {
        double total = 0;
        for (Product product : products) {
            total += product.price * product.quantity;
        }
        return total;
    }
}

