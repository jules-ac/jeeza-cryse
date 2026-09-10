public class Invoice {
    private String itemName;
    private double unitPrice;
    private int unitQuantity;
    private double taxPercent;
    public Invoice(String n, double p, int q, double t) {
        itemName = n;
        unitPrice = p;
        unitQuantity = q;
        taxPercent = t;
    }
    public void calcAndPrint() {
        double subtotal = unitQuantity*unitPrice;
        double taxApplicable = taxPercent*.01;
        double total = subtotal+(subtotal*taxApplicable);
        double taxTotal = subtotal*taxApplicable;
        System.out.printf("%10s %10s %10s %10s %10s %10s\n","Item","Quantity","Unit Price","Subtotal","Tax","Total");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.printf("%10s %10d %10.2f %10.2f %10.2f %10.2f\n", itemName, unitQuantity, unitPrice, subtotal, taxTotal, total);
    }
}

void main() {
    Invoice testInvoice = new Invoice("Frozen tater tots",4.99,15,4);
    testInvoice.calcAndPrint();

    System.out.println("Expected: Tater tots   15   4.99   74.85   2.99   77.84");
}
