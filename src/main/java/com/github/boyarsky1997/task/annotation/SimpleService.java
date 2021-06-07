package com.github.boyarsky1997.task.annotation;

import com.github.boyarsky1997.task.annotation.annotations.Service;

@Service(name = "SuperSimpleService")
public class SimpleService {
    public void initService() {
        System.out.println("Виконується initService");
    }
    public void tmp() {
        System.out.println("Виконується tmp");
    }
}
