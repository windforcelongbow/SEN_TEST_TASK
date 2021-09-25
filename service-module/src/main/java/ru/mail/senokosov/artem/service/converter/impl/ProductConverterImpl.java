package ru.mail.senokosov.artem.service.converter.impl;

import org.springframework.stereotype.Component;
import ru.mail.senokosov.artem.repository.model.Product;
import ru.mail.senokosov.artem.service.converter.ProductConverter;
import ru.mail.senokosov.artem.service.model.ProductDTO;

@Component
public class ProductConverterImpl implements ProductConverter {
    @Override
    public ProductDTO convert(Product product) {
        return null;
    }

    @Override
    public Product convert(ProductDTO productDTO) {
        return null;
    }
}
