public class Car {
    private String color;
    private double price;
    private char size;

    public Car(String color, double price, char size) {
        this.color = color;
        this.price = price;
        this.size = Character.toUpperCase(size);
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public char getSize() {
        return size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setSize(char size) {
        this.size = Character.toUpperCase(size);
    }

    public String toString() {
        String sizeDesc;

        switch (size) {
            case 'S':
                sizeDesc = "small";
                break;
            case 'M':
                sizeDesc = "medium";
                break;
            case 'L':
                sizeDesc = "large";
                break;
            default:
                sizeDesc = "N/A";
        }

        return String.format("Car (%s) - P%.2f - %s", color, price, sizeDesc);
    }

    public static void main(String[] args) {
        Car car1 = new Car("red", 19999.85, 'M');
        Car car2 = new Car("blue", 50000.00, 'L');

        System.out.println("\n" + car1);
        System.out.println(car2);
    }
}