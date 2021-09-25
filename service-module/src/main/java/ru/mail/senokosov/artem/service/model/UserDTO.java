package ru.mail.senokosov.artem.service.model;

import lombok.Data;
import ru.mail.senokosov.artem.repository.model.Order;
import ru.mail.senokosov.artem.repository.model.Role;

import java.util.HashSet;
import java.util.Set;

@Data
public class UserDTO {

    private Long id;
    private String email;
    private String password;
    private Role role;
    private Set<Order> orders = new HashSet<>();
}
