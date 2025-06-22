public class Main {
    public static void main(String[] args) {
        Order[] orders = {
            new Order(201, "Alice", 150.0),
            new Order(202, "Bob", 99.99),
            new Order(203, "Charlie", 300.5),
            new Order(204, "David", 250.75)
        };

        System.out.println("Before Sorting:");
        for (Order o : orders) System.out.println(o);

        // Bubble Sort
        Bubblesort.Sort(orders);
        System.out.println("\nAfter Bubble Sort by Total Price:");
        for (Order o : orders) System.out.println(o);

        // Reset array for Quick Sort
        orders = new Order[] {
            new Order(201, "Alice", 150.0),
            new Order(202, "Bob", 99.99),
            new Order(203, "Charlie", 300.5),
            new Order(204, "David", 250.75)
        };

        // Quick Sort
        Quicksort.Sort(orders, 0, orders.length - 1);
        System.out.println("\nAfter Quick Sort by Total Price:");
        for (Order o : orders) System.out.println(o);
    }
}
