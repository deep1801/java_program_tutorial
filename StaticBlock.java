class Test{
    static {
        System.out.println("block 1");
    }
    static{
        System.out.println("block2");
    }

}
public class StaticBlock {
    
    public static void main(String[] args) {
       
        System.out.println("main method");
        Test t = new Test();
    }
  
    
}
