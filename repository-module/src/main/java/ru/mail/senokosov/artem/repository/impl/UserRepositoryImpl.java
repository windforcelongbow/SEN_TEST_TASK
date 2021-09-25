package ru.mail.senokosov.artem.repository.impl;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;
import ru.mail.senokosov.artem.repository.UserRepository;
import ru.mail.senokosov.artem.repository.model.User;

import javax.persistence.NoResultException;
import javax.persistence.Query;

@Log4j2
@Repository
public class UserRepositoryImpl extends GenericRepositoryImpl<Long, User> implements UserRepository {

    @Override
    public User findUserByUsername(String email) {
        String stringQuery = "SELECT u FROM User as u WHERE u.email=:email";
        Query query = entityManager.createQuery(stringQuery);
        query.setParameter("email", email);
        try {
            query.getSingleResult();
        } catch (NoResultException e) {
            log.error(e.getMessage(), e);
            return null;
        }
        return (User) query.getSingleResult();
    }
}
