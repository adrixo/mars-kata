package mars;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MarsRoverShould {

    private MarsRover marsRover;

    @BeforeEach
    void setUp() {
        marsRover = new MarsRover();
        //Asume 0:0:N as default position
    }

    @Test public void
    rotate_right() {
        assertThat(marsRover.execute("R")).isEqualTo("0:0:E");
    }
}