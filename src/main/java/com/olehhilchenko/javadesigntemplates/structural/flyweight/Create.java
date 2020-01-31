package main.java.com.olehhilchenko.javadesigntemplates.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Create {
    public static void main(String[] args) {
        BlankFactory blankFactory = new BlankFactory();

        List<Blank> blanks = new ArrayList<>();
        blanks.add(blankFactory.getBlankByMaterial("Steel"));
        blanks.add(blankFactory.getBlankByMaterial("Steel"));
        blanks.add(blankFactory.getBlankByMaterial("Copper"));
        blanks.add(blankFactory.getBlankByMaterial("Copper"));
        blanks.add(blankFactory.getBlankByMaterial("Copper"));
        blanks.add(blankFactory.getBlankByMaterial("Copper"));
        blanks.add(blankFactory.getBlankByMaterial("Aluminum"));
        blanks.add(blankFactory.getBlankByMaterial("Aluminum"));
        blanks.add(blankFactory.getBlankByMaterial("Aluminum"));
        blanks.add(blankFactory.getBlankByMaterial("Aluminum"));
        blanks.add(blankFactory.getBlankByMaterial("Aluminum"));
        blanks.add(blankFactory.getBlankByMaterial("Aluminum"));
        blanks.add(blankFactory.getBlankByMaterial("Aluminum"));
        blanks.add(blankFactory.getBlankByMaterial("Aluminum"));

        for (Blank blank: blanks)
            blank.productManufacturing();
    }
}
