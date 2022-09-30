package mars.direction;

public class North implements Direction {
    @Override
    public void rotateLeft(Direction direction) {
        direction = new West();
    }

    @Override
    public void rotateRight(Direction direction) {
        direction = new East();
    }
}
