package mars;

import mars.direction.*;

public class GPS {
    EDirection direction;
    Coordinate coordinate;

    public GPS(String setupDirection) {
        String[] args = setupDirection.split(":");
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        coordinate = new Coordinate(x, y);
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
        int x = coordinate.x;
        int y = coordinate.y;
        if (direction.asString()=="E")
            x = (x+1) % VAR.GRID_SIZE;

        if (direction.asString()=="N")
            y = (y+1) % VAR.GRID_SIZE;

        coordinate = new Coordinate(x, y);
    }

    public int getX() {
        return coordinate.x;
    }

    public int getY() {
        return coordinate.y;
    }
}
