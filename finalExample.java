class one{
    final int abc;
    one(int a)
    {
        abc = a;
    }
    void setter(int a)
    {
        abc = a;
    }
}
public class finalExample {
    public static void main(String[] args)
    {
        one o = new one(112);
        System.out.println(o.abc);
    }

}