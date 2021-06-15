package com.github.boyarsky1997.task.xml;


import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlValue;

public class Worker {

    @XmlAttribute
    private int id;
    @XmlValue
    private String worker;

    @Override
    public String toString() {
        return "Work{" +
                "id=" + id +
                ", worker='" + worker + '\'' +
                '}';
    }
}
