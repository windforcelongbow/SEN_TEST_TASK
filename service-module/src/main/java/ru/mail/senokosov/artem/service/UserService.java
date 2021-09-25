package ru.mail.senokosov.artem.service;

import ru.mail.senokosov.artem.service.exception.ServiceException;
import ru.mail.senokosov.artem.service.model.UserDTO;

import java.util.List;

public interface UserService {

    UserDTO getUserById(Long id) throws ServiceException;

    List<UserDTO> getAllUsers() throws ServiceException;
}
