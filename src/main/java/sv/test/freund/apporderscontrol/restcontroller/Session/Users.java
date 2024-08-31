package sv.test.freund.apporderscontrol.restcontroller.Session;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sv.test.freund.apporderscontrol.SecurityConfig.JwtProvider;
import sv.test.freund.apporderscontrol.model.AuthResponse;
import sv.test.freund.apporderscontrol.model.User;
import sv.test.freund.apporderscontrol.service.impl.UserServiceImplementation;

@RestController
@RequestMapping("/auth")
public class Users {

    @Autowired
    private UserServiceImplementation userService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping("/signin")
    public ResponseEntity<AuthResponse> signin(@RequestBody User loginRequest) {
        String username = loginRequest.getUserName();
        String password = loginRequest.getPass();

        System.out.println(username+"-------"+password);

        Authentication authentication = authenticate(username,password);
        SecurityContextHolder.getContext().setAuthentication(authentication);

        String token = JwtProvider.generateToken(authentication);
        AuthResponse authResponse = new AuthResponse();

        authResponse.setMessage("Login success");
        authResponse.setJwt(token);
        authResponse.setStatus(true);

        return new ResponseEntity<>(authResponse, HttpStatus.OK);
    }



    private Authentication authenticate(String username, String password) {

        System.out.println(username+"---++----"+password);

        UserDetails userDetails = userService.loadUserByUsername(username);

        System.out.println("Sig in in user details"+ userDetails);

        if(userDetails == null) {
            System.out.println("Sign in details - null" + userDetails);
            throw new BadCredentialsException("Invalid username and password");
        }
        if(!passwordEncoder.matches(password,userDetails.getPassword())) {
            System.out.println("Sign in userDetails - password mismatch"+userDetails);

            throw new BadCredentialsException("Invalid password");

        }
        return new UsernamePasswordAuthenticationToken(userDetails,null,userDetails.getAuthorities());

    }
}
