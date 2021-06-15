package com.github.boyarsky1997.task.xml;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

public class BaeldungHandler extends DefaultHandler {
    private Baeldung website;
    private StringBuilder elementValue;


    @Override
    public void startDocument() throws SAXException {
        website = new Baeldung();
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        switch (qName) {
            case "title":
                latestArticle().setTitle(elementValue.toString());
                break;
            case "content":
                latestArticle().setContent(elementValue.toString());
                break;
        }
    }

    private Article latestArticle() {
        List<Article> articleList = website.articles;
        int latestArticleIndex = articleList.size() - 1;
        return articleList.get(latestArticleIndex);
    }

    public Baeldung getWebsite() {
        return website;
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        switch (qName) {
            case "articles":
                website.articles = new ArrayList<>();
                break;
            case "article":
                website.articles.add(new Article());
                break;
            case "title":
                elementValue = new StringBuilder();
                break;
            case "content":
                elementValue = new StringBuilder();
                break;
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        if (elementValue == null) {
            elementValue = new StringBuilder();
        } else {
            elementValue.append(ch, start, length);
        }
    }
}
