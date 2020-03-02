package edu.wctc.mvcforms.customer.dao;

import edu.wctc.mvcforms.customer.entity.Customer;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CustomerTestDAO implements CustomerDAO {
    @Override
    public List<Customer> getCustomerList() {
        Customer c = new Customer();

        c.setFirstName("Stacy");
        c.setLastName("Read");
        c.setFreePasses(1);
        c.setPostalCode("A1A 1A1");
        c.setEventCode("PAX South");

        List<Customer> list = new ArrayList<>();
        list.add(c);
        return list;
    }
}
