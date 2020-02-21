package practica;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class MainControler {

    @RequestMapping("/front")
    public String inicio(Map<String, Object> model) {
        return "login";
    }

    @RequestMapping("/menu")
    public String menuU(Map<String, Object> model) {
        return "menuUSER";
    }

}


