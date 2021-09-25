package ru.mail.senokosov.artem.repository.impl;

import org.springframework.stereotype.Repository;
import ru.mail.senokosov.artem.repository.ProductRepository;
import ru.mail.senokosov.artem.repository.model.Product;

@Repository
public class ProductRepositoryImpl extends GenericRepositoryImpl<Long, Product> implements ProductRepository {
}
