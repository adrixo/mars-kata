package mars.direction;

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
}
