package ru.mail.senokosov.artem.service.model;

import lombok.Data;
import ru.mail.senokosov.artem.repository.model.Order;
import ru.mail.senokosov.artem.repository.model.Product;

@Data
public class OrderItemsDTO {

    private Long id;
    private Order order;
    private Product product;
    private Long quantity;
}
