//@override


// class Parent
// {
//      public void display()
//      {

//      }
// }
// class Child extends Parent
// {
//     @Override
//     public void display()
//     {

//     }
// }

//@Depreceted
// class OldClass
// {
//     public void display()
//     {
//         System.out.println("Hello");
//     }
//     @Deprecated
//     public void show()
//     {
//         System.out.println("hii");
//     }
// }

// Safevarags
// method must be final and private 
// class My<T>
// {
//     @SafeVarargs
//     private void show(T...arg)
//     {
//         for(T x:arg)
//         System.out.println(x);
//     }
// }

@FunctionalInterface
interface My{
    public void show();
    // public int add(int x, int y);
}





public class AnnoDemo {
    // @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        // OldClass  c = new OldClass();
        // c.show();
        
        
    }
    
}
