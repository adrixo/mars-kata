package mars.structures.direction;

import mars.structures.Coordinate;

public class North implements Direction {
    @Override
    public String asString() {
        return "N";
    }
    @Override
    public Direction rotateLeft() {
        return new West();
    }

    @Override
    public Direction rotateRight() {
        return new East();
    }

    @Override
    public Coordinate moveVector() {
        return new Coordinate(0,1);
    }
}
