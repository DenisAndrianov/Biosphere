package creatures.canine;

public class Fox extends Canine {
    Fox ()  {
        maxHungerValue = 250;
        maxLive = 150;
        live = (int) (Math.random()*maxLive);
        hungValue = (int) (Math.random()*maxHungerValue);
        status = status.upStatus(this.live, this.maxLive);
        hunger = hunger.upHunger(this.hungValue, this.maxHungerValue);
    }
}
