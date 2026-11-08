public class TokoBuku {
    public static void main(String[] args) {
        Buku b1 = new BukuCetak("Pemrograman Java", "John Doe", 120000, 750);
        Buku b2 = new BukuCetak("Algoritma Dasar", "Jane Smith", 95000, 400);
        Buku b3 = new BukuDigital("Belajar OOP", "Ani Wijaya", 80000, 12.5);

        System.out.println("=============== KERANJANG ===============");
        b1.tampilkanInfo();
        b2.tampilkanInfo();
        b3.tampilkanInfo();
        System.out.println("----------------------------------------");

        int total = b1.hargaAkhir() + b2.hargaAkhir() + b3.hargaAkhir();
        System.out.println(String.format("%-11s   : %s", "Total bayar", Buku.formatRupiah(total)));

        /*
         * Langkah 8 - Hasil percobaan menghapus super(...) di constructor BukuDigital:
         *
         * java: constructor Buku in class Buku cannot be applied to given types;
         *   required: String,String,int
         *   found:    no arguments
         *   reason:   actual and formal argument lists differ in length
         *
         * Penyebab: kalau super(...) tidak ditulis, Java otomatis memanggil super()
         * tanpa parameter, padahal Buku hanya punya constructor 3 parameter.
         */
    }
}