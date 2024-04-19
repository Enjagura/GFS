package bridge;

public interface Device 
{
  boolean isEnabled();

  void enable();
  void disable();
  void setVolume(int percent);
  void setChannel(int channel);
  void printStatus();
  
  int getVolume();
  int getChannel();
}
