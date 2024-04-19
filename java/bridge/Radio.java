package xyz;

public class radio implements Device
{
    private boolean on = false;
    private int volume = 30;
    private int channel = 1;

    @Override
    public boolean isEnabled()
    {
        return on;
    }

    @Override
    public boolean enable()
    {
        on = true;
    }

    @Override
    public boolean disable()
    {
        on = false;
    }

    @Override
    public boolean getVolume()
    {
        return volume;
    }

    @Override
    public boolean setVolume(int volume)
    {
        if (volume > 100)
        {
            this.volume = 100;
        } else if (volume < 0)
        {
            this.volume = 0;
        } else 
        {
            this.volume = volume;
        }
    }

    @Override
    public boolean getChannel()
    {
        return channel;
    }

    @Override
    public boolean setChannel(int channel)
    {
        this.channel = channel;
    }

    @Override
    public boolean printStatus()
    {
        System.out.println("----------------------------------");
        System.out.println("> Radio");
        System.out.println("> Status: " + (on ? "enabled" : "disabled"));
        System.out.println("> Volume: " + volume + "%");
        System.out.println("> Channel: " + channel);
        System.out.println("----------------------------------\n");
    }
}
