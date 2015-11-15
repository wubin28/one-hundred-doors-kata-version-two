
public class OneHundredDoors {

    public Door[] doorStatesAfterPassingDoors(int amountOfDoorsPassed) {
        if (amountOfDoorsPassed == 1) {
            return new Door[]{Door.OPEN};
        }
        return new Door[]{Door.OPEN, Door.CLOSED};
    }
}
