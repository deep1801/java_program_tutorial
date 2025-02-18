//program with two classes

class MyRunnable implements Runnable{
    @Override
    public void run()
    {
        int i=1;
        while(true)
        {
            System.out.println(i+ "Hello");
            i++;
        }
    }
}


public class RunnableInterface {
    public static void main(String[] args) {
        MyRunnable m  = new MyRunnable();
        Thread th = new Thread(m);
        th.start();
        int i =1;
        while(true)
        {
            System.out.println(i + "world");
            i++;
        }
    }
    
}
