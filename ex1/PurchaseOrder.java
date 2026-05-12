package ex1;

public class PurchaseOrder {

    String vendorName;
    double totalAmount;
    boolean isApproved;

    public void approveOrder() {
        isApproved = true;
        System.out.println("Purchase Order for " + vendorName + " has been approved. Total: Rs. " + totalAmount);

    }
}
