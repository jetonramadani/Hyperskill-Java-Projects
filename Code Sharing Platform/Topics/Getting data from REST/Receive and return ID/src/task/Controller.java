package task;

import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @GetMapping("/{txt}")
    public String getText(@PathVariable String txt) {
        return txt;
    }
}
