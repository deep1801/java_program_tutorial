class WhiteBoard{
    String text;
    int numberOfStudent = 0;
    int count = 0;
    public void attendance()
    {
        numberOfStudent++;
    }
     synchronized public void write(String t)
    {
        System.out.println("Teacher is writing"+t);
        while(count!=0)
        try{
            wait();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        text =t;
        count = numberOfStudent;
        notifyAll();
    }
    synchronized public String read()
    {
        while(count ==0)
        try{
            wait();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        String t = text;
        count--;
        if(count==0)
        notify();
        return t;
    

    }
}
class Teacher extends Thread
{
    WhiteBoard wb;
    String notes[] = {"java is langauge","It is oops", "it is plateform independent",};
    public Teacher(WhiteBoard w)
    {
        wb = w;
    }
    public void run()
    {
        for(int i= 0; i<notes.length;i++)
        wb.write(notes[i]);
    }
}
class Student extends Thread
{
    String name;
    WhiteBoard wb ;
    public Student(String n, WhiteBoard w)
    {
        name = n;
        wb = w;

    }
    public void run()
    {
        String text;
        wb.attendance();
        do
        {
            text = wb.read();
            System.out.println(name+"reading"+text);
            System.out.flush();
        }while(!text.equals("end"));
    }
}



public class SCThread2 {
    public static void main(String[] args) {
        WhiteBoard wb = new WhiteBoard();
        Teacher t = new Teacher(wb);
        Student s1 = new Student("1.Deep", wb);
        Student s2 = new Student("1.Prdeep", wb);
        Student s3 = new Student("1.Deepak", wb);
        Student s4 = new Student("1.Deependra", wb);
        t.start();
        s1.start();
        s2.start();
        s3.start();
        s4.start();

    }
    
}
