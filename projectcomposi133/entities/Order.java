package projectcomposi133.entities;

import project.entities.enums.OrderStatus;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Order {

    private LocalDateTime date;
    private OrderStatus status;
    private Client client;

    private List<OrderItem> list = new ArrayList<>();
    private static final LocalDateTime dt1 = LocalDateTime.now();
    private static final DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static final DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    public Order(LocalDateTime date, OrderStatus status, Client client) {
        this.date = date;
        this.status = status;
        this.client = client;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItem> getList() {
        return list;
    }

    public void addItem(OrderItem item){
        list.add(item);
    }

    public void removeItem(OrderItem item){
        list.remove(item);
    }

    public Double total(List<OrderItem> lista){
        double sum = 0;
        for(OrderItem list : lista){
            sum += list.subTotal();
        }
        return sum;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: ").append(date.format(fmt2)).append("\n");
        sb.append("Order status: ").append(getStatus()).append("\n");
        sb.append("Client: ").append(getClient().getName()).append(" ").append(getClient().getBirthDate().format(fmt1)).append(" - ").append(getClient().getEmail()).append("\n");
        sb.append("Order items:").append("\n");
        for(OrderItem it : list){
            for(Product prod : it.getProduct()){
                sb.append(prod.getName()).append(", $")
                        .append(String.format("%.2f",prod.getPrice()))
                        .append(", Quantity: ").append(it.getQuantity())
                        .append(", Subtotal: $").append(String.format("%.2f",it.subTotal())).append("\n");
            }
        }
        sb.append("Total price: ").append(String.format("$%.2f", total(list)));
        return sb.toString();


    }

}
