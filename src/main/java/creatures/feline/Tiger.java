package creatures.feline;

public class Tiger extends Feline {
    public Tiger(int live, int maxLive)    {
        this.live = live;
        this.maxLive = maxLive;
        status = status.upStatus(this.live,this.maxLive);
    }
}
