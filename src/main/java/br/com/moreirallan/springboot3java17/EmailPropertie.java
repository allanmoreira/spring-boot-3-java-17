package br.com.moreirallan.springboot3java17;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(
        prefix = "email",
        ignoreUnknownFields = true
)
public class EmailPropertie {

    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
