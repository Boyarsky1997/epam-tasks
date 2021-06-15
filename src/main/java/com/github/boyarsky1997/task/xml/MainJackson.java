package com.github.boyarsky1997.task.xml;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainJackson {
    public static void main(String[] args) throws IOException {
        whenJavaDeserializedFromXmlFile_thenCorrect();
        whenJavaSerializedToXmlFile_thenSuccess();
    }
    public static void whenJavaDeserializedFromXmlFile_thenCorrect() throws IOException {
        XmlMapper xmlMapper = new XmlMapper();
        Person value = xmlMapper.readValue(new File("src\\main\\resources\\tmp2.xml"), Person.class);
        System.out.println(value);
    }

    public static void whenJavaSerializedToXmlFile_thenSuccess() throws IOException {
        XmlMapper xmlMapper = new XmlMapper();
        Address address =new Address();
        address.setCity("l");
        address.setStreetName("c");
        Person person = new Person();
        person.setFirstName("r");
        person.setLastName("b");
        person.setAddress(Collections.singletonList(address));
        person.setPhoneNumbers(Arrays.asList("09494999494","24929294924994"));// test data
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        xmlMapper.writeValue(byteArrayOutputStream, person);
        System.out.println(byteArrayOutputStream.toString());
    }

}
