class MyData{
     synchronized void Display(String str)
    {
        for(int i =0;i<str.length(); i++)
        {
            System.out.print(str.charAt(i));
            try{
                Thread.sleep(100);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }

        }
    }
}
class MyThread1 extends Thread{
    MyData d;
    public MyThread1(MyData d)
    {
        this.d = d;
       
    }
    public void run()
    {
        d.Display("Hello world");
    }

}
class MyThread2 extends Thread{
    MyData d;
    public MyThread2(MyData d)
    {
        this.d = d;
       
    }
    public void run()
    {
        d.Display("welcome All");
    }

}


public class SyncDemo {  
    public static void main(String[] args) {
        MyData d = new MyData();
        MyThread1 t1 =  new MyThread1(d);
        MyThread2 t2 = new MyThread2(d);
        t1.start();
        t2.start();
        
    }
   

    
}
