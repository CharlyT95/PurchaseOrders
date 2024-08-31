package sv.test.freund.apporderscontrol.service;
import java.util.*;

import sv.test.freund.apporderscontrol.model.Product;

public interface ProductService {

    public List<Product> findAll();
    public Optional<Product> findProductById(Integer id);
    public void CreateProduct(Product product);
    public void updateProduct(Product product);

}
