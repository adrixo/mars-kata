package mars.direction;

import mars.Coordinate;

public interface Direction {
    public String asString();
    public Direction rotateLeft();
    public Direction rotateRight();
    public Coordinate moveVector();
}
