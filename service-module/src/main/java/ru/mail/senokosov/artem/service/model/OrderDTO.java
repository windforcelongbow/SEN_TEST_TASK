package ru.mail.senokosov.artem.service.model;

import lombok.Data;
import ru.mail.senokosov.artem.repository.model.User;

@Data
public class OrderDTO {

    private Long id;
    private String status;
    private String createAt;
    private User user;
}
