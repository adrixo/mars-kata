package mars.direction;

public enum EDirection {
    NORTH("N","W","E"),
    EAST("E", "N", "S"),
    SOUTH("S", "E", "W"),
    WEST("W", "S", "N");

    private final String value;
    private final String left;
    private final String right;

    EDirection(String value, String left, String right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public static EDirection getDirectionFor(String value) {
        for (EDirection direction : values()) {
            if (direction.value.equals(value))
                return direction;
        }
        return null;
    }

    public String asString() {
        return value;
    }

    public EDirection rotateRight() {
        for (EDirection direction : values()) {
            if (direction.value == this.right)
                return direction;
        }
        return null;
    }

    public EDirection rotateLeft() {
        for (EDirection direction : values()) {
            if (direction.value == this.left) {
                return direction;
            }
        }
        return null;
    }
}
