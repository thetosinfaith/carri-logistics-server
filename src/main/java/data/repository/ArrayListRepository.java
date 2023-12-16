package data.repository;

import data.models.Customer;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRepository {
    public class ArraylistRepo implements CustomerRepository {
        List<Customer> customers = new ArrayList<>();
        int id = 1;

        public Customer save(Customer customer) {
            customer.setId(id + "");

            customers.add(customer);

            id++;
            return customer;
        }
    }
}
