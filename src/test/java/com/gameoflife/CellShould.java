package com.gameoflife;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CellShould {

    @Test
    void alive_when_start() {
        Cell cell = new Cell(true);
        assertTrue(cell.isAlive());
    }

    @Test
    void die_in_contact_with_less_than_2_alive() {
        Cell cell = new Cell(true);
        cell.update();
        assertFalse(cell.isAlive());
    }
}

