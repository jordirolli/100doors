package domain;

import org.junit.Test;

import static org.mockito.Mockito.*;

import static org.junit.Assert.*;

/**
 * Created by jordirolli on 3/3/16.
 */
public class JumpyLoopingHikerTest {


    @Test
    public void testHikeOneObstacle() throws Exception {
        Trail mockedTrail = mock(Trail.class);
        when(mockedTrail.getSize()).thenReturn(1);
        JumpyLoopingHiker.hike(mockedTrail);
        verify(mockedTrail, times(1)).manageObstacle(0);
    }


    // TODO create a private method that does accept the size and pair of <element, expectedcalls>

    @Test
    public void testHikeTwoObstacles() throws Exception {
        Trail mockedTrail = mock(Trail.class);
        when(mockedTrail.getSize()).thenReturn(2);
        JumpyLoopingHiker.hike(mockedTrail);
        verify(mockedTrail, times(1)).manageObstacle(0);
        verify(mockedTrail, times(2)).manageObstacle(1);
    }

    @Test
    public void testHikeThreeObstacles() throws Exception {
        Trail mockedTrail = mock(Trail.class);
        when(mockedTrail.getSize()).thenReturn(3);
        JumpyLoopingHiker.hike(mockedTrail);
        verify(mockedTrail, times(1)).manageObstacle(0);
        verify(mockedTrail, times(2)).manageObstacle(1);
        verify(mockedTrail, times(2)).manageObstacle(2);
    }

    @Test
    public void testHikeFourObstacles() throws Exception {
        Trail mockedTrail = mock(Trail.class);
        when(mockedTrail.getSize()).thenReturn(4);
        JumpyLoopingHiker.hike(mockedTrail);
        verify(mockedTrail, times(1)).manageObstacle(0);
        verify(mockedTrail, times(2)).manageObstacle(1);
        verify(mockedTrail, times(2)).manageObstacle(2);
        verify(mockedTrail, times(3)).manageObstacle(3);
    }

}