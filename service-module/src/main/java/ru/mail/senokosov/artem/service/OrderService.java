package ru.mail.senokosov.artem.service;

import ru.mail.senokosov.artem.repository.model.Order;
import ru.mail.senokosov.artem.service.exception.ServiceException;
import ru.mail.senokosov.artem.service.model.OrderDTO;

import java.util.List;

public interface OrderService {

    OrderDTO getOrderById(Long id) throws ServiceException;

    List<OrderDTO> getAllOrders() throws ServiceException;

    OrderDTO persist(OrderDTO orderDTO) throws ServiceException;

    OrderDTO updateOrder(Long id, OrderDTO orderDTO) throws ServiceException;
}
