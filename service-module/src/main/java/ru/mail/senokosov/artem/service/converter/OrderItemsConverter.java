package ru.mail.senokosov.artem.service.converter;

import ru.mail.senokosov.artem.repository.model.OrderItems;
import ru.mail.senokosov.artem.service.model.OrderItemsDTO;

public interface OrderItemsConverter {

    OrderItemsDTO convert(OrderItems orderItems);
}
