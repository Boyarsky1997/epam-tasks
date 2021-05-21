package com.github.boyarsky1997.task.generic;

import java.util.LinkedList;
import java.util.List;

public class PriorityQueue<T extends Droid> {

    private final List<PriorityItem<T>> droids;

    public PriorityQueue() {
        this.droids = new LinkedList<>();
    }

    public void add(double priority, T item) {
        if (priority < 0 || priority > 1) {
            throw new RuntimeException("Priority can't be less 0 or more 1");
        }
        add(new PriorityItem<>(item, priority));
    }

    private void add(PriorityItem<T> t) {
        if (droids.size() == 0) {
            droids.add(t);
        } else {
            if (t.getPriority() > droids.get(droids.size() - 1).getPriority()) {
                droids.add(t);

            } else {
                for (int i = 0; i < droids.size(); i++) {
                    if (t.getPriority() <= droids.get(i).getPriority()) {
                        droids.add(i, t);
                        break;
                    }
                }
            }
        }
    }

    public int size() {
        return droids.size();
    }


    public T get() {
        if (droids.size() == 0) {
            return null;
        }
        T t = droids.get(droids.size() - 1).getItem();
        droids.remove(droids.size() - 1);
        return t;
    }


}
