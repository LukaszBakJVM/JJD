package org.example;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {


        Wall blockList = new Wall();


        blockList.addToList("red", "metal");
        blockList.addToList("red", "wood");
        blockList.addToList("blue", "metal");

        out.println(blockList.findBlocksByMaterial("metal"));
        out.println(blockList.findBlockByColor("blue"));
        out.println(blockList.count());
    }


}