package startup.vn.cartservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PingMe {

    @GetMapping("/ping")
    public String ping() {
        return "[cart-service] Pong!";
    }
}
