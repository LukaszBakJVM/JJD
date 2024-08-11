package org.example;

import java.util.ArrayList;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {


        Wall blockList = new Wall(new ArrayList<>());


        blockList.addToList("red", "metal");
        blockList.addToList("red", "wood");
        blockList.addToList("blue", "metal");

        out.println(blockList.findBlocksByMaterial("meta"));
        out.println(blockList.findBlockByColor("blu"));
        out.println(blockList.count());
    }


}