package properties;

public enum Status {DEAD, BAD, AVERAGE, GOOD, PERFECT, UPDATE;


    public Status upStatus (int live, int maxLive)  {
        Status status = UPDATE;
        if (live == 0)  {
            status = DEAD;
        }   else    if (live <= 0.25*maxLive)   {
            status = BAD;
        }   else if (live <= 0.5*maxLive)   {
            status = AVERAGE;
        }   else if (live <= 0.75*maxLive)  {
            status = GOOD;
        }   else if (live <= maxLive)   {
            status = PERFECT;
        }   else    {
            System.out.println ("Status error: cant update live status");
        }
        return status;
    }
}
