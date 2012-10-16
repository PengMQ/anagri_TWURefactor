package problem0;

//Understands what are the components of a bill.
public class OrderReceipt {
    private Order order;
    private Customer customer;

    public OrderReceipt(Order order, Customer customer) {
        this.order = order;
        this.customer=customer;
	}

	public String printReceipt() {
        double totalSalesTax = order.totalSalesTax();
        double totalBill = order.totalBill(totalSalesTax);
        StringBuilder output = new StringBuilder();

        printHeader(output);
        order.printAllItems(output);
        printFooter(output, totalSalesTax, totalBill);

		return output.toString();
	}

    private void printFooter(StringBuilder output, double totalSalesTax, double totalBill) {
        output.append("Sales Tax").append('\t').append(totalSalesTax);
        output.append("Total Amount").append('\t').append(totalBill);
    }

    private void printHeader(StringBuilder output) {
        output.append("======Printing Orders======\n");
        output.append(customer.details());
    }
}