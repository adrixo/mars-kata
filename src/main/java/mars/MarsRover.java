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
        }
        return "0:0:" + direction;
    }
}
