package com.github.boyarsky1997.task.generic;

import java.util.ArrayList;
import java.util.List;

public class Ship<T extends Droid> {
    private List<T> ship;

    public Ship() {
        this.ship = new ArrayList<>();
    }

    public void put(T t) {
        ship.add(t);

    }

    public T get() {
        T t = ship.get(ship.size() - 1);
        ship.remove(ship.size() - 1);
        return ship.get(ship.size()-1);

    }

}
