package mars.command;

import mars.widgets.GPS;

public class TurnRight implements Command {
    private final GPS gps;

    public TurnRight(GPS gps) {
        this.gps = gps;
    }

    @Override
    public void execute() {
        gps.direction = gps.direction.rotateRight();
    }
}
