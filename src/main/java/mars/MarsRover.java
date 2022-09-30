package mars;

public class MarsRover {
    String direction;

    public MarsRover(String direction) {
        this.direction = direction;
    }

    public String execute(String commands) {
        for(char c : commands.toCharArray()) {
            if (direction == "N")
                direction = "E";
            else if (direction == "E")
                direction = "S";
            else if (direction == "S")
                direction = "W";
            else if (direction == "W")
                direction = "N";
        }
        return "0:0:" + direction;
    }
}
