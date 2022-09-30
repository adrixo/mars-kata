package mars.direction;

public interface Direction {
    public String asString();
    public Direction rotateLeft();
    public Direction rotateRight();
}
