package com.github.boyarsky1997.task.xml;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class MainDOM {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = factory.newDocumentBuilder();
        Document document = documentBuilder.parse(new File("src\\main\\resources\\tmp1.xml"));

        Element element = document.getDocumentElement();
        System.out.println(element.getNodeName());
        NodeList nodeList = document.getElementsByTagName("article");

        System.out.println("============================");

        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            System.out.println("");
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) node;
                System.out.println("title : "  + eElement.getElementsByTagName("title").item(0).getTextContent());
                System.out.println("content : "   + eElement.getElementsByTagName("content").item(0).getTextContent());
            }
        }
    }

}
