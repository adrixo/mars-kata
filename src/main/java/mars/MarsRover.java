package mars;

import mars.structures.Grid;
import mars.widgets.GPS;

public class MarsRover {

    private final Grid grid;
    GPS gps;

    public MarsRover(String setupDirection, Grid grid) {
        this.grid = grid;
        gps = new GPS(setupDirection, grid);
    }

    public String execute(String commands) {
        for(char c : commands.toCharArray()) {
            if (c == 'R')
                gps.rotateRight();
            if (c == 'L')
                gps.rotateLeft();
            if (c == 'M')
                gps.moveForward();
        }
        return gps.getLocationAsString();
    }

}
