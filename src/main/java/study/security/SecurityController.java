package study.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {

    @GetMapping("/")
    public String index() {
        return "Home";
    }

    @GetMapping("/loginPage")
    public String loginPage() {
        return "loginPage";
    }
}
