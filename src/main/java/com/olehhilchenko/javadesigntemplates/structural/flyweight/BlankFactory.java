package main.java.com.olehhilchenko.javadesigntemplates.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class BlankFactory {

    private Map<String, Blank> blanks = new HashMap<>();


    public Blank getBlankByMaterial(String material) {

        Blank blank = blanks.get(material);

        if (blank == null) {
            switch (material) {
                case "Steel":
                    System.out.println("Purchased steel for workpieces.");
                    blank = new SteelBlank();
                    break;
                case "Copper":
                    System.out.println("Purchased copper for workpieces");
                    blank = new CopperBlank();
                    break;
                case "Aluminum":
                    System.out.println("Purchased aluminum for workpieces");
                    blank = new AluminumBlank();
                    break;
            }
            blanks.put(material, blank);
        }
        return blank;
    }
}
