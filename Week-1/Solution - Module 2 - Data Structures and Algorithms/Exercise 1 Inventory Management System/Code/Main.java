public class Main {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();

        // Add products
        Product p1 = new Product(101, "Keyboard", 50, 999.99);
        Product p2 = new Product(102, "Mouse", 100, 499.49);
        Product p3 = new Product(103, "Monitor", 30, 7499.00);

        manager.addProduct(p1);
        manager.addProduct(p2);
        manager.addProduct(p3);

        System.out.println("----- Inventory After Adding Products -----");
        manager.displayInventory();

        // Update a product
        manager.updateProduct(102, "Wireless Mouse", 80, 599.99);
        System.out.println("\n----- Inventory After Updating Product 102 -----");
        manager.displayInventory();

        // Delete a product
        manager.deleteProduct(101);
        System.out.println("\n----- Inventory After Deleting Product 101 -----");
        manager.displayInventory();
    }
}
