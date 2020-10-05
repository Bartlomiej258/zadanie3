public class Sklep {
    public static void main(String[] args) {
        Produkty produkt1 = new Produkty();
        produkt1.nazwa = "Mleko";
        produkt1.producent = "Mlekowita";
        produkt1.cena = 2.5;

        Produkty produkt2 = new Produkty();
        produkt2.nazwa = "Czekolada";
        produkt2.producent = "Wedel";
        produkt2.cena = 2.19;

        System.out.println(produkt1.nazwa + " " + produkt1.producent + " " + produkt1.cena + "zł");
        System.out.println(produkt2.nazwa + " " + produkt2.producent + " " + produkt2.cena + "zł");
    }
}
