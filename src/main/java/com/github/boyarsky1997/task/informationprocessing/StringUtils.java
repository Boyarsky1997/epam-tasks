package com.github.boyarsky1997.task.informationprocessing;

public class StringUtils {

    private Object[] value;

    public StringUtils(Object... value) {
        this.value = value;
    }

    public String result() {
        StringBuilder stringBuilder = new StringBuilder();

        for (Object o : value) {
            stringBuilder.append(o.toString()).append(" ");

        }
        return stringBuilder.toString();
    }
}
