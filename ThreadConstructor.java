class MyThread extends Thread{
    public MyThread(String name) //  paramertrised constructor
    {
        super(name);
        setPriority(MIN_PRIORITY+2); // this is how we set our own priorty here.
    }
    



public class ThreadConstructor {
    public static void main(String[] args) {
        MyThread m = new MyThread("mythread 1");
        System.out.println( "ID"+m.getId());
        System.out.println("Name"+m.getName());
        System.out.println( "Priorty"+m.getPriority());
        m.start();
        
        System.out.println( "State"+m.getState());
        System.out.println(m.isAlive());
    }
    
}
}