package ex1;

public class Main {

    public static void main(String[] args) {
        PurchaseOrder order1 = new PurchaseOrder();

        order1.vendorName = "TechCorp suppliers";
        order1.totalAmount = 1450.50;
        order1.isApproved = false;

        order1.approveOrder();
    }

}
