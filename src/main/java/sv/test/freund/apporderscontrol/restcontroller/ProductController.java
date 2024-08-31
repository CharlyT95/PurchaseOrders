package sv.test.freund.apporderscontrol.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import sv.test.freund.apporderscontrol.model.Product;
import sv.test.freund.apporderscontrol.service.impl.ProductServiceImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@CrossOrigin
@RestController
@RequestMapping("/api/orders/product")
public class ProductController {


    @Autowired
    private ProductServiceImpl ProductService;

    @GetMapping("/findAllProducts")
    public ResponseEntity<List<Product>> findALL(){
        return ResponseEntity.ok().body(ProductService.findAll());
    }

    @GetMapping("/findProductById/{id}")
    public  ResponseEntity<Product> findById(@PathVariable("id") Integer id){
        return  ResponseEntity.ok().body(ProductService.findProductById(id).get());
    }
    
    @PostMapping("/createProduct")
    public ResponseEntity<Product> createProduct(@Valid @RequestBody Product product) {
        try {
            ProductService.CreateProduct(product);
            return new ResponseEntity<>(product, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(product, HttpStatus.BAD_REQUEST);
        }   
    }

    
    @PutMapping("/updateProduct")
    public ResponseEntity<Product> update(@Valid @RequestBody Product product){
        try {
            ProductService.updateProduct(product);
            return new ResponseEntity<>(product, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(product, HttpStatus.BAD_REQUEST);
        }
        
       
    }
    
}
