package in.aajkaal.adminpanel.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @RequestMapping("/login.html")
    public String loginTemplate() {

        return "login";
    }

}