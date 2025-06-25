// package BuilderPatternExample.code; 
public class Main {
    public static void main(String[] args) {
        // Basic Computer
        Computer basicComputer = new Computer.Builder()
                .setCPU("Intel i3")
                .setRAM("8GB")
                .setStorage("256GB SSD")
                .build();

        // Gaming Computer
        Computer gamingComputer = new Computer.Builder()
                .setCPU("Intel i9")
                .setRAM("32GB")
                .setStorage("1TB SSD")
                .setGraphicsCard("NVIDIA RTX 4080")
                .setWifi(true)
                .setBluetooth(true)
                .build();

        // Display configurations
        System.out.println("Basic Computer:");
        System.out.println(basicComputer);

        System.out.println("\nGaming Computer:");
        System.out.println(gamingComputer);
    }
}
