package mars.direction;

public class West implements Direction {
    @Override
    public void rotateLeft(Direction direction) {
        direction = new South();
    }

    @Override
    public void rotateRight(Direction direction) {
        direction = new North();
    }
}
