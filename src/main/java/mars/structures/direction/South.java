package mars.structures.direction;

import mars.structures.Coordinate;

public class South implements Direction {
    @Override
    public String asString() {
        return "S";
    }
    @Override
    public Direction rotateLeft() {
        return new East();
    }

    @Override
    public Direction rotateRight() {
        return new West();
    }

    @Override
    public Coordinate moveVector() {
        return new Coordinate(0,-1);
    }
}
