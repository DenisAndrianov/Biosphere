package creatures.rodent;

public class Rat extends Rodent {
    Rat ()  {
        maxHungerValue = 25;
        maxLive = 15;
        live = (int) (Math.random()*maxLive);
        hungValue = (int) (Math.random()*maxHungerValue);
        status = status.upStatus(this.live, this.maxLive);
        hunger = hunger.upHunger(this.hungValue, this.maxHungerValue);
    }
}
