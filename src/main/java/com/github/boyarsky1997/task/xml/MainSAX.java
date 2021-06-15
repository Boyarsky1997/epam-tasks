package com.github.boyarsky1997.task.xml;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;

public class MainSAX {
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
        SAXParser saxParser = saxParserFactory.newSAXParser();
        BaeldungHandler baeldungHandler = new BaeldungHandler();
        saxParser.parse("src\\main\\resources\\tmp1.xml", baeldungHandler);
        Baeldung result = baeldungHandler.getWebsite();
        Article article = result.articles.get(0);
        if (article.getContent().equals("SAX Parser's Lorem ipsum...")){
            System.out.println(article.getContent());
        }
        if (article.getTitle().equals("Parsing an XML File Using SAX Parser")){
            System.out.println(article.getTitle());
        }
        System.out.println(result.articles.size());

    }

}
