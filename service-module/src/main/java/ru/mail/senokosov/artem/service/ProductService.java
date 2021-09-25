package ru.mail.senokosov.artem.service;

import ru.mail.senokosov.artem.service.exception.ServiceException;
import ru.mail.senokosov.artem.service.model.ProductDTO;

import java.util.List;

public interface ProductService {

    ProductDTO getProductById(Long id) throws ServiceException;

    List<ProductDTO> getAllProducts() throws ServiceException;

    ProductDTO persist(ProductDTO productDTO) throws ServiceException;

    boolean deleteProductById(Long id);
}
