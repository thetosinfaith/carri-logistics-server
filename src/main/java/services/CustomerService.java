package services;

import data.models.Customer;
import data.repository.CustomerRepository;
import dto.request.CreateAccountRequest;
import dto.response.CreateAccountResponse;

import static utils.Mappers.mapCreateAccountResponse;
import static utils.Mappers.mapCustomer;

public class CustomerService {
    CustomerRepository customerRepository = new CustomerRepository() {
        @Override
        public Customer save(Customer customer) {
            return customer;
        }
    };

        public CreateAccountResponse createAccountResponse(CreateAccountRequest createAccountRequest) {
            Customer customer = mapCustomer(createAccountRequest);

            Customer savedCustomer = customerRepository.save(customer);

            return mapCreateAccountResponse(savedCustomer);

        }


}


