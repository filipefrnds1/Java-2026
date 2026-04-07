package entities;

public class ProductAgain {
    public String name;
    public double price;
    public int quantity;

    public ProductAgain(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public ProductAgain(String name, double price){
        this.name = name;
        this.price = price;
    }

    public double totalValueInStock(){
        return this.price * this.quantity;
    }

    public void addProducts(int quantity){
        this.quantity += quantity;
    }

    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }

    @Override
    public String toString() {
        return "data: " +
                name + ", $ " +
                String.format("%.2f", price) +
                ", " + quantity + " units, Total: $ " +
                String.format("%.2f%n", totalValueInStock());
    }
}
