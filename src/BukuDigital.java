public class BukuDigital extends Buku {
    private double ukuranMB;

    public BukuDigital(String judul, String penulis, int harga, double ukuranMB) {
        super(judul, penulis, harga);
        this.ukuranMB = ukuranMB;
    }

    // Diskon 20% -> bayar 80%. Kalikan dulu, baru bagi (hindari pembagian int = 0)
    @Override
    public int hargaAkhir() {
        return super.hargaAkhir() * 80 / 100;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println(String.format("  %-11s : %s MB", "Ukuran", ukuranMB));
        System.out.println(String.format("  %-11s : %s (diskon 20%%)", "Harga akhir", formatRupiah(hargaAkhir())));
    }
}