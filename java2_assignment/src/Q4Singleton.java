class Singleton {
    private static Singleton single_instance = null;
    public String s;
    private Singleton() {
        s = "Welcome to Singleton class";
    }
    public static Singleton getInstance() {
        if (single_instance == null)
            single_instance = new Singleton();
        return single_instance;
    }
}
class Main {
    public static void main(String args[]) {
        Singleton x = Singleton.getInstance();
        Singleton y = Singleton.getInstance();
        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);
        System.out.println("\n");
    }
}