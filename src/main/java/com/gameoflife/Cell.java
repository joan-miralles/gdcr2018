package com.gameoflife;

import java.util.HashMap;
import java.util.Map;

class Cell {
    private boolean alive;

    static Map<Integer, Boolean> STATUS_BY_ALIVE_NEIGHBOURS = new HashMap<>();

    static {
        STATUS_BY_ALIVE_NEIGHBOURS.put(0, false);
        STATUS_BY_ALIVE_NEIGHBOURS.put(1, false);
        STATUS_BY_ALIVE_NEIGHBOURS.put(2, true);
        STATUS_BY_ALIVE_NEIGHBOURS.put(3, true);
        STATUS_BY_ALIVE_NEIGHBOURS.put(4, false);
        STATUS_BY_ALIVE_NEIGHBOURS.put(5, false);
        STATUS_BY_ALIVE_NEIGHBOURS.put(6, false);
        STATUS_BY_ALIVE_NEIGHBOURS.put(7, false);
        STATUS_BY_ALIVE_NEIGHBOURS.put(8, false);
    }


    public Cell(boolean alive) {
        this.alive = alive;
    }

    public boolean isAlive() {
        return alive;
    }

    public void update(Neighbours neighbours) {
        this.alive = STATUS_BY_ALIVE_NEIGHBOURS.get(neighbours.numberOfAlive());
    }

}

class Neighbours {

    public int numberOfAlive() {
        return 0;
    }
}