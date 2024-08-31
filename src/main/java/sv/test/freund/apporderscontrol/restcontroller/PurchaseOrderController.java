package sv.test.freund.apporderscontrol.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import sv.test.freund.apporderscontrol.model.PurchaseOrder;
import sv.test.freund.apporderscontrol.service.impl.PurchaseOrderServiceImpl;

@CrossOrigin
@RestController
@RequestMapping("/api/orders/purchaseOrder")
public class PurchaseOrderController {

    @Autowired
    private PurchaseOrderServiceImpl purchaseorderService;

    @GetMapping("/findAllPurchaseOrders")
    public ResponseEntity<List<PurchaseOrder>> findALL(){
        return ResponseEntity.ok().body(purchaseorderService.findAll());
    }

    @GetMapping("/findPurchaseOrderById/{id}")
    public  ResponseEntity<PurchaseOrder> findPurchaseOrderById(@PathVariable("id") Integer id){
        return  ResponseEntity.ok().body(purchaseorderService.findPurchaseOrderById(id).get());
    }


    @PostMapping("/createPurchaseOrder")
    public ResponseEntity<PurchaseOrder> createPurchaseOrder(@Valid @RequestBody PurchaseOrder order) {
 
        try {
            purchaseorderService.CreatePurchaseOrder(order);
            return new ResponseEntity<>(order, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(order, HttpStatus.BAD_REQUEST);
        }   

     
    }

    @PutMapping("/updatePurchaseOrder")
    public ResponseEntity<PurchaseOrder> updatePurchaseOrder(@Valid @RequestBody PurchaseOrder order) {
        
        try {
            purchaseorderService.updatePurchaseOrder(order);
            return new ResponseEntity<>(order, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(order, HttpStatus.BAD_REQUEST);
        }   

     
    }


}
