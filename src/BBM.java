public abstract class BBM {
    public static final String NAMA_SPBU = "SPBU Pertamina";

    private final String nama;
    private int stok;
    private int harga;

    public BBM(String nama, int stok, int harga) {
        this.nama = nama;
        this.stok = stok;
        this.harga = harga;
    }

    public BBM(String nama, int harga) {
        this(nama, 100, harga);
    }

    public void infoBBM() {
        System.out.println(this.nama + " | Harga: Rp" + this.harga + " | Stok: " + this.stok + "L");
    }

    public int hitungTotal(int liter) {
        return this.harga * liter;
    }

    public abstract void isiBensin(int liter);

    public String getNama() {
        return this.nama;
    }

    public int getStok() {
        return this.stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public int getHarga() {
        return this.harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
}