package training.web;
import java.util.List;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;//路徑參數
import org.springframework.web.bind.annotation.RequestParam;//查詢參數

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
    public static List testreply(){
        Point data1=new Point(4, 6);
        Point data2=new Point(18, -5);
        return List.of(data1,data2);
    }
    @GetMapping("/user/{name}")//此專案的user頁面
    public static String userreply(@PathVariable String name){
        return "Hello this is the page by"+name;
    }
    @GetMapping("/square/{number}")//此專案的算術頁面
    public static String resultreply(@PathVariable int number){
        return "The result is"+(number+number);
    }
    
    @GetMapping("/user")//此專案的user id查詢頁面
    public static String useridreply(@RequestParam int id){
        return "The page userId is "+id;
    }
    @GetMapping("/add")//此專案的user id查詢頁面
    public static Map useridreply(@RequestParam int n1,@RequestParam int n2){
        return Map.of("Ans",(n1+n2));
    }
    @GetMapping("/grades")//此專案的user id查詢頁面
    public static Map gradesreply(){
        int[] grades=new int[]{65,95,85,72,44};
        String[] names=new String[]{"王小明","陳小美","張大強","許小莉","吳大天"};
        return Map.of("Name: ",names,"Grade: ",grades);
    }
    
}
