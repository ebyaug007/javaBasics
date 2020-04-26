class A
{
    static int var;
    public static void show()
    {
        System.out.println(var);
    }

}
class staticKeyword
{
    public static void main(String[] args)
    {
        A.var = 300;
        System.out.println(A.var);
        A.show();
    }
}