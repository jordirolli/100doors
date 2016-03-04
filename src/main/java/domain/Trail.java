package domain;

import java.util.ArrayList;
import java.util.List;

/**
 * The trail is a collection of interactable instances.
 */
public class Trail<E extends Interactable> {

    private List<E> obstacles;

    Trail (Class<E> obstacleType, int size) throws InstantiationException,IllegalAccessException{
        obstacles = new ArrayList<E>(size);
        for (E o:obstacles){
            o = obstacleType.newInstance();
        }
    }

    public void interactWithObstacleAt(int index){
        assert index <= obstacles.size();
        obstacles.get(index).interact();
    }

    public int getSize(){
        return obstacles.size();
    }

}
