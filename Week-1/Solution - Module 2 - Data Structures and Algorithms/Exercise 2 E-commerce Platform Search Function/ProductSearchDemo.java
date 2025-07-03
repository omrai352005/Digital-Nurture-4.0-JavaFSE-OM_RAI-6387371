package Exercise2EcommercePlatformSearchFunction;
import java.util.Arrays;

public class ProductSearchDemo {
    // Linear search for productId
    public static int linearSearch(Product[] products, int productId) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].getProductId() == productId) {
                return i;
            }
        }
        return -1;
    }

    // Binary search for productId (array must be sorted by productId)
    public static int binarySearch(Product[] products, int productId) {
        int left = 0, right = products.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (products[mid].getProductId() == productId) {
                return mid;
            } else if (products[mid].getProductId() < productId) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(205, "Shirt", "Clothing"),
            new Product(150, "Book", "Stationery"),
            new Product(120, "Phone", "Electronics"),
            new Product(180, "Shoes", "Footwear")
        };

        // Linear Search (unsorted)
        int searchId = 150;
        int index = linearSearch(products, searchId);
        System.out.println("Linear Search: Searching for productId " + searchId);
        if (index != -1) {
            System.out.println("Found: " + products[index]);
        } else {
            System.out.println("Product not found.");
        }

        // Sort products by productId for binary search
        Arrays.sort(products, (a, b) -> Integer.compare(a.getProductId(), b.getProductId()));

        // Binary Search (sorted)
        index = binarySearch(products, searchId);
        System.out.println("\nBinary Search: Searching for productId " + searchId);
        if (index != -1) {
            System.out.println("Found: " + products[index]);
        } else {
            System.out.println("Product not found.");
        }

        /*
         * Time Complexity Analysis:
         * Linear Search: O(n) - checks each element one by one.
         * Binary Search: O(log n) - repeatedly divides the search interval in half (requires sorted array).
         *
         * Discussion:
         * For small or unsorted datasets, linear search is simple and effective.
         * For large, sorted datasets, binary search is much faster and more suitable.
         */
    }
} 