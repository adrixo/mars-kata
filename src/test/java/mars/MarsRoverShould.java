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
    }) public void
    move_forward(String commands, String expectedPosition) {
        assertThat(marsRover.execute(commands)).isEqualTo(expectedPosition);
    }
}