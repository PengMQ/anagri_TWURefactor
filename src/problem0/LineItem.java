package problem0;
//Understands the components of each purchase appearing in a order.
public class LineItem {
	private String description;
	private double price;
	private int quantity;

	public LineItem(String description, double price, int quantity) {
		this.description = description;
		this.price = price;
		this.quantity = quantity;
	}

    double totalAmount() {
        return price * quantity;
    }

    @Override
    public String toString(){
        return description+"\t"+price+"\t"+quantity+"\t"+totalAmount()+"\n";
    }
}