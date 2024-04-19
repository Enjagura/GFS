package refactoring_guru.adapter.example.round;

/**
 *  Runde Objekte sind mit runden Löchern kompatibel
 **/

public class RoundPeg 
{
    private double radius;

    public RoundPeg() {}

    public RoundPeg(double radius) 
    {
        this.radius = radius;
    }

    public double getRadius() 
    {
        return radius;
    }
}
