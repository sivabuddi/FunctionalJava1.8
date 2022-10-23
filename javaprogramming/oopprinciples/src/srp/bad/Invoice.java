package srp.bad;

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

    public void printInvoice() {
        System.out.println(quantity + "x " + book.name + " " +          book.price + "$");
        System.out.println("Discount Rate: " + discount);
        System.out.println("Tax Rate: " + taxRate);
        System.out.println("Total: " + total);
    }

    public void saveToFile(String filename) {
        System.out.println("Saved file in Hard Disk with name is "+filename);
    }




}
