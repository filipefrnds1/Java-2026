package projectcomposi133.entities;

import projectcomposi133.enums.OrderStatus3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Order3 {

    DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    private LocalDateTime date;
    private OrderStatus3 status;
    private Client3 client;

    private List<OrderItem3> item = new ArrayList<>();

    public Order3(){

    }

    public Order3(LocalDateTime date, OrderStatus3 status, Client3 client) {
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

    public OrderStatus3 getStatus() {
        return status;
    }

    public void setStatus(OrderStatus3 status) {
        this.status = status;
    }

    public Client3 getClient() {
        return client;
    }

    public void setClient(Client3 client) {
        this.client = client;
    }

    public void addItem(OrderItem3 item){
        this.item.add(item);
    }

    public void removeItem(OrderItem3 item){
        this.item.remove(item);
    }

    public double total(){
        double sum = 0.0;
        for(OrderItem3 it : item){
            sum += it.subTotal();
        }
        return sum;

    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("\nORDER SUMMARY: \n");
        sb.append("Order moment: ").append(date.format(fmt1)).append("\n");
        sb.append("Order status: ").append(getStatus()).append("\n");
        sb.append(client);
        sb.append("Order items: \n");
        for(OrderItem3 it : item){
            sb.append(it);
        }
        sb.append("Total price: $").append(String.format("%.2f",total()));
        return sb.toString();

    }



}
