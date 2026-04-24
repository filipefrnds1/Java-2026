package projectherança.entities;

public class ImportedProduct extends Product{

    private Double customsFee;

    public ImportedProduct(){
        super();
    }

    public ImportedProduct(String name, Double price, Double customsFee){
        super(name,price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    @Override
    public String priceTag(){
        StringBuilder sb = new StringBuilder();
        sb.append(getName()).append(" $ ").append(String.format("%.2f",totalPrice())).append(" (Customs fee: $ ").append(getCustomsFee()).append(")");
        return sb.toString();
    }

    public double totalPrice(){
        return getPrice() + getCustomsFee();
    }
}
