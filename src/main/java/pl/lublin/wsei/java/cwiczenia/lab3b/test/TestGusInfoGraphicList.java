package pl.lublin.wsei.java.cwiczenia.lab3b.test;


import pl.lublin.wsei.java.cwiczenia.lab3b.GusInfoGraphicList;
import pl.lublin.wsei.java.cwiczenia.lab3b.Infografika;

public class TestGusInfoGraphicList {
    public static void main(String[] args) {
        GusInfoGraphicList list = new GusInfoGraphicList("gusInfoGraphic.xml");
        for (Infografika ig: list.infografiki) ig.print();
    }
}