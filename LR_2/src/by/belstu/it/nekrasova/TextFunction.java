package by.belstu.it.nekrasova;

public class TextFunction {

    private String getString() {
        return "Hello from First project";
    }
    public String getValue()
    {
        return getString();
    }

    public int test;

    public int getTest() { return test; }
    public void setTest(int test) {
        this.test = test;
    }

    public TextFunction(int test) { this.test = test; }
    public void onCreate() {
        for (int count = 0; count < 10; count++) {
            System.out.println("Counter " + count);
        }
    }
}
