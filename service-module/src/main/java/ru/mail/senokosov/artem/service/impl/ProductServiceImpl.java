package ru.mail.senokosov.artem.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import ru.mail.senokosov.artem.repository.ProductRepository;
import ru.mail.senokosov.artem.repository.model.Product;
import ru.mail.senokosov.artem.service.ProductService;
import ru.mail.senokosov.artem.service.converter.ProductConverter;
import ru.mail.senokosov.artem.service.exception.ServiceException;
import ru.mail.senokosov.artem.service.model.ProductDTO;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Log4j2
@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;
    private ProductConverter productConverter;

    @Override
    @Transactional
    public ProductDTO getProductById(Long id) throws ServiceException {
        Product product = productRepository.findById(id);
        if (Objects.nonNull(product)) {
            return productConverter.convert(product);
        } else {
            throw new ServiceException(String.format("Product with ID=%s not found", id));
        }
    }

    @Override
    @Transactional
    public List<ProductDTO> getAllProducts() throws ServiceException {
        List<Product> allProducts = productRepository.findAll();
        if (allProducts.isEmpty()) {
            throw new ServiceException("Product not found");
        }
        return allProducts.stream()
                .map(productConverter::convert)
                .collect(Collectors.toList());
    }

    @Override
    @Transactional
    public ProductDTO persist(ProductDTO productDTO) throws ServiceException {
        Product product = productConverter.convert(productDTO);
        productRepository.persist(product);
        return productConverter.convert(product);
    }

    @Override
    @Transactional
    public boolean deleteProductById(Long id) {
        productRepository.removeById(id);
        return true;
    }
}
