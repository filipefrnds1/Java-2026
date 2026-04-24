package projectherança.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UserProduct extends Product{

    private LocalDate manufactureDate;

    public DateTimeFormatter ftm1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public UserProduct() {
        super();
    }

    public UserProduct(String name, Double price, LocalDate manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag(){
        StringBuilder sb = new StringBuilder();
        sb.append(getName()).append(" (used) $ ").append(String.format("%.2f",getPrice())).append(" (Manufacture date: ").append(getManufactureDate().format(ftm1));
        return sb.toString();
    }
}
