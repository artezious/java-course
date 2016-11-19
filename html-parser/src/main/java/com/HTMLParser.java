package com;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.*;

/**
 * Created by WEO on 11/16/16.
 */
public class HTMLParser {


    public static void main(String args[]) throws IOException, ClassNotFoundException {

        String domain = "https://play.google.com/store/apps";
        final String USERAGENT = "Mozilla";


        String title = null;
       /* String divCategoriesClassname = "meta-info";*/
        String divCategoriesClassname = "child-submenu-link";
        String divCategoriesElementsClassname = "card-click-target";
        String divCategoriesElementsDescriptionClassname = "meta-info";
        String urlAttrName = "href";

        Document doc = null;
        Elements docElements = null;
        Document docCategories = null;
        Elements docCategoriesElements = null;
        Document docCategoriesDescription = null;
        Elements docCategoriesElementsDescription = null;
        Document docDuplicatorBuff = null;
        String urlDupBuffer = null;

        doc = getDocument(domain, USERAGENT);
        docElements = doc.body().getElementsByClass(divCategoriesClassname);


        for (Element aDocElement : docElements) {

            String urlForParsing = parsingUrl(domain, aDocElement, divCategoriesClassname, urlAttrName);
            fileOutput(urlForParsing, divCategoriesClassname);    // Saving urls of categories;
        }

        FileReader fileReaderCategories = new FileReader(divCategoriesClassname);
        BufferedReader bufferedReaderCategories = new BufferedReader(fileReaderCategories);

        String urlForParsing;
        while ((urlForParsing = bufferedReaderCategories.readLine()) != null) {
            System.out.println(urlForParsing);
            docCategories = getDocument(urlForParsing, USERAGENT);
            docCategoriesElements = docCategories.body().getElementsByClass(divCategoriesElementsClassname);

            assert docCategoriesElements != null;
            for (Element aDocCategoriesElement : docCategoriesElements) {
                String urlForParsingOfElement = parsingUrl(domain, aDocCategoriesElement, divCategoriesElementsClassname, urlAttrName);
                if (!urlForParsingOfElement.equals(urlDupBuffer)) {
                    fileOutput(urlForParsingOfElement, divCategoriesElementsClassname);    // Saving urls of elements in categories;
                    urlDupBuffer = urlForParsingOfElement;
                    System.out.println(urlForParsingOfElement);
                }
            }

        }
        FileReader fileReaderCategoriesDescription = new FileReader(divCategoriesElementsClassname);
        BufferedReader bufferedReaderCategoriesDescription = new BufferedReader(fileReaderCategoriesDescription);

        String s;
        while ((s = bufferedReaderCategoriesDescription.readLine()) != null) {

            docCategoriesDescription = getDocument(s, USERAGENT);
            docCategoriesElementsDescription = docCategoriesDescription.body().getElementsByClass(divCategoriesElementsDescriptionClassname);

            fileOutput(docCategoriesDescription.title(), docCategoriesElementsDescription, divCategoriesElementsDescriptionClassname);
            System.out.println(s);
        }
    }
                /*FileReader fileReaderCategories = new FileReader(divCategoriesElementsClassname);
                BufferedReader bufferedReader = new BufferedReader(fileReaderCategories);

                String urlForParsing;
                while ((urlForParsing = bufferedReader.readLine()) != null) {

                    if (!urlForParsing.equals(urlDupBuffer)) {
                        urlDupBuffer = urlForParsing;

                        docCategoriesDescription = getDocument(urlForParsing, USERAGENT);
                        docCategoriesElementsDescription = docCategoriesDescription.body().getElementsByClass(divCategoriesElementsDescriptionClassname);

                        System.out.println(urlForParsing);
                        System.out.println(docCategoriesDescription.title());
                        //       System.out.println(docCategoriesDescription);
                        fileOutput(docCategoriesDescription.title(), docCategoriesElementsDescription, divCategoriesElementsDescriptionClassname);
                    }
                }*/


    //   fileOutput(title, docElements, divClassname);

       /* title = doc.title();*/


    private static String parsingUrl(String domain, Element element, String divClassname, String urlAttrName) {
        return element.select("." + divClassname).attr(urlAttrName).replace("/store/apps", domain);

    }
    //   fileOutput(finalDocument.title(), finalDocElements, descriptionDivClassName);

    private static Document getDocument(String domain, String userAgent) throws IOException {
        Document doc = null;
        try {
            doc = Jsoup.connect(domain).userAgent(userAgent).get();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return doc;
    }

    private static void fileOutput(String title, Elements elements, String filename) {

        File fileOut = new File(filename);
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileOut, true));
            bufferedWriter.write(title + "\n" + elements.html() + ",");
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("Ошибка");
        }

    }

    private static void fileOutput(String element, String filename) {

        File fileOut = new File(filename);
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileOut, true));
            bufferedWriter.write(element + "\n");
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("Ошибка");
        }
    }
}

        /*url = doc.select("." + divClassname).attr(attrName);*/

         /*   Node N;
            N =  (Node) doc.body().getElementsByTagName("line").item(0);
            N.setTextContent("мой текст");
            Element line=(Element) N;
            line.setAttribute("status", "вот и всё оказывается");
*/

// String url = "http://play.google.com" + docFinal.get(0).tagName("href='/store/apps/category/'").getElementsByAttribute("href").attr("href", "/store/apps/category/Business");

            /*replaceAll("href='/store/apps/category/'","href='http://www.play.google.com/store/apps/category/'");
            docFinal.replaceAll(href="/store/apps/category/",href="http://www.play.google.com/store/apps/category/");*/
            /*  .select("/store/apps/category/").("https://play.google.com/store/apps/category");*/
            /*docFinal = doc.body().getElementsByClass(divClassname).attr("href", "/store/apps/category/");*/