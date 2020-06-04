package com.example.demo.component;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author AFeng
 * @date 2020/5/28 15:01
 */
@Data
@ConfigurationProperties(prefix = "system")
public class SystemConfiguration {

    private String name="11111";


}
