package mars;

public class MarsRover {

    GPS gps;

    public MarsRover(String setupDirection) {
        gps = new GPS(setupDirection);

    }

    public String execute(String commands) {
        for(char c : commands.toCharArray()) {
            if (c == 'R')
                gps.rotateRight();
            if (c == 'L')
                gps.rotateLeft();
        }
        return "0:0:" + gps.getDirection();
    }

}
