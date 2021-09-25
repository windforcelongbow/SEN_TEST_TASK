package ru.mail.senokosov.artem.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import ru.mail.senokosov.artem.repository.OrderItemsRepository;
import ru.mail.senokosov.artem.repository.model.OrderItems;
import ru.mail.senokosov.artem.service.OrderItemsService;
import ru.mail.senokosov.artem.service.converter.OrderItemsConverter;
import ru.mail.senokosov.artem.service.exception.ServiceException;
import ru.mail.senokosov.artem.service.model.OrderItemsDTO;

import javax.transaction.Transactional;
import java.util.Objects;

@RequiredArgsConstructor
@Log4j2
@Service
public class OrderItemsServiceImpl implements OrderItemsService {

    private OrderItemsRepository orderItemsRepository;
    private OrderItemsConverter orderItemsConverter;

    @Override
    @Transactional
    public OrderItemsDTO updateOrderItems(Long id, OrderItemsDTO orderItemsDTO) throws ServiceException {
        OrderItems orderItems = orderItemsRepository.findById(id);
        if (Objects.nonNull(orderItems)) {
            Long orderItemsQuantity = orderItemsDTO.getQuantity();
            orderItems.setQuantity(orderItemsQuantity);
            orderItemsRepository.merge(orderItems);
            return orderItemsConverter.convert(orderItems);
        } else {
            throw new ServiceException(String.format("Not found", id));
        }
    }
}
