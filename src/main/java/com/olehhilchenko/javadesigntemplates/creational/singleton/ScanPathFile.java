package main.java.com.olehhilchenko.javadesigntemplates.creational.singleton;

import java.util.Scanner;

public class ScanPathFile {

    static public String scanPathFile (){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter directory: (like C:/Windows)");
        return scanner.next();
    }
}
