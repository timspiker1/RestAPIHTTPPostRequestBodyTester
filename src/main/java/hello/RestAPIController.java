package hello;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestAPIController {

    @RequestMapping("/getRequestBody")
    public String returnRequestBody(@RequestBody String text) {
        System.out.println(text);
        return text;
    }
}
