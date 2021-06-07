package com.github.boyarsky1997.task.annotation;

import com.github.boyarsky1997.task.annotation.annotations.Service;

@Service(name = "SuperLazyService")
public class LazyService {
    public void lazyInit() throws Exception {
        System.out.println("Виконується lazyInit");
    }

    public void tmp1(){
        System.out.println("Виконується tmp1");
    }
}
