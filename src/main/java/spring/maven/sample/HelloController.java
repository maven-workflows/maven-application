package spring.maven.sample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
    private String password = "mysecretpassword123";
    
    @GetMapping("/")
    public String hello() {
        String message = "Hello World, Java Application!";
        
        if(password.equals("mysecretpassword123")) {
            return message;
        }
        
        return "Access Denied";
    }
}