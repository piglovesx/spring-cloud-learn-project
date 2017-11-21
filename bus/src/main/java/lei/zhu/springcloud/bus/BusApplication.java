package lei.zhu.springcloud.bus;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//bus为什么要在client-config这个项目里呢？
@RestController
@SpringBootApplication
@EnableDiscoveryClient
public class BusApplication {

    public static void main(String[] args) {
        SpringApplication.run(BusApplication.class, args);
    }

    @Value("${hello}")
    String hello;

    @RequestMapping(value = "/hi")
    public String hi() {
        return hello;
    }
}
