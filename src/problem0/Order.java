package problem0;

import java.util.ArrayList;
import java.util.List;
//Understands the details of a set of purchases.
public class Order {
    public static final double SALES_TAX_RATE = 0.10;
    List<LineItem> goodsList;

    public Order(ArrayList<LineItem> listOfItems) {
        this.goodsList = listOfItems;
    }

    public double totalSalesTax() {
        double totalSalesTax = 0.0;
        for (LineItem lineItem : goodsList) {
            totalSalesTax += lineItem.totalAmount() * SALES_TAX_RATE;
        }
        return totalSalesTax;
    }

    private double calculateTotalShelfPrice() {
        double totalShelfPrice=0;
        for (LineItem lineItem : goodsList) {
            totalShelfPrice += lineItem.totalAmount();
        }
        return totalShelfPrice;
    }

    public double totalBill(double totalSalesTax) {

        double totalShelfPrice = calculateTotalShelfPrice();

        return totalShelfPrice + totalSalesTax;
    }

    public void printAllItems(StringBuilder output) {
        for (LineItem lineItem : goodsList) {
            output.append(lineItem);
        }
    }
}
