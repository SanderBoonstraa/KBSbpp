import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Product> test = new ArrayList<Product>();
//
//        ArrayList<Integer> list = new ArrayList<Integer>();
//        int
//
//
//
//        Product a = new Product("Kaas1",9);
//        Product b = new Product("Kaas2",72);
//        Product c = new Product("Kaas3",14);
//        Product d = new Product("Kaas4",23);
//        Product e = new Product("Kaas5",38);
//        Product f = new Product("Kaas6",4);
//        Product g = new Product("Kaas7",7);
//        Product h = new Product("Kaas8",52);
//        Product ia = new Product("Kaas9",93);
//        Product j = new Product("Kaas10",44);
//        Product k = new Product("Kaas11",32);
//        Product l = new Product("Kaas12",65);
//        Product m = new Product("Kaas13",78);
//        Product n = new Product("Kaas14",12);
//        Product o = new Product("Kaas15",32);
//        Product p = new Product("Kaas16",6);
//        Product q = new Product("Kaas17",43);
//        Product r = new Product("Kaas18",56);
//        Product s = new Product("Kaas19",57);
//        Product t = new Product("Kaas20",87);
//        Product u = new Product("Kaas21",76);
//        Product v = new Product("Kaas22",21);
//        Product w = new Product("Kaas23",26);
//        Product x = new Product("Kaas24",42);
//        Product y = new Product("Kaas25",63);
//        Product z = new Product("Kaas26",47);
//
//        test.add(a);
//        test.add(b);
//        test.add(c);
//        test.add(d);
//        test.add(e);
//        test.add(f);
//        test.add(g);
//        test.add(h);
//        test.add(ia);
//        test.add(j);
//        test.add(k);
//        test.add(l);
//        test.add(m);
//        test.add(n);
//        test.add(o);
//        test.add(p);
//        test.add(q);
//        test.add(r);
//        test.add(s);
//        test.add(t);
//        test.add(u);
//        test.add(v);
//        test.add(w);
//        test.add(x);
//        test.add(y);
//        test.add(z);


//        ArrayList<Product> products = ProductGenerator.generateRandomProducts(5);
//        NextFit nextFit = new NextFit(products);

        System.out.println("-----------------------------------------------------");
        ArrayList<Product> products = ProductGenerator.generateRandomProducts(10);
//        FirstFit firstFit = new FirstFit(products);
//        firstFit.startCalculation();
        FirstFitDecreasing firstFitDecreasing = new FirstFitDecreasing(products);
        firstFitDecreasing.startCalculation();

        ArrayList<Storage> boxes = firstFitDecreasing.getBoxes();
        for (Storage box : boxes) {
            System.out.println(box.toString());

        }



        /*AbstractScreen screen = new AbstractScreen();
        screen.setVisible(true);*/
    }
}
