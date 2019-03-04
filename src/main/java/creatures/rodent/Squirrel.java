package creatures.rodent;

public class Squirrel extends Rodent {
    Squirrel () {
        maxHungerValue = 40;
        maxLive = 30;
        live = (int) (Math.random()*maxLive);
        hungValue = (int) (Math.random()*maxHungerValue);
        status = status.upStatus(this.live, this.maxLive);
        hunger = hunger.upHunger(this.hungValue, this.maxHungerValue);
    }
}
