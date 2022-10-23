package ocp.good;

public class Invoice {
    private Book book;
    private  int quantity;
    private  double discount;
    private double taxRate;

    private double total;

    public Invoice(Book book, int quantity, double discount, double taxRate) {
        this.book = book;
        this.quantity = quantity;
        this.discount = discount;
        this.taxRate = taxRate;
        this.total=this.calculateTotal();
    }

    public double calculateTotal() {
        double price = ((book.price - book.price * discount) * this.quantity);

        double priceWithTaxes = price * (1 + taxRate);

        return priceWithTaxes;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getDiscount() {
        return discount;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public double getTotal() {
        return total;
    }





}
