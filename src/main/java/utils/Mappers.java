package utils;

import data.models.Customer;
import dto.request.CreateAccountRequest;
import dto.response.CreateAccountResponse;

public class Mappers {
        public static CreateAccountResponse mapCreateAccountResponse(Customer savedCustomer) {
            CreateAccountResponse createAccountResponse = new CreateAccountResponse();
            createAccountResponse.setId(savedCustomer.getId());

            return createAccountResponse;
        }
        public static Customer mapCustomer(CreateAccountRequest createAccountRequest) {
            Customer customer = new Customer();
            customer.setEmail(createAccountRequest.getEmail());
            customer.setName(createAccountRequest.getName());
            return customer;
        }
    }

