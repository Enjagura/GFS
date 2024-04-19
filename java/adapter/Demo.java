package adapter;

import adapter.adapters.SquarePegAdapter;
import adapter.round.RoundHole;
import adapter.round.RoundPeg;
import adapter.square.SquarePeg;

public class Demo
{
    public static void main(String[] args)
    {
        // Zwei Objekte werden erstellt. Ein Rundes Objekt und ein rundes Loch
        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);
        // Überprüfung, ob das eine Objekt in das andere passt --> Rund passt in rund
        if (hole.fits(rpeg))
        {
            System.our.println("Rundes peg mit r=5 passt in rundes hole mit r=5");
        }

        // Zwei Objekte werden erstellt. 2 quadratische Objekte
        SquarePeg smallSpPeg = new SquarePeg(2);
        SquarePeg largeSpPeg = new SquarePeg(20);

        // hole.fits(smallSqPeg);
        // Würde nicht funktionieren, da quadratische Objekte nicht mit runden kompatibel sind.
        // Hier hilft dann der Adapter

        // Zwei Adapter werden erstellt
        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);
        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);
      
        // Überprüfung, on die quadratischen Objekte in das Loch passen
        if (hole.fits(smallSqPegAdapter)) 
        {
            System.out.println("Square peg w2 fits round hole r5.");
        }
        if (!hole.fits(largeSqPegAdapter)) 
        {
            System.out.println("Square peg w20 does not fit into round hole r5.");
        }
    }
}
