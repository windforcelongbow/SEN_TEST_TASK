package ru.mail.senokosov.artem.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import ru.mail.senokosov.artem.repository.UserRepository;
import ru.mail.senokosov.artem.repository.model.User;
import ru.mail.senokosov.artem.service.UserService;
import ru.mail.senokosov.artem.service.converter.UserConverter;
import ru.mail.senokosov.artem.service.exception.ServiceException;
import ru.mail.senokosov.artem.service.model.UserDTO;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Log4j2
@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    private UserConverter userConverter;

    @Override
    @Transactional
    public UserDTO getUserById(Long id) throws ServiceException {
        User user = userRepository.findById(id);
        if (Objects.nonNull(user)) {
            return userConverter.convert(user);
        } else {
            throw new ServiceException(String.format("User with ID=%s not found", id));
        }
    }

    @Override
    @Transactional
    public List<UserDTO> getAllUsers() throws ServiceException {
        List<User> allUsers = userRepository.findAll();
        if (allUsers.isEmpty()) {
            throw new ServiceException("Users not found");
        }
        return allUsers.stream()
                .map(userConverter::convert)
                .collect(Collectors.toList());
    }
}
