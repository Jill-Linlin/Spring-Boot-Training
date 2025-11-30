package training.web;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;


@Controller
public class page {
    @GetMapping("/multiply")//路由創建
    public String multiply(Model model,@RequestParam int n1,@RequestParam int n2){
            int ans=n1*n2;
            model.addAttribute("result", ans);
            return "multiply";//對應的樣板名稱(templated)


    }


    
}
