package main.java.com.olehhilchenko.javadesigntemplates.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class AviatorTeam {

    private List<Aviator> aviators = new ArrayList<>();

    public void addAviator (Aviator aviator){
        aviators.add(aviator);
    }

    public void flight(){
        System.out.println("a team of aviators is flying...");
        for (Aviator aviator : aviators)
            aviator.toFly();
    }
}
