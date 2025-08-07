package br.com.moreirallan.springboot3java17;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api")
public class Controller {

    @Autowired
    ConfigPropertie configPropertie;

    @Autowired
    EmailPropertie emailPropertie;

    @GetMapping(path = "config")
    public String config() {
        return configPropertie.getValue();
    }

    @GetMapping(path = "email")
    public String email() {
        return emailPropertie.getValue();
    }
}
