package proDemo3.proDemo3.homeControllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/logix")
public class HomeController {


    @GetMapping("/msg/{name}")
    public String getMessage(@PathVariable String name)
    {
        return "Works Now ::::: NAME :: "  + name;
    }

}
