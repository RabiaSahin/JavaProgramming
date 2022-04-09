package week11;

public class TV {

    // data fields + attributes
    public int channel; // Default channel is 1
    public int volumeLevel ; // default volume will be 1
    public boolean on ; // TV is off

    public TV(int channel, int volumeLevel, boolean on) { // three parameter constructor
        this.channel = channel;
        this.volumeLevel = volumeLevel;
        this.on = on;
    }

    public TV(){
        //  Constructor with NO parameters
        channel = 1;
        volumeLevel = 1;
        on = false;
    }

    // why  are we initializing these values without constructor by one by and don"t we use constructor?
 /*   public int channel = 1; // Default channel is 1
    public int volumeLevel = 1; // default volume will be 1
    public boolean on = false; // TV is off

    public TV(){
        //  Constructor with NO parameters
    }   */

    public void turnOn(){
        on = true;
    }
    public void turnOff(){
        on = false;
    }

    public void setChannel(int newChannel){
        if(on && newChannel >=1 && newChannel <= 120){
            channel = newChannel;
        }
    }

    public void setVolume(int newVolume){
        if(on&&newVolume>=1 && newVolume <=7){
            volumeLevel = newVolume;
        }
    }

    public void channelUp(){
        if(on&&channel<120)
            channel++;
    }
    public void channelDown(){
        if(on&&channel>1)
            channel--;
    }
    public void volumeUp(){
        if(on&&volumeLevel<7)
            volumeLevel++;
    }
    public void volumeDown(){
        if(on&&volumeLevel>1)
            volumeLevel--;
    }

    public String toString() {
        return "TV{" +
                "channel=" + channel +
                ", volumeLevel=" + volumeLevel +
                ", on=" + on +
                '}';
    }
}
