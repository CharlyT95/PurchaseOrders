package sv.test.freund.apporderscontrol.restcontroller;

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
import sv.test.freund.apporderscontrol.model.OrderDetail;
import sv.test.freund.apporderscontrol.service.impl.OrderDetailImpl;
import java.util.*;

@CrossOrigin
@RestController
@RequestMapping("/api/details/OrderDetail")
public class OrderDetailController {

    @Autowired
    private OrderDetailImpl orderDetailService;

    @GetMapping("/findOrderDetailById/{id}")
    public  ResponseEntity<List<OrderDetail>> findByPurchaseOrder_OrderId(@PathVariable("id") Integer id){
        return  ResponseEntity.ok().body(orderDetailService.findOrderDetailByOrderId(id));
    }

    @PostMapping("/create")
    public ResponseEntity<OrderDetail> createOrderDetail(@Valid @RequestBody OrderDetail detail) {

        try {
            orderDetailService.CreateOrderDetail(detail);
        return new ResponseEntity<>(detail, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(detail, HttpStatus.BAD_REQUEST);
        
        }   

      
    }

    @PutMapping("/update")
    public ResponseEntity<OrderDetail> updateOrderDetail(@Valid @RequestBody OrderDetail detail) {
       
        try {
            orderDetailService.updateOrderDetail(detail);
            return new ResponseEntity<>(detail, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(detail, HttpStatus.BAD_REQUEST);
        }   

    
    }

}
