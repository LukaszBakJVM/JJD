package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class WallTest {
    private Wall blockList = new Wall();

    @BeforeEach
    void addToList() {
        blockList.addToList("white", "wood");
        blockList.addToList("red", "metal");
        blockList.addToList("black", "metal");
        blockList.addToList("white", "paper");
    }


    @Test
    void findBlockByColorNotExist() {
        Optional<Block> notExist = blockList.findBlockByColor("whi");
        assertEquals(Optional.empty(), notExist);
    }

    @Test
    void findBlockByColorExist() {
        Optional<Block> red = blockList.findBlockByColor("red");
        assertTrue(red.isPresent());
        assertEquals("red", red.get().getColor());
    }

    @Test
    void findBlocksByMaterialNotExist() {
        List<Block> notExist = blockList.findBlocksByMaterial("pa");
        assertTrue(notExist.isEmpty());
    }

    @Test
    void findBlocksByMaterialExist() {
        List<Block> metal = blockList.findBlocksByMaterial("metal");
        assertEquals(2, metal.size());
    }

    @Test
    void count() {
        int count = blockList.count();
        assertEquals(4, count);

    }


}