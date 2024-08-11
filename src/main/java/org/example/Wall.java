package org.example;

import java.util.List;
import java.util.Optional;

public class Wall implements Structure, CompositeBlock {


    private List<Block> blocks;
    private String color;
    private String material;

    public Wall(List<Block> blocks) {
        this.blocks = blocks;
    }

    public Wall(String color, String material) {
        this.color = color;
        this.material = material;
    }


    public void addToList(String color, String material) {
        blocks.add(new Wall(color, material));
    }


    @Override
    public List<Block> getBlocks() {
        return blocks;
    }


    @Override
    public Optional<Block> findBlockByColor(String color) {
        return blocks.stream().filter(block -> block.getColor().equals(color)).findAny();
    }

    @Override
    public List<Block> findBlocksByMaterial(String material) {
        return blocks.stream().filter(block -> block.getMaterial().equals(material)).toList();
    }

    @Override
    public int count() {
        return getBlocks().size();
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        return ", color='" + color + '\'' + ", material='" + material + '\'' + '}';
    }


}

