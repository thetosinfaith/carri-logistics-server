package data.models;

import lombok.Data;

@Data
public class Item {
    Customer customer;
    Item item;
    Rider rider;
    private String orderID;
    private boolean deliveryStatus;
}
