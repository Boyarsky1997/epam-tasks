package com.github.boyarsky1997.task.xml;


import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;
@XmlRootElement
public class Company {
    @XmlAttribute
    private int id;
    @XmlElement(name = "department")
    @XmlElementWrapper(name = "departments")
    private List<Department> departments ;

    public int getId() {
        return id;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", departaments=" + departments  +
                '}';
    }
}
