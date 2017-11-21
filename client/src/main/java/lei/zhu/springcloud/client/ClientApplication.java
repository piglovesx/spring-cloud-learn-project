package lei.zhu.springcloud.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication//as Configuration ComponentScan EnableAutoConfiguration
@EnableEurekaClient
@RestController("/")
public class ClientApplication {

    @RequestMapping("/hello")
    public String home() {
        return "Hello World";
    }

    @RequestMapping("/name")
    public String sayName(String name) {
        return "Hi " + name + " from Client";
    }

    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class, args);
    }

    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
