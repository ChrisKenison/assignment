package configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import play.Play;


@Configuration
@ComponentScan(
    value={
        "controllers",
        "services",
        "com.sofi"
    })

public class AppConfig {
    @Bean
    public play.Configuration getConfig() {
        return Play.application().configuration();
    }
}
