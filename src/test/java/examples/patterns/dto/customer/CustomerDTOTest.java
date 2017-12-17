package examples.patterns.dto.customer;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class CustomerDTOTest {

    private static final Logger LOG = LogManager.getLogger(CustomerDTOTest.class);

    private CustomerCreator customerCreator = new CustomerCreator(10);

    @Test
    public void createdCustomersList() {
        List<CustomerDTO> testCustomerDTOList = customerCreator.createdCustomers();
        Assert.assertTrue("incorrect list size", testCustomerDTOList.size() > 0);
        Assert.assertEquals(testCustomerDTOList.size(), CustomerCreator.getDefaultValue());
    }

    @Test
    public void printAllCustomersInfo() {
        List<CustomerDTO> testCustomerDTOList = customerCreator.createdCustomers();
        System.out.println("----------          PRINT CUSTOMERS DATA            ----------");
        testCustomerDTOList.forEach(customer -> {
            String dataText = String.format("First name: %s Last name: %s Company: %s Customer ID: %s",
                    customer.getFirstName(),
                    customer.getLasName(),
                    customer.getCompany(),
                    customer.getSerialVersionUid());
            System.out.printf(dataText + "\n");
            LOG.debug(dataText);
        });
    }

}
