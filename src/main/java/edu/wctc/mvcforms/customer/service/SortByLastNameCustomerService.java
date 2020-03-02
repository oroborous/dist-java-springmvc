package edu.wctc.mvcforms.customer.service;

import edu.wctc.mvcforms.customer.dao.CustomerDAO;
import edu.wctc.mvcforms.customer.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
public class SortByLastNameCustomerService implements CustomerService {
    @Autowired
    private CustomerDAO customerDAO;

    @Override
    public List<Customer> getCustomerList() {
        List<Customer> list = customerDAO.getCustomerList();
        list.sort(Comparator.comparing(Customer::getLastName));
        return list;
    }
}
