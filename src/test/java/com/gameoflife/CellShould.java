package com.gameoflife;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CellShould {
    private Cell cell;
    private NeighboursCells neighbours;

    @BeforeEach
    void setUp() {
        neighbours = mock(NeighboursCells.class);
        when(neighbours.numberOfAliveCells()).thenReturn(1);
    }

    @Test
    void start_with_alive_status() {
        cell = new Cell(Cell.CellStatus.ALIVE, neighbours);
        assertThat(cell.getLiveStatus(), is(Cell.CellStatus.ALIVE));
    }

    @Test
    void has_neighbours() {
        cell = new Cell(Cell.CellStatus.ALIVE, neighbours);
        assertThat(cell.getNeighbours(), isA(NeighboursCells.class));
    }

    @Test
    void die_with_less_than_2_alive_neighbours() {
        cell = new Cell(Cell.CellStatus.ALIVE, neighbours);
        cell.update();
        assertThat(cell.getLiveStatus(), is(Cell.CellStatus.DIED));
    }

    @Test
    void survive_in_contact_with_2_alive_neighbours() {
        when(neighbours.numberOfAliveCells()).thenReturn(2);
        cell = new Cell(Cell.CellStatus.ALIVE, neighbours);
        cell.update();
        assertThat(cell.getLiveStatus(), is(Cell.CellStatus.ALIVE));
    }


    @Test
    void survive_in_contact_with_3_alive_neighbours() {
        when(neighbours.numberOfAliveCells()).thenReturn(3);
        cell = new Cell(Cell.CellStatus.ALIVE, neighbours);
        cell.update();
        assertThat(cell.getLiveStatus(), is(Cell.CellStatus.ALIVE));
    }
}
