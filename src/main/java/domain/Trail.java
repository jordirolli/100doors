package domain;

import java.util.ArrayList;
import java.util.List;

/**
 * The trail is a collection of obstacles.
 */
public class Trail {

    // TODO : The Door type can be generic
    private List<Door> obstacles;

    Trail (int size){
        obstacles = new ArrayList<Door>(size);
        for (Door o:obstacles){
            o = new Door();
        }
    }

    // TODO : The toggle method can be encapsulated through a generic interface with single method manageObstacle()
    public void manageObstacle(int index){
        assert index <= obstacles.size();
        obstacles.get(index).toggle();
    }

    public int getSize(){
        return obstacles.size();
    }

}
