import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    private List<Product> products;

    public ProductManager() {
        products = new ArrayList<>();
        loadInitialData();
    }

    private void loadInitialData() {
        products.add(new Product(3128874119L, "Banana", "2023-01-24", 124, 0.55));
        products.add(new Product(2927458265L, "Apple", "2022-12-09", 18, 1.09));
        products.add(new Product(9189927460L, "Carrot", "2023-03-31", 89, 2.99));
    }

    public void viewProducts() {
        System.out.println("Product Id\tName\tDate Supplied\tQuantity In Stock\tUnit Price (in US$)");
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public void addProduct(long productId, String name, String dateSupplied, int quantityInStock, double unitPrice) {
        products.add(new Product(productId, name, dateSupplied, quantityInStock, unitPrice));
        System.out.println("Product added successfully!");
    }

    public void deleteProduct(long productId) {
        products.removeIf(product -> product.getProductId() == productId);
        System.out.println("Product deleted successfully!");
    }
}
