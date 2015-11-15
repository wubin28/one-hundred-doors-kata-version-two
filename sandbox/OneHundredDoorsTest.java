import org.junit.*;
import static org.junit.Assert.*;

public class OneHundredDoorsTest {

    @Test
    public void if_there_is_only_1_door_to_pass_the_state_of_door_should_be_OPEN() {
        // Given
        OneHundredDoors oneHundredDoors = new OneHundredDoors();

        // When
        // Then
        assertArrayEquals(new Door[]{Door.OPEN}, oneHundredDoors.doorStatesAfterPassingDoors(1));
    }

    // TODO: if_there_are_2_doors_to_pass_the_state_of_doors_should_be_OPEN_CLOSED
    // TODO: if_there_are_3_doors_to_pass_the_state_of_doors_should_be_OPEN_CLOSED_CLOSED
    // TODO: if_there_are_100_doors_to_pass_the_state_of_doors_should_be_all_right

}
