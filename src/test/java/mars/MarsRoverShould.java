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
        marsRover = new MarsRover("N");
    }

    @ParameterizedTest
    @CsvSource({
       "'R', '0:0:E'",
       "'RR', '0:0:S'"
    }) public void
    rotate_right(String commands, String expectedPosition) {
        assertThat(marsRover.execute(commands)).isEqualTo(expectedPosition);
    }
}