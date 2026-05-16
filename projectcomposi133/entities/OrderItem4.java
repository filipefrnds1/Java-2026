package projectcomposi133.entities;

public class OrderItem4 {
    private Integer quantity;
    private Double price;
    private Product4 prod;

    public OrderItem4() {
    }

    public OrderItem4(Integer quantity, Double price, Product4 prod) {
        this.quantity = quantity;
        this.price = price;
        this.prod = prod;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Product4 getProd() {
        return prod;
    }

    public void setProd(Product4 prod) {
        this.prod = prod;
    }

    public Double subTotal(){
        return quantity * price;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(prod.getName()).append(", $").append(String.format("%.2f",getPrice())).append(", Quantity: ")
                .append(getQuantity()).append(", Subtotal: $").append(String.format("%.2f \n", subTotal()));
        return sb.toString();
    }
}
