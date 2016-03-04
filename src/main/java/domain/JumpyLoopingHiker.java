package domain;

/**
 *
 * Especific type of Hiker. See its @hike method documentation to better understanding on how it does interact with the obstacles of a given trail.
 *
 * */
public class JumpyLoopingHiker {


    /**
     * Given a trail with N objects, this hiker does the trail N times.
     * Every time he does the trail he interacts with the obstacles which are multiple of its current iteration.
     * That is:
     *      The first time he does the trail he interacts with all the obstacles.
     *      The second time he does the trail he interacts with obstacle #2, #4, #6,...
     *      The third time he does the trail he interacts with obstacle #3, #6, #9,...
     *      ... and so on
     *      @param trail the trail with obstacles to interact with. Notice that this is a reference, the status of the obstacles of the trail may vary.
     */
    public static Trail hike(Trail trail){
        int trailSize = trail.getSize();
        for(int trailIteration = 1; trailIteration <= trailSize; trailIteration++){
            for(int obstacleIteration = trailIteration; obstacleIteration <= trailSize; obstacleIteration += trailIteration){
                // Minus one as the index is 0 based and the iterations are 1 based
                trail.interactWithObstacleAt(obstacleIteration - 1);
            }
        }
        return trail;
    }

}
