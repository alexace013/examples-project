package examples.patterns.dto.customer;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public final class CustomerCreator {

    private int customerCount;

    public CustomerCreator() {

    }

    public CustomerCreator(final int customerCount) {
        this.customerCount = customerCount;
    }

    public List<CustomerDTO> createdCustomers() {
        List<CustomerDTO> customersList = new ArrayList<>();
        for (int i = 0; i < customerCount; i++) {
            CustomerDTO customerDTO = new CustomerDTO();
            DataGenerator dataGenerator = new DataGenerator();
            customerDTO.setFirstName(dataGenerator.generateRandomCustomerData()[0]);
            customerDTO.setLasName(dataGenerator.generateRandomCustomerData()[1]);
            customerDTO.setCompany(dataGenerator.generateRandomCustomerData()[2]);
            customersList.add(customerDTO);
        }
        return customersList;
    }

    private class DataGenerator {

        private static final String GTC_FIRST_NAME_TEXT = "CustomerFirstName_%d";
        private static final String GTC_LAST_NAME_TEXT = "CustomerLastName_%d";
        private static final String GTC_COMPANY_TEXT = "CustomerCompany_%d";


        @NotNull
        protected String[] generateRandomCustomerData() {
            return new String[]{
                    generateRandomCustomerFirstName(),
                    generateRandomCustomerLastName(),
                    generateRandomCustomerCompany()
            };
        }

        private String generateRandomCustomerFirstName() {
            return String.format(GTC_FIRST_NAME_TEXT, UUID.randomUUID().hashCode());
        }

        private String generateRandomCustomerLastName() {
            return String.format(GTC_LAST_NAME_TEXT, UUID.randomUUID().hashCode());
        }

        private String generateRandomCustomerCompany() {
            return String.format(GTC_COMPANY_TEXT, UUID.randomUUID().hashCode());
        }

    }

}
