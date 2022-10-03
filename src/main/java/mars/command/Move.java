package mars.command;

import mars.structures.Coordinate;
import mars.widgets.GPS;

public class Move implements Command {
    private final GPS gps;

    public Move(GPS gps) {
        this.gps = gps;
    }

    @Override
    public void execute() {
        Coordinate vector = gps.direction.moveVector();
        // REF: see GPS class comment
        Coordinate newCoordinate = gps.grid.nextCoordinateFor(gps.coordinate, vector);
        if (gps.coordinate.equals(newCoordinate)) {
            gps.foundColision = true;
        } else {
            gps.foundColision = false;
        }
        gps.coordinate = newCoordinate;
    }
}
