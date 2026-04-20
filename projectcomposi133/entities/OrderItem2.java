package projectcomposi133.entities;

public class OrderItem2 {

    private Integer quantity;
    private Double price;

    private Product2 product2;

    public OrderItem2(){

    }

    public OrderItem2(Integer quantity, Double price, Product2 product2) {
        this.quantity = quantity;
        this.price = price;
        this.product2 = product2;
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

    public Product2 getProduct2() {
        return product2;
    }

    public void setProduct2(Product2 product2) {
        this.product2 = product2;
    }

    public double subTotal(){
        return price * quantity;
    }

    @Override
    public String toString(){
        return getProduct2().getName()
                + ", $"
                + String.format("%.2f", price)
                + ", Quantity: "
                + quantity
                + ", Subtotal: $"
                + String.format("%.2f", subTotal());
    }
}
