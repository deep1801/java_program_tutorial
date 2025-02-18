class Outer{
    int x = 10;
    class Inner{
        int y =20;
        void InnerDisplay(){
            System.out.println(x);
            System.out.println(y);
        }
    }
    void OuterDsplay(){
        Inner i = new Inner();
        i.InnerDisplay();
        System.out.println(i.y);
    }
}



public class NestedInnerClass {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.OuterDsplay();
        Outer.Inner i = new Outer().new Inner();
    }
    
}
