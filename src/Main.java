public class Main {

    private final BoringObject bo = new BoringObject();

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println((new Main()).bo.toString());
    }
}
