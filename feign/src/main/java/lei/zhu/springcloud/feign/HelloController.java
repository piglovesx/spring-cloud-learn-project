package lei.zhu.springcloud.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private SayHiService helloRibbonService;

    @RequestMapping("/hi")
    public String hello(String name) {
        return helloRibbonService.sayHi(name);
    }
}
