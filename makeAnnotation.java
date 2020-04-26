import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;

import java.lang.annotation.RetentionPolicy;



@Inherited
@Retention(RetentionPolicy.RUNTIME)
@interface smartphone
{
    String os();
    int ver();
}

@smartphone(os="Android",ver=7)
class nokia
{
    void show(){
    }
}

public class makeAnnotation {
    public static void main(String[] args) {
        System.out.println("nothin");
    }

}