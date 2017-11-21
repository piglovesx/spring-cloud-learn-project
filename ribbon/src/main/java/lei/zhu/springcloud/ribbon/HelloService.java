package lei.zhu.springcloud.ribbon;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {
    @Autowired
    private RestTemplate restTemplate;

    //加入熔断器
    @HystrixCommand(fallbackMethod = "error")
    public String sayHiToClient(String name) {
        return restTemplate.getForObject("http://CLIENT/name?name="+name, String.class);
    }

    public String error(String name) {
        return "error";
    }
}
