package ru.mail.senokosov.artem.service.model;

import lombok.Data;
import ru.mail.senokosov.artem.repository.model.ProductStatus;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
public class ProductDTO {

    private Long id;
    private String name;
    private Integer price;
    private ProductStatus status;
    private LocalDateTime localDateTime;
}
