package mars;

import mars.direction.*;

public class GPS {
    EDirection direction;
    Coordinate coordinate;

    public GPS(String setupDirection) {
        String[] args = setupDirection.split(":");
        coordinate = new Coordinate(args[0], args[1]);
        direction = EDirection.getDirectionFor(args[2]);
    }

    public String getDirection() {
        return direction.asString();
    }

    public void rotateRight() {
        direction = direction.rotateRight();
    }

    public void rotateLeft() {
        direction = direction.rotateLeft();
    }

    public void moveForward() {

    }

    public String getX() {
        return coordinate.x;
    }

    public String getY() {
        return coordinate.y;
    }
}
