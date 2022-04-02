package platform.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import platform.model.Code;

@RestController
@RequestMapping("/api")
public class RestCodeController {
    @GetMapping("/code")
    public Code getCode() {
        return new Code("public static void main(String[] args) {\n" +
                "    SpringApplication.run(CodeSharingPlatform.class, args);\n" +
                "}");
    }
}
