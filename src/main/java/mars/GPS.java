package mars;

import mars.direction.*;

public class GPS {
    Direction direction;
    public GPS(String setupDirection) {
        String[] args = setupDirection.split(":");
        switch(args[2]) {
            case "E":
                direction = new East();
                break;
            case "N":
                direction = new North();
                break;
            case "S":
                direction = new South();
                break;
            case "W":
                direction = new West();
                break;
        }
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
