package mars.command;

import mars.widgets.GPS;

public class TurnLeft implements Command {
    private final GPS gps;

    public TurnLeft(GPS gps) {
        this.gps = gps;
    }

    @Override
    public void execute() {
        gps.direction = gps.direction.rotateLeft();
    }
}
