package mars.direction;

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
}
