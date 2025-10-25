package vn.hoidanit.laptopshop;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloController {
    @GetMapping("/")
    public String index() {
        return "Hello World update";
    }

    @GetMapping("/user")
    public String userPage() {
        return "Ony user can be access";
    }

    @GetMapping("/admin")
    public String adminPage() {
        return "Ony admin can be access";
    }

}
