package creatures.feline;

public class Lion extends Feline {
    Lion () {
        maxHungerValue = 250;
        maxLive = 150;
        live = (int) (Math.random()*maxLive);
        hungValue = (int) (Math.random()*maxHungerValue);
        status = status.upStatus(this.live, this.maxLive);
        hunger = hunger.upHunger(this.hungValue, this.maxHungerValue);
    }
}
