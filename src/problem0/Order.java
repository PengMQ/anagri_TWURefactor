package problem0;

import java.util.ArrayList;
import java.util.List;
//Understands the information for every receipt.
public class Order {
    public static final double SALES_TAX_RATE = 0.10;
    List<LineItem> goodsList;

    public Order(ArrayList<LineItem> listOfItems) {
        this.goodsList = listOfItems;
    }

    public List<LineItem> getLineItems() {
        return goodsList;
    }

    public double totalSalesTax() {
        double totalSalesTax = 0.0;
        for (LineItem lineItem : goodsList) {
            totalSalesTax += lineItem.totalAmount() * SALES_TAX_RATE;
        }
        return totalSalesTax;

    }

    private double calculateSubtotal() {
        double subtotal=0;
        for (LineItem lineItem : getLineItems()) {

            subtotal += lineItem.totalAmount();
        }
        return subtotal;
    }

    public double totalBill(double totalSalesTax) {

        double subtotal = calculateSubtotal();

        return subtotal + totalSalesTax;
    }

    public void printAllItems(StringBuilder output) {
        for (LineItem lineItem : getLineItems()) {
            output.append(lineItem);
        }
    }
}
