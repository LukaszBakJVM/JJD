package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Wall implements Structure, CompositeBlock {


    private List<Block> blocks = new ArrayList<>();
    private String color;
    private String material;

    public Wall() {

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wall wall = (Wall) o;
        return Objects.equals(color, wall.color) && Objects.equals(material, wall.material);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, material);
    }
}

