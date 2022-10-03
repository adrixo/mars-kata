package mars;

import mars.command.Factory;
import mars.structures.Grid;
import mars.widgets.GPS;

public class MarsRover {

    GPS gps;
    Invoker invoker;

    public MarsRover(Grid grid, String setupDirection, Invoker invoker) {
        this.invoker = invoker;
        gps = new GPS(setupDirection, grid);
    }

    public String execute(String commands) {
        invoker.configureNewCommandQueue(Factory.parse(commands, gps));
        invoker.executeQueue();
        return gps.getLocationAsString();
    }

    public void configureExecution(String commands) {
        invoker.configureNewCommandQueue(Factory.parse(commands, gps));
    }

    public String getLocation() {
        return gps.getLocationAsString();
    }
}
