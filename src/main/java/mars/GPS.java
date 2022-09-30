package mars;

import mars.direction.*;

public class GPS {
    EDirection direction;
    public GPS(String setupDirection) {
        String[] args = setupDirection.split(":");
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
}
