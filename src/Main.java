import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static int skanner() {

        System.out.println("Skanuj produkt  ");

        int intVar;
        String strVar;

        Scanner in = new Scanner(System.in);
        strVar = in.nextLine();

        try {
            intVar = Integer.parseInt(strVar);
            return intVar;
        } catch (NumberFormatException e) {
            System.out.println("Invalid bar-code");
            if (strVar == null) {
                intVar = in.nextInt();
                strVar = Integer.toString(intVar);
                return intVar;
            }
            return skanner();
        }
    }

    public static void main(String[] args) {

        List<Produkt> productList = new ArrayList<>();

        productList.add(new Produkt("Wołowina", 48, 1));
        productList.add(new Produkt("Makaron", 5, 2));
        productList.add(new Produkt("Banany", 4, 3));
        productList.add(new Produkt("klocki hamulcowe", 40, 4));
        productList.add(new Produkt("grejprut", 5, 5));
        productList.add(new Produkt("Boczek", 18, 6));
        productList.add(new Produkt("kefir", 2, 7));
        productList.add(new Produkt("ser", 3, 8));
        productList.add(new Produkt("whisky", 60, 9));
        productList.add(new Produkt("chleb", 3, 10));
        productList.add(new Produkt("kiełbasa", 25, 11));

        List<Integer> shopingList = new ArrayList<>();

        int i = skanner();

        while (true) {
            if (i <= productList.size() && i > 0) {
                System.out.println("Zeskanowany produkt");
                checkProduct(productList, i);
                System.out.println("Lista zakupów wraz z kwota do zaplaty");
                addProduct(shopingList, productList, i);
            } else if (i == 0) {
                System.out.println("Koniec zakupów ");
                addProduct(shopingList, productList, i);
            } else {
                System.out.println("Product not found");
            }
            i = skanner();
        }
    }

    private static void checkProduct(List<Produkt> produktList, int i) {
        Produkt produkt = produktList.get(i - 1);
        if (Objects.equals(produkt.getBarcode(), i)) System.out.println(produkt);
    }

    public static void addProduct(List<Integer> shopingList, List<Produkt> produktList, int i) {

        int suma = 0;

        if (i == 0) {
            suma = 0;
            shopingList.clear();
        } else {
            shopingList.add(i);
            for (Integer item : shopingList) {
                int kwota = (produktList.get(item - 1).getPrice());
                suma += kwota;
                System.out.println(produktList.get(item - 1) + " do zapłaty " + suma);
            }
        }
    }
}

