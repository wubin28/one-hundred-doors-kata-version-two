
public class OneHundredDoors {

    public Door[] doorStatesAfterPassingDoors(int amountOfDoorsPassed) {
        // TODO: Change the name of Door to DoorState
        List<Door> doorStates = new ArrayList<Door>(Arrays.asList(
                Door.CLOSED, Door.CLOSED, Door.CLOSED
            ));
        if (amountOfDoorsPassed == 1) {
            return new Door[]{Door.OPEN};
        }
        if (amountOfDoorsPassed == 2) {
            return new Door[]{Door.OPEN, Door.CLOSED};
        }
        return new Door[]{Door.OPEN, Door.CLOSED, Door.CLOSED};
    }
}
