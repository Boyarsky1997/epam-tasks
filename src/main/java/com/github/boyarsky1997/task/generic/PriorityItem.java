package com.github.boyarsky1997.task.generic;

public class PriorityItem<T> {
    private T t;
    private double priority;

    public PriorityItem(T t, double priority) {
        this.t = t;
        this.priority = priority;
    }

    public T getItem() {
        return t;
    }

    public double getPriority() {
        return priority;
    }
}
