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
import sv.test.freund.apporderscontrol.model.Status;
import sv.test.freund.apporderscontrol.service.impl.StatusServiceImpl;

@CrossOrigin
@RestController
@RequestMapping("/api/orders/status")
public class StatusController {

    @Autowired
    private StatusServiceImpl StatusService;


    @GetMapping("/findAllStatus")
    public ResponseEntity<List<Status>> findALL(){
        return ResponseEntity.ok().body(StatusService.findAll());
    }

    @GetMapping("/findStatusById/{id}")
    public  ResponseEntity<Status> findById(@PathVariable("id") Integer id){
        return  ResponseEntity.ok().body(StatusService.findProductById(id).get());
    }



    @PostMapping("/createStatus")
    public ResponseEntity<Status> createStatus(@Valid @RequestBody Status status) {
        try {
            StatusService.CreateStatus(status);
            return new ResponseEntity<>(status, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(status, HttpStatus.OK);
        }   
    }


    @PutMapping("/UpdateStatus")
    public ResponseEntity<Status> update(@Valid @RequestBody Status status) {
      
        try {
            StatusService.updateStatus(status);
           return new ResponseEntity<>(status, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(status, HttpStatus.BAD_REQUEST);
        }   
       
    }

}
