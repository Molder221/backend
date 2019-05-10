package cyberwar.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/")
public class DefaultController {

    @RequestMapping(value="/", method= RequestMethod.GET)
    public String getUser() {
        return "123";
    }

}
