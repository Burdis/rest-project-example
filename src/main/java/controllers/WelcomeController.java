package controllers;

import models.Welcome;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("welcome")
public class WelcomeController {

    @GetMapping()
    public Welcome welcomeGet(@RequestParam(value="content", defaultValue = "Default content") Welcome welcome) {
        return welcome;
    }

    @PostMapping(value = "/post")
    public Welcome welcomePost(Welcome welcome) {
        return welcome;
    }

    @DeleteMapping(value = "/{id}")
    public String welcomeDelete() {
        return "Delete has been called";
    }

    @PutMapping(value = "/{id}")
    public String welcomePut() {
        return "Put has been called";
    }
}
