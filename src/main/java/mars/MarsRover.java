package mars;

import mars.command.Factory;
import mars.structures.Grid;
import mars.widgets.GPS;

public class MarsRover {

    GPS gps;
    Invoker invoker = new Invoker();

    public MarsRover(String setupDirection, Grid grid) {
        gps = new GPS(setupDirection, grid);
    }

    public String execute(String commands) {
        invoker.configure(Factory.parse(commands, gps));
        invoker.executeQueue();
        return gps.getLocationAsString();
    }
}
