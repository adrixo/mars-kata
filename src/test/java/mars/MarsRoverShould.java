package mars;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MarsRoverShould {

    private MarsRover marsRover;

    @BeforeEach
    void setUp() {
        marsRover = new MarsRover("0:0:N");
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

}