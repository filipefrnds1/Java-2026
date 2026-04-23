package projectcomposi133.entities;

public class OrderItem3 {

    private Integer quantity;
    private Double price;
    private Product3 product3;

    private OrderItem3(){

    }

    public OrderItem3(Integer quantity, Double price, Product3 product3) {
        this.quantity = quantity;
        this.price = price;
        this.product3 = product3;
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

    public Product3 getProduct3() {
        return product3;
    }

    public void setProduct3(Product3 product3) {
        this.product3 = product3;
    }

    public Double subTotal(){
        return quantity * price;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(product3.getName()).append(", $").append(String.format("%.2f",getPrice())).append(", Quantity: ")
                .append(getQuantity()).append(", Subtotal: $").append(String.format("%.2f \n", subTotal()));
        return sb.toString();
    }
}
