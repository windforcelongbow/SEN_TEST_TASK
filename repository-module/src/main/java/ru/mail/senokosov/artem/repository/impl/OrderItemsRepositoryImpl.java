package ru.mail.senokosov.artem.repository.impl;

import org.springframework.stereotype.Repository;
import ru.mail.senokosov.artem.repository.OrderItemsRepository;
import ru.mail.senokosov.artem.repository.model.OrderItems;

@Repository
public class OrderItemsRepositoryImpl extends GenericRepositoryImpl<Long, OrderItems> implements OrderItemsRepository {
}
