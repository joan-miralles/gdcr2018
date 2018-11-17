package com.gameoflife;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CellShould {

    @Test
    void alive_when_start() {
        Cell cell = new Cell();
        assertTrue(cell.isAlive());
    }

}

