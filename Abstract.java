 abstract class Super{
    Super()
    {
        System.out.println("super consttructor");
    }
    public void meth1()
    {
        System.out.println("super meth1");
    }
    abstract public void  meth2();
}
class Sub extends Super{
    @Override
     public void meth2()
     {
        System.out.println("meth2");
    }
}



public class Abstract {
    public static void main(String[] args) {
        Super s = new Sub();
        s.meth1();
        s.meth2();
    }
    
}
