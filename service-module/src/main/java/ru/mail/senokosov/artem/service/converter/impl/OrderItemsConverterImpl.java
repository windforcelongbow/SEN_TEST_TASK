package ru.mail.senokosov.artem.service.converter.impl;

import org.springframework.stereotype.Component;
import ru.mail.senokosov.artem.repository.model.OrderItems;
import ru.mail.senokosov.artem.service.converter.OrderItemsConverter;
import ru.mail.senokosov.artem.service.model.OrderItemsDTO;

@Component
public class OrderItemsConverterImpl implements OrderItemsConverter {
    @Override
    public OrderItemsDTO convert(OrderItems orderItems) {
        return null;
    }
}
