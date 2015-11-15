import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class OneHundredDoors {

    public DS[] doorStatesAfterPassingDoors(int amountOfDoorsPassed) {
        List<DS> doorStates = new ArrayList<DS>(Arrays.asList(
                DS.C, 
                DS.C, DS.C, DS.C
            ));
        if (amountOfDoorsPassed == 1) {
            doorStates.set(1, DS.OPEN);
            return doorStates.subList(1, 2).toArray();
        }
        if (amountOfDoorsPassed == 2) {
            return new DS[]{DS.OPEN, DS.C};
        }
        return new DS[]{DS.OPEN, DS.C, DS.C};
    }
}
