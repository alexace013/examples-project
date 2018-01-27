package examples.patterns.dto.customer;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import utils.projectPropertiesLoader.Property;
import utils.propertyLoader.PropertyLoaderPrototype;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.IntStream;

public final class CustomerCreator {

    private int customerCount;
    private static final PropertyLoaderPrototype CUSTOMER_PROPERTY = new PropertyLoaderPrototype(Property.CUSTOMER.getProperty());
    private static final int DEFAULT_VALUE = CUSTOMER_PROPERTY.getParamAsIntegerValue("default.value");

    @Contract(pure = true)
    public static int getDefaultValue() {
        return DEFAULT_VALUE;
    }

    public CustomerCreator() {
        customerCount = DEFAULT_VALUE;
    }

    public CustomerCreator(final int customerCount) {
        this.customerCount = customerCount;
    }

    public List<CustomerDTO> createdCustomers() {
        List<CustomerDTO> customersList = new ArrayList<>();
        IntStream.range(0, customerCount).mapToObj(customer -> new CustomerDTO())
                .forEach(customerDTO -> {
                    CustomerDataGenerator dataGenerator = new CustomerDataGenerator();
                    customerDTO.setFirstName(dataGenerator.generateRandomCustomerData()[0]);
                    customerDTO.setLasName(dataGenerator.generateRandomCustomerData()[1]);
                    customerDTO.setCompany(dataGenerator.generateRandomCustomerData()[2]);
                    customersList.add(customerDTO);
                });
        return customersList;
    }

    private class CustomerDataGenerator {

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
