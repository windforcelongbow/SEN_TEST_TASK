package ru.mail.senokosov.artem.service.converter;

import ru.mail.senokosov.artem.repository.model.Product;
import ru.mail.senokosov.artem.repository.model.User;
import ru.mail.senokosov.artem.service.model.ProductDTO;
import ru.mail.senokosov.artem.service.model.UserDTO;

public interface UserConverter {

    UserDTO convert(User user);

    User convert(UserDTO userDTO);
}
