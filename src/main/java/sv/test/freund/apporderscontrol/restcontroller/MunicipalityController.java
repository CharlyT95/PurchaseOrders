package sv.test.freund.apporderscontrol.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sv.test.freund.apporderscontrol.model.Municipality;
import sv.test.freund.apporderscontrol.service.impl.MunicipalityServiceImpl;

@CrossOrigin
@RestController
@RequestMapping("/api/orders/municipality")
public class MunicipalityController {

    @Autowired
    private MunicipalityServiceImpl municipalityServiceImpl;

    @GetMapping("/findAllMunicipalities")
    public ResponseEntity<List<Municipality>> findALL(){
        return ResponseEntity.ok().body(municipalityServiceImpl.findAll());
    }

    @GetMapping("/findMunicipalityById/{id}")
    public  ResponseEntity<Municipality> findById(@PathVariable("id") Integer id){
        return  ResponseEntity.ok().body(municipalityServiceImpl.findById(id).get());
    }

    
}
