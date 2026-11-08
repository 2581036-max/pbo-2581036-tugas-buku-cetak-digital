import java.util.Locale;

public class Buku {
    private String judul;
    private String penulis;
    private int harga;

    public Buku(String judul, String penulis, int harga) {
        this.judul = judul;
        this.penulis = penulis;
        this.harga = harga;
    }

    public int hargaAkhir() {
        return harga;
    }

    public void tampilkanInfo() {
        System.out.println(judul + " (" + penulis + ")");
        System.out.println(String.format("  %-11s : %s", "Harga", formatRupiah(harga)));
    }

    protected static String formatRupiah(int angka) {
        // 120000 -> Rp120.000
        return "Rp" + String.format(Locale.US, "%,d", angka).replace(',', '.');
    }
}