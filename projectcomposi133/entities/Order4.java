package projectcomposi133.entities;

import projectcomposi133.enums.OrderStatus4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Order4 {

    DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm:ss");

    private LocalDate moment;
    private OrderStatus4 status;
    private Client4 client;

    private List<OrderItem4> list = new ArrayList<>();

    public Order4() {
    }

    public Order4(LocalDate moment, OrderStatus4 status, Client4 client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public LocalDate getMoment() {
        return moment;
    }

    public void setMoment(LocalDate moment) {
        this.moment = moment;
    }

    public OrderStatus4 getStatus() {
        return status;
    }

    public void setStatus(OrderStatus4 status) {
        this.status = status;
    }

    public Client4 getClient() {
        return client;
    }

    public void setClient(Client4 client) {
        this.client = client;
    }

    public void removeItem(OrderItem4 order){
        list.remove(order);
    }

    public void addItem(OrderItem4 order){
        list.add(order);
    }

    public Double total(){
        double sum = 0.0;
        for(OrderItem4 od : list){
            sum += od.subTotal();
        }
        return sum;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("\nORDER SUMMARY: \n");
        sb.append("Order moment: ").append(getMoment().format(fmt1)).append("\n");
        sb.append("Order status: ").append(getStatus()).append("\n");
        sb.append("Client: ").append(getClient());
        sb.append("Order items: \n");
        for(OrderItem4 it : list){
            sb.append(it);
        }
        sb.append("Total price: $").append(String.format("%.2f", total()));
        return sb.toString();
    }
}
