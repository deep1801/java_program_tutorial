class MyThread extends Thread{
    
    public void run()
    {
        int count =1;
        while(true)
        {
            System.out.println(count++ +"My Thread");
            
            
            
        }
    }
}


public class ThreadSleepPriortyMethod {
    public static void main(String[] args) {
        MyThread m = new MyThread();
        // m.setDaemon(true);
        m.start();
        int count =1;
        while(true)
        {
            System.out.println(count++ +"Main Thread");
            Thread.yield(); 
            
            
            
        }
    //     try {
            // Thread mainThread = Thread.currentThread();
            // mainThread.join(); // This call will now be caught or declared
    //     } catch (InterruptedException e) {
    //         System.out.println("Main thread interrupted: " + e);
    //     }
    // }
        
        
        
    }
       
    }
    

