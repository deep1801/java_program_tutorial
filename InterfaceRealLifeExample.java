class phone{
    public void call(){
        System.out.println("you can call");
    }
    public void sms(){
        System.out.println("you can sms");
    }
}
interface ICamera
{
    void click();
    void record();
}
interface IMusicPlayer
{
    void play();
    void stop();
}
class Smartphone extends phone implements ICamera, IMusicPlayer
{
    public void videocall(){
        System.out.println("you can  video call easily");
    }
    public void click(){
        System.out.println("you can click easily");
    }
    public void record(){
        System.out.println("you can record easily");
    }
    public void play(){
        System.out.println("you can play the music");
    }
    public void stop(){
        System.out.println("you can stop the music easily");
    }
}




public class InterfaceRealLifeExample {
    public static void main(String[] args) {
        // Smartphone sp= new Smartphone();
        // sp.click();
        // sp.call();
        // sp.play();
        // sp.record();
        // sp.sms();
        // sp.stop();


        // phone p = new Smartphone();
        // p.call();
        // p.sms();

        // ICamera c = new Smartphone();
        // c.click();
        // c.record();

        IMusicPlayer m = new Smartphone();
        m.play();
        m.stop();

    }
    
}
