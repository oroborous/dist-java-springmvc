package edu.wctc.mvcforms.customer.dao;

import edu.wctc.mvcforms.customer.entity.Customer;

import java.util.List;

public interface CustomerDAO {
    List<Customer> getCustomerList();
}
