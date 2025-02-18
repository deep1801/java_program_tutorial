import java.lang.reflect.*;

class My {
    private int a;
    protected int b;
    public int c;

    public My() {}
    public My(int x, int y) {}

    public void display(String s1, String s2) {}
    public int show(int x, int y) { return 0; }
}

public class ReflectDemo {
    public static void main(String[] args) {
        Class<?> c = My.class;  // Use Class<?> for better type safety
        
        // Getting and printing declared fields
        Field fields[] = c.getDeclaredFields();
        System.out.println("Fields:");
        for (Field f : fields) {
            System.out.println(f);
        }

        // Getting and printing constructors
        Constructor<?> constructors[] = c.getConstructors();
        System.out.println("\nConstructors:");
        for (Constructor<?> ct : constructors) {
            System.out.println(ct);
        }
        //getting  and printing methods
        Method meth[] = c.getMethods();
        for(Method m:meth)
        System.out.println(m);

        // getting and printing parameter
        
        Parameter param[] = meth[0].getParameters();
        for(Parameter p:param)
        {
            System.out.println(p);
        }

    }
}
