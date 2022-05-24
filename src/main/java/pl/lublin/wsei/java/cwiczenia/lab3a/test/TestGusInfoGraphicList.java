package pl.lublin.wsei.java.cwiczenia.lab3a.test;


import pl.lublin.wsei.java.cwiczenia.lab3a.GusInfoGraphicList;
import pl.lublin.wsei.java.cwiczenia.lab3a.Infografika;

public class TestGusInfoGraphicList {
    public static void main(String[] args) {
        GusInfoGraphicList list = new GusInfoGraphicList("gusInfoGraphic.xml");
        for (Infografika ig: list.infografiki) ig.print();
    }
}