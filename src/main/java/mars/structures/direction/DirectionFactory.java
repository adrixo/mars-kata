package mars.structures.direction;

public class DirectionFactory {

    public static Direction getDirectionFor(String stringDirection) {
        return switch (stringDirection) {
            case "N" -> new North();
            case "S" -> new South();
            case "W" -> new West();
            case "E" -> new East();
            default -> null;
        };
    }
}
