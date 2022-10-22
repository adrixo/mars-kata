package mars;

import mars.structures.Coordinate;
import mars.structures.Grid;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MarsRoverFeature {

    @Test
    public void
    floatOfMarsRoversAndMultipleObstacles() {
        //  0 1 2 3 4 5 6 7 8
        //7 a>1 x
        //6 x 3 â
        //5 1 4 4
        //4 â
        Invoker invoker = new Invoker();
        Coordinate obstacle1 = new Coordinate(2,7);
        Coordinate obstacle2 = new Coordinate(0, 6);
        Grid grid = new Grid();
        grid.addObstacleAt(obstacle1);
        grid.addObstacleAt(obstacle2);
        MarsRover mr1 = new MarsRover(grid, "0:4:N", invoker);
        MarsRover mr2 = new MarsRover(grid, "0:7:E", invoker);

        mr1.configureExecution("MMMRMMLMM");
        mr2.configureExecution("MMRMM");
        invoker.executeQueue();
        assertEquals("C:2:6:N", mr1.getLocation());
        assertEquals("1:5:S", mr2.getLocation());
    }

}