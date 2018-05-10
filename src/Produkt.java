public class Produkt {

    private String name;
    private int price;
    private int barcode;

    public Produkt(String name, int price, int barcode) {
        this.name = name;
        this.price = price;
        this.barcode = barcode;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getBarcode() {
        return barcode;
    }

    @Override
    public String toString() {
        return "Produkt{" +
                "name='" + name + '\'' +
                ", price=" + price + '}';
    }
}
