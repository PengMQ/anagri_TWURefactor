package problem2;

public class Rover {
    private Direction direction;

    public Rover(Direction direction) {
        this.direction = direction;
    }

    public void turnRight() {
        direction = direction.turnRight();
    }

    public void turnLeft() {
        direction = direction.turnLeft();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rover rover = (Rover) o;

        if (direction != null ? !direction.equals(rover.direction) : rover.direction != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
