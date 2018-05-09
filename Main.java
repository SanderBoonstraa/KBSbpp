public class Main {

    public static void main(String[] args) {
        Product a  = new Product("Kaas", 30);
        Product b  = new Product("Sok",46);

        Storage s = new Storage();
        s.addStorage(a);
        s.addStorage(b);

        s.getProducts();


        /*AbstractScreen screen = new AbstractScreen();
        screen.setVisible(true);*/
    }
}
