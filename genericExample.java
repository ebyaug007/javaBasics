
class Container<T>
{
    T var;
    public T getter()
    {
        return var;
    }
    public void setter(T var)
    {
        this.var = var;
    }
} 

class genericExample {
    public static void main(String[] args)
    {
        Container<Integer> con = new Container<Integer>();
        con.setter(12);
        System.out.println(con.getter());
    }

}