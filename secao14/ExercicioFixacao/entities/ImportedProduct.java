package secao14.ExercicioFixacao.entities;

public class ImportedProduct extends Product {
    private Double customsFee;

    public ImportedProduct(){
        super();
    }

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getcustomsFee() {
        return customsFee;
    }

    public void setcustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    @Override
    public String priceTag(){
        return super.getName() +" $ "+
        String.format("%.2f",totalPrice()) + 
        " (Customs fee $ "+
        String.format("%.2f",customsFee)+")";
    }

    public Double totalPrice(){
        return super.getPrice() +
            (super.getPrice()+customsFee);
    }
}
