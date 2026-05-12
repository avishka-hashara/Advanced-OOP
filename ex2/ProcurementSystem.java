public class ProcurementSystem {

    public static void main(String[] args) {

        double[][] purchaseOrders = {
                { 50.0, 15.50 },
                { 200.0, 5.25 },
                { 10.0, 150.00 }
        };

        double grandTotal = 0.0;

        for (int i = 0; i < purchaseOrders.length; i++) {

            double quantity = purchaseOrders[i][0];
            double unitPrice = purchaseOrders[i][1];
            double linetotal = quantity * unitPrice;

            System.out.println("Line item " + (i + 1) + "Total: Rs " + linetotal);
            grandTotal += linetotal;

        }

        System.out.println("---------------------------");
        System.out.println("Grand total     : Rs " + grandTotal);

    }

}