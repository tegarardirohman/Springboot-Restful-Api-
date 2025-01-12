package com.enigmacamp.tokonyadia.repository;

import com.enigmacamp.tokonyadia.model.entity.Product;
import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@ActiveProfiles("test")
class ProductRepositoryTest {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    EntityManager entityManager;

    @Test
    void saveProductSuccess() {
        Product product = Product.builder()
                .name("product_jpa_test")
                .stock(23)
                .price(230000L)
                .build();

        Product savedProduct = productRepository.saveAndFlush(product);

        assertNotNull(entityManager.find(Product.class, savedProduct.getId()));
    }

}