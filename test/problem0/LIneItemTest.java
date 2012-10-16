package problem0;


import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class LIneItemTest {
    @Test
    public void testToString() {
        LineItem listItem = new LineItem("apple",2.0, 2);
        String result = listItem.toString();
        assertThat(result,is("apple\t2.0\t2\t4.0\n"));
    }


}
