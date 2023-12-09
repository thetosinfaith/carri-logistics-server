package data.models;

import lombok.Data;

@Data
public class Order {
    Customer customer;
    Item item;
    Rider rider;
    private String orderID;
    private boolean deliveryStatus;
}
