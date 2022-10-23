package ocp.good;

public class InvoicePrinter {

    private Invoice invoice;
    private Book book;

    public InvoicePrinter(Invoice invoice, Book book) {
        this.invoice = invoice;
        this.book = book;
    }

    public void printInvoice() {
        System.out.println(invoice.getQuantity() + "x " + book.getName() + " " +book.getPrice() + "$");
        System.out.println("Discount Rate: " + invoice.getDiscount());
        System.out.println("Tax Rate: " + invoice.getTaxRate());
        System.out.println("Total: " + invoice.getTotal());
    }

}
