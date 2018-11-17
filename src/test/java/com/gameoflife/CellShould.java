package com.gameoflife;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.isA;

public class CellShould {
    private Cell cell;

    @BeforeEach
    void setUp() {
        cell = new Cell(Cell.CellStatus.ALIVE);
    }

    @Test
    void start_with_alive_status() {
        assertThat(cell.getLiveStatus(), is(Cell.CellStatus.ALIVE));
    }

    @Test
    void has_neighbours() {
        assertThat(cell.getNeighbours(), isA(Cell.NeighboursCells.class));
    }

    @Test
    void die_with_less_than_2_alive_neighbours() {
        cell.update();
        assertThat(cell.getLiveStatus(), is(Cell.CellStatus.DIED));
    }
}
