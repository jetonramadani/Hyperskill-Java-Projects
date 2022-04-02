package task;

import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class Controller {
    @GetMapping("/colors")
    public HashMap<String, Object> getColors() {
        List<Color> colors = new ArrayList<>();
        colors.add(Color.getFirst());
        colors.add(Color.getSecond());
        HashMap<String, Object> res = new HashMap<>();
        res.put("colors", colors);
        return res;
    }
}

class Color {
    private String color;
    private String category;
    private String type;
    private Code code;

    public Color(String color, String category, String type, Code code) {
        this.color = color;
        this.category = category;
        this.type = type;
        this.code = code;
    }

    public String getColor() {
        return color;
    }

    public String getCategory() {
        return category;
    }

    public String getType() {
        return type;
    }

    public Code getCode() {
        return code;
    }

    public static Color getFirst() {
        return new Color("black", "hue", "primary", new Code("#000", 0, 0, 0, 1));
    }

    public static Color getSecond() {
        return new Color("white", "value", "primary", new Code("#FFF", 255, 255, 255, 1));
    }

}

class Code {
    private List<Integer> rgba;
    private String hex;

    public Code(String hex, Integer... rgba) {
        this.rgba = List.of(rgba);
        this.hex = hex;
    }

    public List<Integer> getRgba() {
        return rgba;
    }

    public void setRgba(List<Integer> rgba) {
        this.rgba = rgba;
    }

    public String getHex() {
        return hex;
    }

    public void setHex(String hex) {
        this.hex = hex;
    }
}