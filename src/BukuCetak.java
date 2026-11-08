public class BukuCetak extends Buku {
    private int beratGram;

    public BukuCetak(String judul, String penulis, int harga, int beratGram) {
        super(judul, penulis, harga);
        this.beratGram = beratGram;
    }

    // Ongkir Rp5.000 per 500 gram, sisa dibulatkan ke atas (750 gram -> 2 x 5.000)
    public int hitungOngkir() {
        int kelipatan = (beratGram + 499) / 500;
        return kelipatan * 5000;
    }

    @Override
    public int hargaAkhir() {
        return super.hargaAkhir() + hitungOngkir();
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println(String.format("  %-11s : %d gram", "Berat", beratGram));
        System.out.println(String.format("  %-11s : %s", "Ongkir", formatRupiah(hitungOngkir())));
        System.out.println(String.format("  %-11s : %s", "Harga akhir", formatRupiah(hargaAkhir())));
    }
}