package edu.wctc.mvcforms.customer.dao;

import edu.wctc.mvcforms.customer.entity.Customer;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Primary
@Repository
public class CustomerFileDAO implements CustomerDAO {
    @Override
    public List<Customer> getCustomerList() {
        List<Customer> list = new ArrayList<>();

        Resource resource = new ClassPathResource("/customers.txt");

        try (Scanner input = new Scanner(resource.getFile())) {
            while (input.hasNext()) {
                Customer customer = new Customer();
                customer.setFirstName(input.nextLine());
                customer.setLastName(input.nextLine());
                customer.setFreePasses(Integer.parseInt(input.nextLine()));
                customer.setPostalCode(input.nextLine());
                customer.setEventCode(input.nextLine());
                list.add(customer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return list;
    }
}
