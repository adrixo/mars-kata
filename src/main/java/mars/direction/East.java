package mars.direction;

public class East implements Direction {
    @Override
    public void rotateLeft(Direction direction) {
        direction = new North();
    }

    @Override
    public void rotateRight(Direction direction) {
        direction = new South();
    }
}
