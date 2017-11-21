package lei.zhu.springcloud.feign;

import org.springframework.stereotype.Component;

@Component
public class HystrixClientFallback implements SayHiService{
    @Override
    public String sayHi(String name) {
        return "sorry " + name;
    }
}
