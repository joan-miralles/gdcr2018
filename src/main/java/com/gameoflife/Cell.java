package com.gameoflife;

public class Cell {

    private CellStatus liveStatus;
    private NeighboursCells neighboursCells;

    public Cell(CellStatus liveStatus, NeighboursCells neighboursCells) {
        this.liveStatus = liveStatus;
        this.neighboursCells = neighboursCells;
    }

    public CellStatus getLiveStatus() {
        return liveStatus;
    }

    public NeighboursCells getNeighbours() {
        return neighboursCells;
    }

    public void update() {
        if (neighboursCells.numberOfAliveCells() < 2) {
            this.liveStatus = CellStatus.DIED;
        } else {
            this.liveStatus = CellStatus.ALIVE;
        }
    }

    public enum CellStatus {
        ALIVE,
        DIED
    }

}
