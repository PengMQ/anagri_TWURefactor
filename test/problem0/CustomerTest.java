package problem0;


import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

//Ensures that customer
public class CustomerTest {
    @Test
    public void testCustomerDetails() {
        Customer customer=new Customer("Mengqiu","Chengdu");
        String customerDetails=customer.details();
        assertThat(customerDetails, is("Mengqiu\tChengdu\n"));

    }
}
