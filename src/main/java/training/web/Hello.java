package training.web;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

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
    @GetMapping("/test")//此專案的test頁面
    public static String testreply(){
        return "This is TestReply page!";
    }
    @GetMapping("/user/{name}")//此專案的user頁面
    public static String userreply(@PathVariable String name){
        return "Hello this is the page by"+name;
    }
    @GetMapping("/square/{number}")//此專案的算術頁面
    public static String resultreply(@PathVariable int number){
        return "The result is"+(number+number);
    }
    
}
