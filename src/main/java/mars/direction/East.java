package mars.direction;

import mars.Coordinate;

public class East implements Direction {
    @Override
    public String asString() {
        return "E";
    }
    @Override
    public Direction rotateLeft() {
        return new North();
    }

    @Override
    public Direction rotateRight() {
        return new South();
    }

    @Override
    public Coordinate moveVector() {
        return new Coordinate(1,0);
    }
}
