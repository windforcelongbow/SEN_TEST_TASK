package ru.mail.senokosov.artem.service.converter.impl;

import org.springframework.stereotype.Component;
import ru.mail.senokosov.artem.repository.model.Order;
import ru.mail.senokosov.artem.service.converter.OrderConverter;
import ru.mail.senokosov.artem.service.model.OrderDTO;

@Component
public class OrderConverterImpl implements OrderConverter {
    @Override
    public OrderDTO convert(Order order) {
        return null;
    }

    @Override
    public Order convert(OrderDTO orderDTO) {
        return null;
    }
}
