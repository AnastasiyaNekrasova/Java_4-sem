import by.belstu.it.nekrasova.TextFunction;

public class Main {

    public static void main(String[] args) {
        // TODO Add a new method
        System.out.println("Hello World!");
        TextFunction obj = new TextFunction(1);
        for (int i = 0; i < 9; i++) {
            if (i > -1 && i < 10) System.out.println(i);
        }
        obj.onCreate();
    }
}
