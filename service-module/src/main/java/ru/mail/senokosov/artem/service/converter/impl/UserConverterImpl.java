package ru.mail.senokosov.artem.service.converter.impl;

import org.springframework.stereotype.Component;
import ru.mail.senokosov.artem.repository.model.User;
import ru.mail.senokosov.artem.service.converter.UserConverter;
import ru.mail.senokosov.artem.service.model.UserDTO;

@Component
public class UserConverterImpl implements UserConverter {
    @Override
    public UserDTO convert(User user) {
        return null;
    }

    @Override
    public User convert(UserDTO userDTO) {
        return null;
    }
}
