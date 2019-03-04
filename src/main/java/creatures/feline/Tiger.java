package creatures.feline;

public class Tiger extends Feline {
    public Tiger()    {
        maxHungerValue = 250;
        maxLive = 150;
        live = (int) (Math.random()*maxLive);
        hungValue = (int) (Math.random()*maxHungerValue);
        status = status.upStatus(this.live, this.maxLive);
        hunger = hunger.upHunger(this.hungValue, this.maxHungerValue);
    }
}
