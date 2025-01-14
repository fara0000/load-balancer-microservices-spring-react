package soa.lab.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class JavaConfig {
    @Bean
    public WebClient localApiClient() {
        return WebClient.create("http://localhost:8282/main-service");
    }
}
