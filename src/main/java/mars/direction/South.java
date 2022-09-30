package mars.direction;

public class South implements Direction {
    @Override
    public void rotateLeft(Direction direction) {
        direction = new East();
    }

    @Override
    public void rotateRight(Direction direction) {
        direction = new West();
    }
}
