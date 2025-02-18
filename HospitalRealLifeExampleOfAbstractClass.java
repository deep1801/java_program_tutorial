 abstract class Hospital{
    Hospital(){
        System.out.println("This is the  main hospital from you can take the name for making your own hospital");
    }
    abstract public void emmergency();
    abstract public void appoinment();
    abstract public void admit();
    abstract public void billing();

}
class MyHospital extends Hospital{
    @Override
    public void emmergency(){
        System.out.println("emmergency availble");
    }
    @Override
    public void appoinment(){
        System.out.println("appointment is neccesary");
    }
    @Override
    public void admit(){
        System.out.println("admit facilities are here");
    }
    @Override
    public void billing(){
        System.out.println("billing is availble here in offline and online both mode");
    }
}

public class HospitalRealLifeExampleOfAbstractClass {
    public static void main(String[] args) {
        Hospital h = new MyHospital();
        h.admit();
        h.appoinment();
        h.emmergency();
        h.billing();
    }
    
}
