class CoffeMachine{
    private float coffeqty;
    private float milkqty;
    private float waterqty;
    private float sugarqty;

    static private CoffeMachine My = null;
    private CoffeMachine(){
        coffeqty = 1;
        milkqty = 1;
        waterqty=1;
        sugarqty = 1;
    }
    public void filwater(float qty)
    {
        waterqty = qty;
    }
    public void fillsugar(float qty)
    {
        sugarqty = qty;
    }
    public float getCoffe()
    {
        return 0.15f;
    }
    static CoffeMachine getInstance()
    {
        if (My == null)
        My= new CoffeMachine();
        return  My;
    }
}




public class SingletonClass {
    public static void main(String[] args) {
        CoffeMachine m1 = CoffeMachine.getInstance();
        CoffeMachine m2 = CoffeMachine.getInstance();
        CoffeMachine m3 = CoffeMachine.getInstance();
        System.out.println(m1+""+m2+""+m3);
        if(m1==m2 && m1==m3)
        System.out.println("same");

    }
    
}
