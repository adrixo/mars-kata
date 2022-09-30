package mars;

public class MarsRover {
    String direction;

    public MarsRover(String direction) {
        this.direction = direction;
    }

    public String execute(String commands) {
        for(char c : commands.toCharArray()) {
            if (c == 'R')
                rotateRight();
            if (c == 'L')
                rotateLeft();
        }
        return "0:0:" + direction;
    }

    private void rotateLeft() {
        direction = "W";
    }

    private void rotateRight() {
        if (direction == "N")
            direction = "E";
        else if (direction == "E")
            direction = "S";
        else if (direction == "S")
            direction = "W";
        else if (direction == "W")
            direction = "N";
    }
}
