package creatures.rodent;

public class Mouse extends Rodent {
    Mouse ()    {
        maxHungerValue = 20;
        maxLive = 12;
        live = (int) (Math.random()*maxLive);
        hungValue = (int) (Math.random()*maxHungerValue);
        status = status.upStatus(this.live, this.maxLive);
        hunger = hunger.upHunger(this.hungValue, this.maxHungerValue);
    }
}
