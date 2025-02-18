// single program with single class

class Test extends Thread{
    @Override
    public void run()
    {
        int i =1;
        while(true)
        {
            System.out.println(i+"Hello");
            i++;
        }
    }
}


public class MultiThreadingHavingSingleClases {
    public static void main(String[] args) {
        Thread t = new Thread();
        t.start();
        int i = 1;
        while(true){
            System.out.println(i+"World");
            i++;
        }
    }
    
}
