package mars.direction;

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
}
