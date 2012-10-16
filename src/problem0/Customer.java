package problem0;

//Understands how to identify who placed the order.
public class Customer {
    private String customerName;
    private String customerAddress;

    public Customer(String customerName, String customerAddress) {
        this.customerName  = customerName ;
        this.customerAddress = customerAddress ;
    }

    public String details() {
        return customerName+"\t"+customerAddress+"\n";
    }
}