package ru.mail.senokosov.artem.service.converter;

import ru.mail.senokosov.artem.repository.model.Product;
import ru.mail.senokosov.artem.service.model.ProductDTO;

public interface ProductConverter {

    ProductDTO convert(Product product);

    Product convert(ProductDTO productDTO);
}
