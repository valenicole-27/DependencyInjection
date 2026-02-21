package com.example.demo.component;

import org.springframework.stereotype.Component;

@Component
public class MyComponent {

    private String myComponentName;

    public MyComponent() {
        this.myComponentName = "Il Tuo Nome"; // 🔥 cambia con il tuo nome

        System.out.println("MyComponent constructor");
    }

    public String getMyComponentName() {
        System.out.println("MyComponent.getMyComponentName() has been called");
        return myComponentName;
    }
}