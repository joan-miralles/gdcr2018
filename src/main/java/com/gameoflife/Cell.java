package com.gameoflife;

public class Cell {

    private CellStatus liveStatus;

    public Cell(CellStatus liveStatus) {
        this.liveStatus = liveStatus;
    }

    public CellStatus getLiveStatus() {
        return liveStatus;
    }

    public NeighboursCells getNeighbours() {
        return new NeighboursCells();
    }

    public void update() {
        this.liveStatus = CellStatus.DIED;
    }

    public enum CellStatus {
        ALIVE,
        DIED
    }

    class NeighboursCells {
    }
}
