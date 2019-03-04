package creatures.rodent;

public class Rabbit extends Rodent {
    Rabbit ()   {
        maxHungerValue = 50;
        maxLive = 60;
        live = (int) (Math.random()*maxLive);
        hungValue = (int) (Math.random()*maxHungerValue);
        status = status.upStatus(this.live, this.maxLive);
        hunger = hunger.upHunger(this.hungValue, this.maxHungerValue);
    }
}
