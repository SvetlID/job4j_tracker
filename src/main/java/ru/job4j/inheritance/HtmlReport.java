package ru.job4j.inheritance;

public class HtmlReport extends TextReport {

    public String generate(String name, String body) {
    return "<h1>" + name + "/h>" + "br/>" + "<span>" + body + "/span>";
    }
}