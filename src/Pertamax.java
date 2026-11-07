public class Pertamax extends BBM implements CetakStruk {

    public Pertamax(int stok, int harga) {
        super("Pertamax", stok, harga);
    }

    @Override
    public void isiBensin(int liter) {
        if (liter <= getStok()) {
            setStok(getStok() - liter);
            System.out.println("Pengisian berhasil: " + liter + "L. Sisa stok: " + getStok() + "L");
        } else {
            System.out.println("Pengisian gagal. Stok tersisa: " + getStok() + "L");
        }
    }

    @Override
    public void cetakStruk() {
        System.out.println("Struk: Pembelian " + getNama() + " di " + NAMA_SPBU);
    }
}