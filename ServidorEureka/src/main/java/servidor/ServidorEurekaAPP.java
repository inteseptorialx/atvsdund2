package servidor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@SpringBootApplication
@EnableEurekaServer
public class ServidorEurekaAPP {
    public static void main(String[] args) {
        SpringApplication.run(ServidorEurekaAPP.class, args);
    }
}
