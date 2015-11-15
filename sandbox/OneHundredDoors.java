import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class OneHundredDoors {

    public DS[] doorStatesAfterPassingDoors(int amountOfDoorsPassed) {
        List<DS> doorStates = new ArrayList<DS>(Arrays.asList(
                DS.C, 
                DS.C, DS.C, DS.C, DS.C, DS.C,         DS.C, DS.C, DS.C, DS.C, DS.C,
                DS.C, DS.C, DS.C, DS.C, DS.C,         DS.C, DS.C, DS.C, DS.C, DS.C,
                DS.C, DS.C, DS.C, DS.C, DS.C,         DS.C, DS.C, DS.C, DS.C, DS.C,
                DS.C, DS.C, DS.C, DS.C, DS.C,         DS.C, DS.C, DS.C, DS.C, DS.C,
                DS.C, DS.C, DS.C, DS.C, DS.C,         DS.C, DS.C, DS.C, DS.C, DS.C,
                DS.C, DS.C, DS.C, DS.C, DS.C,         DS.C, DS.C, DS.C, DS.C, DS.C,
                DS.C, DS.C, DS.C, DS.C, DS.C,         DS.C, DS.C, DS.C, DS.C, DS.C,
                DS.C, DS.C, DS.C, DS.C, DS.C,         DS.C, DS.C, DS.C, DS.C, DS.C,
                DS.C, DS.C, DS.C, DS.C, DS.C,         DS.C, DS.C, DS.C, DS.C, DS.C,
                DS.C, DS.C, DS.C, DS.C, DS.C,         DS.C, DS.C, DS.C, DS.C, DS.C
            ));
        List<DS> result = null;

        for (int pass = 1; pass <= amountOfDoorsPassed; pass++) {
            for (int door = 1; door <= amountOfDoorsPassed; door++) {
                if (door % pass == 0) {
                    if (DS.C.equals(doorStates.get(door)) {
                        doorStates.set(door, DS.OPEN);
                    } else if (DS.OPEN.equals(doorStates.get(door)) {
                        doorStates.set(door, DS.C);
                    }
                }
            }
        }

        if (amountOfDoorsPassed == 1) {
            doorStates.set(1, DS.OPEN);
        } else if (amountOfDoorsPassed == 2) {
            doorStates.set(1, DS.OPEN);
            doorStates.set(2, DS.C);
        } else {
            doorStates.set(1, DS.OPEN);
            doorStates.set(2, DS.C);
            doorStates.set(3, DS.C);
        }

        result = doorStates.subList(1, amountOfDoorsPassed + 1);
        return result.toArray(new DS[amountOfDoorsPassed]);
    }
}
