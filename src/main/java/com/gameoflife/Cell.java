package com.gameoflife;

import java.util.HashMap;
import java.util.Map;

class Cell {
    private boolean alive;

    static Map<Boolean, Map<Integer, Boolean>> NEW_STATUS_MAP = new HashMap<>();
    static Map<Integer, Boolean> CURRENT_ALIVE_NEW_STATUS_BY_ALIVE_NEIGHBOURS = new HashMap<>();
    static Map<Integer, Boolean> CURRENT_DIED_NEW_STATUS_BY_ALIVE_NEIGHBOURS = new HashMap<>();

    static {
        NEW_STATUS_MAP.put(true, CURRENT_ALIVE_NEW_STATUS_BY_ALIVE_NEIGHBOURS);
        NEW_STATUS_MAP.put(false, CURRENT_DIED_NEW_STATUS_BY_ALIVE_NEIGHBOURS);

        CURRENT_ALIVE_NEW_STATUS_BY_ALIVE_NEIGHBOURS.put(0, false);
        CURRENT_ALIVE_NEW_STATUS_BY_ALIVE_NEIGHBOURS.put(1, false);
        CURRENT_ALIVE_NEW_STATUS_BY_ALIVE_NEIGHBOURS.put(2, true);
        CURRENT_ALIVE_NEW_STATUS_BY_ALIVE_NEIGHBOURS.put(3, true);
        CURRENT_ALIVE_NEW_STATUS_BY_ALIVE_NEIGHBOURS.put(4, false);
        CURRENT_ALIVE_NEW_STATUS_BY_ALIVE_NEIGHBOURS.put(5, false);
        CURRENT_ALIVE_NEW_STATUS_BY_ALIVE_NEIGHBOURS.put(6, false);
        CURRENT_ALIVE_NEW_STATUS_BY_ALIVE_NEIGHBOURS.put(7, false);
        CURRENT_ALIVE_NEW_STATUS_BY_ALIVE_NEIGHBOURS.put(8, false);

        CURRENT_DIED_NEW_STATUS_BY_ALIVE_NEIGHBOURS.put(0, false);
        CURRENT_DIED_NEW_STATUS_BY_ALIVE_NEIGHBOURS.put(1, false);
        CURRENT_DIED_NEW_STATUS_BY_ALIVE_NEIGHBOURS.put(2, false);
        CURRENT_DIED_NEW_STATUS_BY_ALIVE_NEIGHBOURS.put(3, true);
        CURRENT_DIED_NEW_STATUS_BY_ALIVE_NEIGHBOURS.put(4, true);
        CURRENT_DIED_NEW_STATUS_BY_ALIVE_NEIGHBOURS.put(5, true);
        CURRENT_DIED_NEW_STATUS_BY_ALIVE_NEIGHBOURS.put(6, true);
        CURRENT_DIED_NEW_STATUS_BY_ALIVE_NEIGHBOURS.put(7, true);
        CURRENT_DIED_NEW_STATUS_BY_ALIVE_NEIGHBOURS.put(8, true);
    }


    public Cell(boolean alive) {
        this.alive = alive;
    }

    public boolean isAlive() {
        return alive;
    }

    public void update(Neighbours neighbours) {
        this.alive = NEW_STATUS_MAP.get(this.alive).get(neighbours.numberOfAlive());
    }

}

class Neighbours {

    public int numberOfAlive() {
        return 0;
    }
}