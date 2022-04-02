package task;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class Controller {

    @GetMapping("/value")
    public int getVal() {
        return 1;
    }

    @GetMapping("/text")
    public String getString() {
        return "two";
    }

    @GetMapping("/json")
    public Number getObj() {
        return new Number(3);
    }

}

class Number {
    private int number;

    public Number(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}