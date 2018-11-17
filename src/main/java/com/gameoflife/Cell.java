package com.gameoflife;

class Cell {
    private boolean alive;

    public Cell(boolean alive) {
        this.alive = alive;
    }

    public boolean isAlive() {
        return alive;
    }

    public void update() {
        this.alive = false;
    }
}
