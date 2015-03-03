package com.sofi.spring;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import play.Play;

import java.util.Properties;

@Component
public class PlayConfigIntegration{
    @Bean
    public PropertyPlaceholderConfigurer placeholderConfigurer() {
        return new PropertyPlaceholderConfigurer(){
            @Override
            protected String resolvePlaceholder(String placeholder, Properties props) {
                String result = getProperty(placeholder);
                if (result == null) {
                    result = super.resolvePlaceholder(placeholder, props);
                }
                // @Value cannot handle null so return empty string by default
                if (result == null) {
                    result = "";
                }
                return result;
            }
        };
    }

    private String getProperty(String name) {
        return Play.application().configuration().getString(name);
    }
}
