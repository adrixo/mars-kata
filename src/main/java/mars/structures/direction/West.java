package mars.structures.direction;

import mars.structures.Coordinate;

public class West implements Direction {
    @Override
    public String asString() {
        return "W";
    }
    @Override
    public Direction rotateLeft() {
        return new South();
    }

    @Override
    public Direction rotateRight() {
        return new North();
    }

    @Override
    public Coordinate moveVector() {
        return new Coordinate(-1,0);
    }
}
