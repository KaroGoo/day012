package day01;
public class TV {
    public static int volume;
    static boolean button=false;
    public int channel;

    public TV(int channel) {
        this.channel = channel;
    }

    public TV(int channel,int volume) {
        this(channel);
        this.volume=volume;
    }

    public static int addVolume(int add){
        volume+=add;
        return volume;
    }

    public static int declineVolume(int dec)
    {
        volume-=dec;
        return volume;
    }
    public static int getVolume() {
        return volume;
    }

    public static void setVolume(int volume) {
        TV.volume = volume;
    }

    public static boolean isButton() {
        return button;
    }

    public static void changeButton() {
        TV.button=!TV.button;
    }

    public int getChannel() {
        return channel;
    }

    public void decChannel(int dec) {
        channel += dec;
    }
    public void addChannel(int add) {
        channel -= add;
    }
    public void setChannel(int channel) {
        this.channel = channel;
    }
}
