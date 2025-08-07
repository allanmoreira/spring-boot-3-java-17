package br.com.moreirallan.springboot3java17;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(
        prefix = "config",
        ignoreUnknownFields = true
)
public class ConfigPropertie {

    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
