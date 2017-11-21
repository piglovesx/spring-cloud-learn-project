package lei.zhu.springcloud.client1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController("/")
public class Client1Application {

    @RequestMapping("/name")
    public String sayName(String name) {
        return "Hi " + name + " from Client1";
    }

	public static void main(String[] args) {
		SpringApplication.run(Client1Application.class, args);
	}
}
