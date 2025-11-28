package training.web;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@RestController
public class Hello {
    public static void main(String[] args) {
        //本地127.0.0.1:8080
        SpringApplication.run(Hello.class, args);
        
    }
    @GetMapping("/")//此專案的根目錄
    public static String homepage(){
        return "Hello World";
    }
    
}
