package sv.test.freund.apporderscontrol.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import sv.test.freund.apporderscontrol.model.Supplier;
import sv.test.freund.apporderscontrol.service.impl.SupplierServiceImpl;
import org.springframework.web.bind.annotation.PutMapping;


@CrossOrigin
@RestController
@RequestMapping("/api/orders/supplier")
public class SupplierController {

    @Autowired
    private SupplierServiceImpl SupplierService;

    @GetMapping("/findAllSuppliers")
    public ResponseEntity<List<Supplier>> findALL(){
        return ResponseEntity.ok().body(SupplierService.findAll());
    }

    @GetMapping("/findSupplierById/{id}")
    public  ResponseEntity<Supplier> findSupplierById(@PathVariable("id") Integer id){
        return  ResponseEntity.ok().body(SupplierService.findSupplierById(id).get());
    }


    @PostMapping("/createSupplier")
    public ResponseEntity<Supplier> createSupplier(@Valid @RequestBody Supplier supplier) {
      try {
        SupplierService.CreateSupplier(supplier);
        return new ResponseEntity<>(supplier, HttpStatus.OK);
      } catch (Exception e) {
        return new ResponseEntity<>(supplier, HttpStatus.BAD_REQUEST);
      }
            
    }

    @PutMapping("/updateSupplier")
    public ResponseEntity<Supplier> updateSupplier(@Valid @RequestBody Supplier supplier) { 
      try {
            SupplierService.updateSupplier(supplier);
            
            return new ResponseEntity<>(supplier, HttpStatus.OK);

        } catch (Exception e) {
            return new ResponseEntity<>(supplier, HttpStatus.BAD_REQUEST);
        }
    }

}
