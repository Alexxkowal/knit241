package org.knit.solutions.first_semestr.lab1.Task2;

import org.knit.solutions.first_semestr.lab1.Task2.SimpleUrl;

/***
 * Задача 2
 * Создайте класс SimpleUrl
 * глядя на URL ниже создайте как можно больше полей в классе SimpleUrl:
 * https://test.ru/test/1072/page.jsp?intParam=12345&doubleParam=3.14&textParameter=someText
 * добавьте геттеры и сеттеры для полей
 * Переопределите метод toString() для вывода информации о полях класса:
 * protocol = https
 * address = test.ru
 * domainZone = ru
 * siteName = test
 * webpageName = page.jsp
 * webPageExtention = jsp
 * ....
 * Распарсите данный URL на переменные, создайте экземпляр класса SimpleUrl и выведите на экран
 * Дополнительно
 * попробуйте с другими URL в сети, подумайте как можно сгруппировать значения.
 *
 */
public class Task2 {
    public void execute() {

        String urlValue = "https://test.ru/test/1072/page.jsp?intParam=12345&doubleParam=3.14&textParameter=someText";

        /* tips
         * urlValue.split(":");
         */

        //todo create class SimpleUrl()
        // SimpleUrl url= new SimpleUrl();
        // url.setAddress(address);
        // url.setProtocol(protocol)
        // System.out.println(url);
        SimpleUrl simpleUrl = new SimpleUrl(urlValue);
        System.out.println(simpleUrl.getAddress());
        System.out.println(simpleUrl.getTextParameter());
    }
}
