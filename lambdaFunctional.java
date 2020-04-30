@FunctionalInterface
interface showHello{
    public void show();
}
public class lambdaFunctional {

    public static void main(String[] args) {
        showHello sh = ()-> System.out.println("Print Show");
        sh.show();

         }

}