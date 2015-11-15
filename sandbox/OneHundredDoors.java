import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class OneHundredDoors {

    public DS[] doorStatesAfterPassingDoors(int amountOfDoorsPassed) {
        List<DS> doorStates = new ArrayList<DS>(Arrays.asList(
                DS.C, DS.C, DS.C
            ));
        if (amountOfDoorsPassed == 1) {
            return new DS[]{DS.OPEN};
        }
        if (amountOfDoorsPassed == 2) {
            return new DS[]{DS.OPEN, DS.C};
        }
        return new DS[]{DS.OPEN, DS.C, DS.C};
    }
}
