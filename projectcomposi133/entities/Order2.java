package projectcomposi133.entities;

import projectcomposi133.enums.OrderStatus2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Order2 {

    DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    private LocalDateTime moment;
    private OrderStatus2 status;

    private Client2 client;

    private List<OrderItem2> items = new ArrayList<>();

    public Order2(){

    }

    public Order2(LocalDateTime moment, OrderStatus2 status, Client2 client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public OrderStatus2 getStatus() {
        return status;
    }

    public void setStatus(OrderStatus2 status) {
        this.status = status;
    }

    public Client2 getClient() {
        return client;
    }

    public void setClient(Client2 client) {
        this.client = client;
    }

    public void addItem(OrderItem2 item){
        items.add(item);
    }

    public void removeItem(OrderItem2 item){
        items.remove(item);
    }

    public double total(){
        double sum = 0;
        for(OrderItem2 it : items){
            sum = sum + it.subTotal();
        }
        return sum;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: ");
        sb.append(fmt1.format(getMoment())).append("\n");
        sb.append("Order status: ");
        sb.append(getStatus()).append("\n");
        sb.append("Client: ");
        sb.append(getClient()).append("\n");
        sb.append("Order items: \n");
        for(OrderItem2 item : items){
            sb.append(item).append("\n");
        }
        sb.append("Total price: $").append(String.format("%.2f", total()));
        return sb.toString();


    }


}
