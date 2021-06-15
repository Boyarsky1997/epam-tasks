package com.github.boyarsky1997.task.xml;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class MainJAXB {
    public static void main(String[] args) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(Company.class, Department.class, Worker.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        Company company = (Company) unmarshaller.unmarshal(new File("src\\main\\resources\\tmp.xml"));

        System.out.println(company);
    }
}
