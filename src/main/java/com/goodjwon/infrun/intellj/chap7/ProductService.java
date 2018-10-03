package com.goodjwon.infrun.intellj.chap7;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;


@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Transactional
    public Long register(long amt, String name){

        Product product = new Product(amt, name);

        return productRepository.save(product).getId();
    }

    @Transactional(readOnly = true)
    public Product findByName(String name){

        return productRepository.findByName(name)
                .orElseThrow(() -> new IllegalArgumentException(name+ "제품은 없습니다."));

    }
}
