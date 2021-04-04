package adapter;

public class Main {
    public static void main(String args[])
    {
        System.out.println("main");
        Adapter adapter = new AdapterImpl();
        System.out.println(adapter.twiceOf(100f));
        System.out.println(adapter.halfOf(50f));
    }
}
