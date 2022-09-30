package mars.direction;

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
}
