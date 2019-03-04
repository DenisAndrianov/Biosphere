package creatures;
import properties.*;


public abstract class Creature {
    public Status status = Status.UPDATE;
    public Hunger hunger = Hunger.UPDATE;
    protected int live;
    protected int maxLive;
    protected int hungValue;
    protected int maxHungerValue;


}
