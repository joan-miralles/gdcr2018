package com.gameoflife;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.isA;

public class CellShould {
    private Cell cell;

    @BeforeEach
    void setUp() {
    }

    @Test
    void start_with_alive_status() {
        cell = new Cell();
        assertThat(cell.liveStatus(), is(Cell.CellStatus.ALIVE));
    }

    @Test
    void has_neighbours() {
        cell = new Cell();
        assertThat(cell.getNeighbours(), isA(Cell.NeighboursCells.class));
    }
}
