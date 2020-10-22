import day01.*;
public class Test {
    public static void main(String[] args) {
        testFenshu2();
    }
    public static void testFenshu1()
    {
        fenshu a=new fenshu(2,-3);
        fenshu b=new fenshu(-5,3);
        fenshu c=new fenshu();
        c=c.add(a,b);
        c.speak();
        c=c.dec(a,b);
        c.speak();
        c=c.chengfa(a,b);
        c.speak();
        c=c.chufa(a,b);
        c.speak();
    }
    public static void testFenshu2()
    {
        fenshu a=new fenshu(10,-30);
        fenshu b=new fenshu(5,40);
        fenshu c=new fenshu();
        c=c.add(a,b);
        c.speak();
        c=c.dec(a,b);
        c.speak();
        c=c.chengfa(a,b);
        c.speak();
        c=c.chufa(a,b);
        c.speak();
    }
    public static void testTV()
    {
        TV tv=new TV(10,10);
        System.out.println("当前音量为"+TV.getVolume());
        System.out.println("当前频道为"+tv.getChannel());
        TV.setVolume(20);
        System.out.println("当前电视是否开启"+TV.isButton());
        TV.changeButton();//默认为关
        System.out.println("当前电视是否开启"+TV.isButton());
        System.out.println("当前音量为"+TV.getVolume());
        tv.setChannel(12);
        System.out.println("当前频道为"+tv.getChannel());
        tv.addChannel(2);
        System.out.println("当前频道为"+tv.getChannel());
        tv.decChannel(4);
        System.out.println("当前频道为"+tv.getChannel());
    }
}
