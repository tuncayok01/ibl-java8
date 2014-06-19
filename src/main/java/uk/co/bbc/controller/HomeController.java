package uk.co.bbc.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import uk.co.bbc.model.Greeting;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HomeController {

    @RequestMapping(method = RequestMethod.GET, value = "/hello/{name}")
    public ModelAndView sayHello(@PathVariable("name") String name) {
        Map<String, String> model = new HashMap<>();
        model.put("name", name);
        return new ModelAndView("home", model);
    }

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value="/greeting")
    public @ResponseBody
    Greeting greeting(
            @RequestParam(value="name", required=false, defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }


}