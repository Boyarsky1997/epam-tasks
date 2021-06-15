package com.github.boyarsky1997.task.xml;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

public class Department {
    @XmlElement
    private String name;

    @XmlElement(name = "worker")
    @XmlElementWrapper(name = "workers")
    private List<Worker> workers;

    @Override
    public String toString() {
        return "Departament{" +
                "name='" + name + '\'' +
                ", works=" + workers +
                '}';
    }
}
