package com.olegmng.SpringBootWebApplication;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties
public class AppProperties {
    private String name;
    private String description;
    private int port;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
