package sv.test.freund.apporderscontrol.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sv.test.freund.apporderscontrol.model.Product;
import sv.test.freund.apporderscontrol.repository.ProductRepository;
import sv.test.freund.apporderscontrol.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{



    @Autowired
    private ProductRepository productRepository;


    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Optional<Product> findProductById(Integer id) {
        return productRepository.findById(id);
     }

    @Override
    public void CreateProduct(Product product) {
    
        productRepository.saveAndFlush(product);
    }

    @Override
    public void updateProduct(Product product) {
        productRepository.saveAndFlush(product);
    }





}
