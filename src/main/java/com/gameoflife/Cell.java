package com.gameoflife;

public class Cell {

    public CellStatus liveStatus() {
        return CellStatus.ALIVE;
    }

    public NeighboursCells getNeighbours() {
        return new NeighboursCells();
    }

    public enum CellStatus {
        ALIVE
    }

    class NeighboursCells {
    }
}
