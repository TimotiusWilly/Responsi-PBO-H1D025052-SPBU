public class Main {
    public static void main(String[] args) {
        Pertalite pertalite = new Pertalite(50, 10000);
        Pertamax pertamax = new Pertamax(100, 13000);

        pertalite.infoBBM();
        pertamax.infoBBM();

        int total = pertalite.hitungTotal(5);
        System.out.println("Total harga 5L: Rp" + total);

        pertalite.isiBensin(20);
        pertalite.isiBensin(40);

        pertalite.beriDiskon();

        CetakStruk struk = new Pertalite(30, 9000);
        struk.cetakStruk();
    }
}