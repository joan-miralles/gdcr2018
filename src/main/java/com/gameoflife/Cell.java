package com.gameoflife;

public class Cell {

    public CellStatus liveStatus() {
        return CellStatus.ALIVE;
    }

    public enum CellStatus {
        ALIVE
    }
}
