import java.util.HashMap;

public class InventoryManager {
    HashMap<Integer, Product> inventory = new HashMap<>();

    // Add product
    public void addProduct(Product product) {
        inventory.put(product.getProductId(), product);
    }

    // Update product
    public void updateProduct(int productId, String name, int quantity, double price) {
        if (inventory.containsKey(productId)) {
            Product p = inventory.get(productId);
            p.setProductName(name)  ;
            p.setQuantity( quantity) ;
            p.setPrice(price)  ;
        } else {
            System.out.println("Product not found.");
        }
    }

    // Delete product
    public void deleteProduct(int productId) {
        inventory.remove(productId);
    }

    // Display all products
    public void displayInventory() {
        for (Product p : inventory.values()) {
            System.out.println(p);
        }
    }
}

