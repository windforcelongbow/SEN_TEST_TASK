package ru.mail.senokosov.artem.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import ru.mail.senokosov.artem.repository.OrderRepository;
import ru.mail.senokosov.artem.repository.model.Order;
import ru.mail.senokosov.artem.service.OrderService;
import ru.mail.senokosov.artem.service.converter.OrderConverter;
import ru.mail.senokosov.artem.service.exception.ServiceException;
import ru.mail.senokosov.artem.service.model.OrderDTO;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Log4j2
@Service
public class OrderServiceImpl implements OrderService {

    private OrderRepository orderRepository;
    private OrderConverter orderConverter;

    @Override
    @Transactional
    public OrderDTO getOrderById(Long id) throws ServiceException {
        Order order = orderRepository.findById(id);
        if (Objects.nonNull(order)) {
            return orderConverter.convert(order);
        } else {
            throw new ServiceException(String.format("Order with ID=%s not found", id));
        }
    }

    @Override
    @Transactional
    public List<OrderDTO> getAllOrders() throws ServiceException {
        List<Order> allOrders = orderRepository.findAll();
        if (allOrders.isEmpty()) {
            throw new ServiceException("Orders not found");
        }
        return allOrders.stream()
                .map(orderConverter::convert)
                .collect(Collectors.toList());
    }

    @Override
    @Transactional
    public OrderDTO persist(OrderDTO orderDTO) throws ServiceException {
        Order order = orderConverter.convert(orderDTO);
        orderRepository.persist(order);
        return orderConverter.convert(order);
    }

    @Override
    @Transactional
    public OrderDTO updateOrder(Long id, OrderDTO orderDTO) throws ServiceException {
        Order order = orderRepository.findById(id);
        if (Objects.nonNull(order)) {
            String orderStatus = orderDTO.getStatus();
            order.setStatus(orderStatus);
            String orderDate = orderDTO.getCreateAt();
            order.setCreateAt(orderDate);
            return orderConverter.convert(order);
        } else {
            throw new ServiceException(String.format("Not found", id));
        }
    }
}
