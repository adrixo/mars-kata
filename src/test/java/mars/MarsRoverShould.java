package mars;

import mars.structures.Coordinate;
import mars.structures.Grid;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class MarsRoverShould {

    private MarsRover marsRover;
    private Grid grid;

    @BeforeEach
    void setUp() {
        grid = new Grid();
        marsRover = new MarsRover("0:0:N", grid);
    }

    @ParameterizedTest
    @CsvSource({
       "'R', '0:0:E'",
       "'RR', '0:0:S'",
       "'RRR', '0:0:W'",
       "'RRRR', '0:0:N'"
    }) public void
    rotate_right(String commands, String expectedPosition) {
        assertThat(marsRover.execute(commands)).isEqualTo(expectedPosition);
    }

    @ParameterizedTest
    @CsvSource({
            "'L', '0:0:W'",
            "'LL', '0:0:S'",
            "'LLL', '0:0:E'",
            "'LLLL', '0:0:N'",
    }) public void
    rotate_left(String commands, String expectedPosition) {
        assertThat(marsRover.execute(commands)).isEqualTo(expectedPosition);
    }

    @ParameterizedTest
    @CsvSource({
            "'M', '0:1:N'",
            "'MM', '0:2:N'",
            "'MMM', '0:3:N'",
            "'MMMM', '0:4:N'",
            "'MMMMM', '0:5:N'",
            "'MMMMMM', '0:6:N'",
            "'MMMMMMM', '0:7:N'",
            "'MMMMMMMM', '0:0:N'",
    }) public void
    move_forward(String commands, String expectedPosition) {
        assertThat(marsRover.execute(commands)).isEqualTo(expectedPosition);
    }
    @ParameterizedTest
    @CsvSource({
            "'RM', '1:0:E'",
            "'RMM', '2:0:E'",
            "'RMMM', '3:0:E'",
            "'RMMMM', '4:0:E'",
            "'RMMMMM', '5:0:E'",
            "'RMMMMMM', '6:0:E'",
            "'RMMMMMMM', '7:0:E'",
            "'RMMMMMMMM', '0:0:E'",
    }) public void
    move_forward_east(String commands, String expectedPosition) {
        assertThat(marsRover.execute(commands)).isEqualTo(expectedPosition);
    }

    @ParameterizedTest
    @CsvSource({
            "'RRM', '0:7:S'",
            "'RRMM', '0:6:S'",
            "'RRMMM', '0:5:S'",
            "'RRMMMM', '0:4:S'",
            "'RRMMMMM', '0:3:S'",
            "'RRMMMMMM', '0:2:S'",
            "'RRMMMMMMM', '0:1:S'",
            "'RRMMMMMMMM', '0:0:S'",
    }) public void
    move_forward_to_south(String commands, String expectedPosition) {
        assertThat(marsRover.execute(commands)).isEqualTo(expectedPosition);
    }

    @ParameterizedTest
    @CsvSource({
            "'LM', '7:0:W'",
            "'LMM', '6:0:W'",
            "'LMMM', '5:0:W'",
            "'LMMMM', '4:0:W'",
            "'LMMMMM', '3:0:W'",
            "'LMMMMMM', '2:0:W'",
            "'LMMMMMMM', '1:0:W'",
            "'LMMMMMMMM', '0:0:W'",
    }) public void
    move_forward_to_west(String commands, String expectedPosition) {
        assertThat(marsRover.execute(commands)).isEqualTo(expectedPosition);
    }

    @ParameterizedTest
    @CsvSource({
            "'MMMM', '0:3', 'C:0:2:N'",
            "'MMMMMMMM', '0:5', 'C:0:4:N'",
    }) public void
    move_fordwards_and_stops_At_obstacle(String commands, String obstaclePosition, String expectedPosition) {
        String[] op = obstaclePosition.split(":");
        Coordinate obstacle = new Coordinate(Integer.parseInt(op[0]), Integer.parseInt(op[1]));
        grid.addObstacleAt(obstacle);
        assertThat(marsRover.execute(commands)).isEqualTo(expectedPosition);
    }
}