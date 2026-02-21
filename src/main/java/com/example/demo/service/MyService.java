package com.example.demo.service;

import com.example.demo.component.MyComponent;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    private final MyComponent myComponent;

    public MyService(MyComponent myComponent) {
        this.myComponent = myComponent;

        System.out.println("MyService constructor");
    }

    public String getName() {
        System.out.println("MyService.getName() has been called");
        return myComponent.getMyComponentName();
    }
}