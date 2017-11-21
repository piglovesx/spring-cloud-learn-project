package lei.zhu.springcloud.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "client", fallback = HystrixClientFallback.class)
public interface SayHiService {
    @RequestMapping(value = "/name", method = RequestMethod.GET)
    String sayHi(@RequestParam(value = "name") String name);
}
