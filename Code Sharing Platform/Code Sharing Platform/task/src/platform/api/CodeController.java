package platform.api;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CodeController {
    @GetMapping("/code")
    public String getCode() {
        return "<html>\n" +
                "<head>\n" +
                "    <title>Code</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<pre>\n" +
                "public static void main(String[] args) {\n" +
                "    SpringApplication.run(CodeSharingPlatform.class, args);\n" +
                "}</pre>\n" +
                "</body>\n" +
                "</html>";
    }
}
