package problem2;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class RoverTest {
    @Test
    public void shouldHaveNewDirectionAsEastWhenTurningRightFromNorth() {
        Rover rover = new Rover(new Direction('N'));

        rover.turnRight();

        assertThat(rover, is(new Rover(new Direction('E'))));
    }

    @Test
    public void shouldHaveNewDirectionAsSouthWhenTurningRightFromEast() {
        Rover rover = new Rover(new Direction('E'));

        rover.turnRight();

        assertThat(rover, is(new Rover(new Direction('S'))));
    }

    @Test
    public void shouldHaveNewDirectionAsWestWhenTurningRightFromSouth() {
        Rover rover = new Rover(new Direction('S'));

        rover.turnRight();

        assertThat(rover, is(new Rover(new Direction('W'))));
    }

    @Test
    public void shouldHaveNewDirectionAsNorthWhenTurningRightFromWest() {
        Rover rover = new Rover(new Direction('W'));

        rover.turnRight();

        assertThat(rover, is(new Rover(new Direction('N'))));
    }

    @Test
    public void shouldHaveNewDirectionAsWestWhenTurningLeftFromNorth() {
        Rover rover = new Rover(new Direction('N'));

        rover.turnLeft();

        assertThat(rover, is(new Rover(new Direction('W'))));
    }
}
