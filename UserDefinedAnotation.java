import java.lang.annotation.Annotation;
@interface MyAnno
{

}
@MyAnno

public class UserDefinedAnotation {
    @MyAnno

    public static void main( @MyAnno String[] args) {
         
    }
    
}
