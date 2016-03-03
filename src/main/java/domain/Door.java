package domain;

/**
 * The door is a specific type of obstacle which can be in two different @Status [OPENED,CLOSED]
 */
public class Door {

    public static enum Status{OPENED,CLOSED};

    /* The doors are initially closed */
    private Status state = Status.CLOSED;

    public void toggle(){
        state = (state==Status.OPENED)? Status.CLOSED : Status.OPENED;
    }

    public Status getStatus(){
        return state;
    }
}
