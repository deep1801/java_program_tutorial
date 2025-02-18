interface Test{
    public void meth1();
    public void meth2();
}
class My implements Test{
    @Override
    public void meth1(){
        System.out.println("interface of meth1");
    }
    public void meth2(){
        System.out.println("interface meth2");
    }
    // public void meth3(){
    //     System.out.println("meth3");
    // } // it will not be implemented because its not the part of interface its part of sub class
}



public class Interface {
    public static void main(String[] args) {
        Test t = new My();
        t.meth1();
        t.meth2();
    }
    
}
