package com.example.demo.component;

import org.springframework.stereotype.Component;

/**
 * @author AFeng
 * @date 2020/5/28 15:02
 */
@Component
public class TestComponent {

    private final SystemConfiguration systemConfiguration;

    private final ModuleComponent moduleComponent;

    public TestComponent(SystemConfiguration systemConfiguration, ModuleComponent moduleComponent) {
        this.systemConfiguration = systemConfiguration;
        this.moduleComponent = moduleComponent;
    }






}
