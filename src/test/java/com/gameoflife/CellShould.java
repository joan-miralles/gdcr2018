package com.gameoflife;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CellShould {

    private Neighbours neighbours;

    @BeforeEach
    void setUp() {
        neighbours = mock(Neighbours.class);
    }

    @Test
    void alive_when_start() {
        Cell cell = new Cell(true);
        assertTrue(cell.isAlive());
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 1})
    void die_in_contact_with_less_than_2_alive(int numberOfAliveNeighbours) {
        when(neighbours.numberOfAlive()).thenReturn(numberOfAliveNeighbours);
        Cell cell = new Cell(true);
        cell.update(neighbours);
        assertFalse(cell.isAlive());
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 3})
    void survive_in_contact_with_2_or_3_alive(int numberOfAliveNeighbours) {
        when(neighbours.numberOfAlive()).thenReturn(numberOfAliveNeighbours);
        Cell cell = new Cell(true);
        cell.update(neighbours);
        assertTrue(cell.isAlive());
    }

}

