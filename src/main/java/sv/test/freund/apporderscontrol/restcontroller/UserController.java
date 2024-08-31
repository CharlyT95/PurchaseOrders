package sv.test.freund.apporderscontrol.restcontroller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import sv.test.freund.apporderscontrol.model.User;
import sv.test.freund.apporderscontrol.service.impl.UserServiceImpl;


import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("/api/orders/catalogo/user")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @Autowired
    private PasswordEncoder passwordEncoder;


    @GetMapping("/findAll")
    public ResponseEntity<List<User>> findALL(){
        return ResponseEntity.ok().body(userService.findAll());
    }

    @GetMapping("/findById/{id}")
    public  ResponseEntity<User> findById(@PathVariable("id") Integer id){
        return  ResponseEntity.ok().body(userService.findById(id).get());
    }

    @PostMapping("/create")
    public ResponseEntity<String> create(@RequestBody User user){
        user.setPass(passwordEncoder.encode(user.getPass()));
        userService.Create(user);
        return  ResponseEntity.ok("ok");
    }

    @PutMapping("/update")
    public ResponseEntity<String> update(@RequestBody User user){
        userService.Update(user);
        return  ResponseEntity.ok("ok");
    }

}
