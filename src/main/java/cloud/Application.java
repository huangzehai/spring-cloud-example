package cloud;

import cloud.integration.StoreIntegration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@SpringBootApplication
@EnableCircuitBreaker
@RestController
@EnableHystrixDashboard
@EnableDiscoveryClient
public class Application {

    @Autowired
    private StoreIntegration storeIntegration;

    @Autowired
    Environment environment;

    @RequestMapping("music")
    public String music() {
        return "Jazz from: " + environment.getProperty("local.server.port");
    }

    @RequestMapping("store")
    public String store() {
        String storeResult = (String) storeIntegration.getStores(new HashMap<>());
        return storeResult;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
