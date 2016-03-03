package domain;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * Created by jordirolli on 3/3/16.
 */
public class DoorTest {

    @Test
    public void initialState() throws Exception {
        Door.Status expected = Door.Status.CLOSED;
        Door initialDoor = new Door();
        Door.Status actual = initialDoor.getStatus();
        assertEquals(expected, actual);
    }

    @Test
    public void testToogle() throws Exception {
        Door.Status expected = Door.Status.OPENED;
        Door toggledDoor = new Door();
        toggledDoor.toggle();
        Door.Status actual = toggledDoor.getStatus();
        assertEquals(expected, actual);
    }
}