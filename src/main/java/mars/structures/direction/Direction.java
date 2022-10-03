package mars.structures.direction;

import mars.structures.Coordinate;

public interface Direction {
    public String asString();
    public Direction rotateLeft();
    public Direction rotateRight();
    public Coordinate moveVector();
}
