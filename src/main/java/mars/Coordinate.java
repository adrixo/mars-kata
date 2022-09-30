package mars;

public class Coordinate {
    public final int x;
    public final int y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean equals(Coordinate other) {
        return (x == other.x && y == other.y);
    }

}
