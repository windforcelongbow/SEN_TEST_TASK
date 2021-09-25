package ru.mail.senokosov.artem.service;

import ru.mail.senokosov.artem.service.exception.ServiceException;
import ru.mail.senokosov.artem.service.model.OrderItemsDTO;

public interface OrderItemsService {

    OrderItemsDTO updateOrderItems(Long id, OrderItemsDTO orderItemsDTO) throws ServiceException;
}
