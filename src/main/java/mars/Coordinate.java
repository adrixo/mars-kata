package mars;

public class Coordinate {
    public final int x;
    public final int y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Coordinate moveTo(Coordinate vector) {
        int nextX = (x+vector.x) % VAR.GRID_SIZE;
        int nextY = (y+vector.y) % VAR.GRID_SIZE;
        return new Coordinate(nextX, nextY);
    }
}
