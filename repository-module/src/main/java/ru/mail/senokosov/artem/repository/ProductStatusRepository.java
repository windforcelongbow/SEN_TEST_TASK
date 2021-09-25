package ru.mail.senokosov.artem.repository;

import ru.mail.senokosov.artem.repository.model.ProductStatus;

public interface ProductStatusRepository extends GenericRepository<Long, ProductStatus> {

    ProductStatus findProductStatusByName(String name);
}
