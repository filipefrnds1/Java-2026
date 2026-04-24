package projectherança.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product{

    private LocalDate manufactureDate;

    public DateTimeFormatter ftm1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public UsedProduct() {
        super();
    }

    public UsedProduct(String name, Double price, LocalDate manufactureDate) {
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
        sb.append(getName()).append(" (used) $ ").append(String.format("%.2f",getPrice())).append(" (Manufacture date: ").append(getManufactureDate().format(ftm1)).append(")");
        return sb.toString();
    }
}
