abstract class onec
{
    public void showone()
    {
        System.out.println("Showone");
    }
}
abstract class twoc
{
    public abstract void showtwo();
}
class ab extends onec
{
    public void showone()
    {
        System.out.println("in a");
    }
}
class b extends twoc
{
    public void showtwo()
    {
        System.out.println("in b");
    }
}
class abstractExample
{
    public static void main(String[] args) {
        ab obj1= new ab();
        b obj2 = new b();
        obj1.showone();
        obj2.showtwo();
        onec obj3 = new ab();
       
    }
}