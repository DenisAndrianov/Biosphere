package properties;

public enum Hunger {EXHAUSTION, HUNGRY, NOTHUNGRY, FULL, OVERFULL, UPDATE;

    public Hunger upHunger (int hunger, int maxHunger)    {
        Hunger hung = UPDATE;
        if (hunger == 0)  {
            hung = EXHAUSTION;
        }   else    if (hunger <= 0.25*maxHunger)   {
            hung = HUNGRY;
        }      else    if (hunger <= 0.5*maxHunger)   {
            hung = NOTHUNGRY;
        }      else     if (hunger <= 0.75*maxHunger)   {
            hung = FULL;
        }      else     if (hunger <= maxHunger)   {
            hung = OVERFULL;
        }      else     {
            System.out.println ("Hunger error: cant update hunger status");
        }
        return hung;
    }
}
