import java.util.Scanner;

public class ProductCLI {
    private static Scanner scanner = new Scanner(System.in);
    private static ProductManager productManager = new ProductManager();

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n--- Product Management CLI ---");
            System.out.println("1. View Products");
            System.out.println("2. Add Product");
            System.out.println("3. Delete Product");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    productManager.viewProducts();
                    break;
                case 2:
                    addProduct();
                    break;
                case 3:
                    deleteProduct();
                    break;
                case 4:
                    System.out.println("Exiting application.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
    }

    private static void addProduct() {
        System.out.print("Enter Product ID: ");
        long productId = scanner.nextLong();
        scanner.nextLine();  // Consume newline
        System.out.print("Enter Product Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Date Supplied (YYYY-MM-DD): ");
        String dateSupplied = scanner.nextLine();
        System.out.print("Enter Quantity in Stock: ");
        int quantityInStock = scanner.nextInt();
        System.out.print("Enter Unit Price: ");
        double unitPrice = scanner.nextDouble();

        productManager.addProduct(productId, name, dateSupplied, quantityInStock, unitPrice);
    }

    private static void deleteProduct() {
        System.out.print("Enter Product ID to delete: ");
        long productId = scanner.nextLong();
        productManager.deleteProduct(productId);
    }
}
