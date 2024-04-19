package adapter;

import adapter.round.RoundPeg;
import adapter.square.SquarePeg;

/**
*  Der Adapter ermöglicht quadratische Objekte in runde Löcher zu setzen
**/

public class SquarePegAdapter extends RoundPeg
{
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) 
    {
        this.peg = peg;
    }

    @Override
    public double getRadius() 
    {
        double result;
        // Ausrechnen des Mindestradius, den das quadratische Objekt benötigt.
        result = (Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2));
        return result;
    }
}
