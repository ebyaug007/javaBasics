
interface Human
{
    //by default methods will be public abstract
    void show();
}
class Men implements Human
{
    @Override
    public void show() {
        System.out.println("Men");
    }
}
class Women implements Human
{
    @Override
    public void show(){
        System.out.println("Women");
    }
}
class interfaceExample{

    public static void main(String[] args) {
        Men m = new Men();
        m.show();
        Women w = new Women();
        w.show();
    }
    
}