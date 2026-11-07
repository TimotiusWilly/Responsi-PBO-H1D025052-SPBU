public class Pertalite extends BBM implements CetakStruk, Diskon {

    public Pertalite(int stok, int harga) {
        super("Pertalite", stok, harga);
    }

    @Override
    public void infoBBM() {
        super.infoBBM();
        System.out.println("Kategori: Subsidi");
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
    public void beriDiskon() {
        setHarga(getHarga() - 1000);
        System.out.println("Diskon berhasil. Harga baru: Rp" + getHarga());
    }

    @Override
    public void cetakStruk() {
        System.out.println("Struk: Pembelian " + getNama() + " di " + NAMA_SPBU);
    }
}