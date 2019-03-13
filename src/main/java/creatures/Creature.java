package creatures;
import properties.*;


public abstract class Creature {
    public String name;
    public Status status = Status.UPDATE;
    public Hunger hunger = Hunger.UPDATE;
    protected int live;
    protected int maxLive;
    protected int hungValue;
    protected int maxHungerValue;


}
