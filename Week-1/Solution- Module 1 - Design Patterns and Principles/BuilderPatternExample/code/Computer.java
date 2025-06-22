package BuilderPatternExample.code; 
public class Computer {
    // Required and optional parts
    private String CPU;
    private String RAM;
    private String storage;
    private String graphicsCard;
    private boolean hasWifi;
    private boolean hasBluetooth;

    // Private constructor to be called from Builder
    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
        this.hasWifi = builder.hasWifi;
        this.hasBluetooth = builder.hasBluetooth;
    }

    // toString for displaying configuration
    public String toString() {
        return "Computer [CPU=" + CPU + ", RAM=" + RAM + ", Storage=" + storage +
                ", Graphics Card=" + graphicsCard + ", WiFi=" + hasWifi +
                ", Bluetooth=" + hasBluetooth + "]";
    }

    // Static Nested Builder Class
    public static class Builder {
        private String CPU;
        private String RAM;
        private String storage;
        private String graphicsCard;
        private boolean hasWifi;
        private boolean hasBluetooth;

        public Builder setCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }

        public Builder setRAM(String RAM) {
            this.RAM = RAM;
            return this;
        }

        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder setGraphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public Builder setWifi(boolean hasWifi) {
            this.hasWifi = hasWifi;
            return this;
        }

        public Builder setBluetooth(boolean hasBluetooth) {
            this.hasBluetooth = hasBluetooth;
            return this;
        }

        // Final build method that returns the configured Computer
        public Computer build() {
            return new Computer(this);
        }
    }
}
