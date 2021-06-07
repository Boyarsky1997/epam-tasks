package com.github.boyarsky1997.task.annotation.annotations;

import java.lang.annotation.*;

@Inherited
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MethodAnnotation {
    boolean suppressException() default false;

}
