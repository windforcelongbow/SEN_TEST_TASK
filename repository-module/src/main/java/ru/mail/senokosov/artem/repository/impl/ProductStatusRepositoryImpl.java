package ru.mail.senokosov.artem.repository.impl;

import org.springframework.stereotype.Repository;
import ru.mail.senokosov.artem.repository.ProductStatusRepository;
import ru.mail.senokosov.artem.repository.model.ProductStatus;

import javax.persistence.Query;

@Repository
public class ProductStatusRepositoryImpl extends GenericRepositoryImpl<Long, ProductStatus> implements ProductStatusRepository {

    @Override
    public ProductStatus findProductStatusByName(String name) {
        String stringQuery = "SELECT p FROM ProductStatus as p WHERE p.statusName=:statusName";
        Query query = entityManager.createQuery(stringQuery);
        query.setParameter("statusName", name);
        return (ProductStatus) query.getSingleResult();
    }
}
