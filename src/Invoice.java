// Julia Conti - CSC 102, Fall 2026
// Program 1: Invoice printer

/**
 * Accepts an item name, price, quantity, and tax rate,
 * then calculates the tax,subtotal, and total,
 * then prints the results.
 */
public class Invoice {
    private String itemName;
    private double unitPrice;
    private int unitQuantity;
    private double taxPercent;
    /**
     * Constructor which accepts all necessary data to
     * create the invoice.
     * @param n Name of item
     * @param p Unit price of item
     * @param q Quantity of item
     * @param t Tax rate in %
     */
    public Invoice(String n, double p, int q, double t) {
        itemName = n;
        unitPrice = p;
        unitQuantity = q;
        taxPercent = t;
    }
    /**
     * Calculates tax, subtotal, and total and
     * prints an invoice.
     */
    public void calcAndPrint() {
        double subtotal = unitQuantity * unitPrice;
        double taxApplicable = taxPercent * .01;
        double total = subtotal + (subtotal * taxApplicable);
        double taxTotal = subtotal * taxApplicable;
        System.out.println("Julia's Spud Supercenter\nInvoice");
        System.out.printf("%15s %15s %15s %15s %15s %15s\n", "Item", "Quantity", "Unit Price", "Subtotal", "Tax", "Total");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.printf("%15s %15d %15.2f %15.2f %15.2f %15.2f\n", itemName, unitQuantity, unitPrice, subtotal, taxTotal, total);
    }
    /** main method */
    public static void main(String[] args) {
        Invoice testInvoice = new Invoice("Tater tots", 4.99, 15, 4);
        testInvoice.calcAndPrint();
        System.out.println("\n\nExpected: Tater tots   15   4.99   74.85   2.99   77.84");
    }
}
