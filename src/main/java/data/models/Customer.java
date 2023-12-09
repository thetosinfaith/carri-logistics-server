package data.models;

import lombok.Data;

@Data
public class Customer {
    private String id;
    private String name;
    private String email;
    private String pickupLocation;
    private String deliveryAddress;

}
