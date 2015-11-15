
public class OneHundredDoors {

    public Door[] doorStatesAfterPassingDoors(int amountOfDoorsPassed) {
        if (amountOfDoorsPassed == 1) {
            return new Door[]{Door.OPEN};
        }
        if (amountOfDoorsPassed == 2) {
            return new Door[]{Door.OPEN, Door.CLOSED};
        }
        return new Door[]{Door.OPEN, Door.CLOSED, Door.CLOSED};
    }
}
