class Abc{
    public void show(){}
}

public class AnonymousClass {
public static void main(String[] args) {
    

    Abc obj1 = new Abc(){
        public void show()
        {
            System.out.println("Hello");
        }
    };
    obj1.show();
}

}