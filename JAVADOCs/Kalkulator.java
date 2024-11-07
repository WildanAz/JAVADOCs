/**
 * Kelas Kalkulator menyediakan operasi aritmatika dasar.
 * Ini mencakup metode untuk penjumlahan, pengurangan, perkalian, dan pembagian.
 * <p>
 * Contoh penggunaan:
 * <pre>
 *     Kalkulator kalkulator = new Kalkulator();
 *     int hasil = kalkulator.tambah(5, 3);
 * </pre>
 * </p>
 */
public class Kalkulator {

    /**
     * Menambahkan dua angka bulat dan mengembalikan hasilnya.
     *
     * @param angkaPertama angka pertama
     * @param angkaKedua angka kedua
     * @return hasil penjumlahan dari angkaPertama dan angkaKedua
     */
    public int tambah(int angkaPertama, int angkaKedua) {
        return angkaPertama + angkaKedua;
    }

    /**
     * Mengurangi angka kedua dari angka pertama dan mengembalikan hasilnya.
     *
     * @param angkaPertama angka pertama
     * @param angkaKedua angka kedua
     * @return hasil pengurangan antara angkaPertama dan angkaKedua
     */
    public int kurang(int angkaPertama, int angkaKedua) {
        return angkaPertama - angkaKedua;
    }

    /**
     * Mengalikan dua angka bulat dan mengembalikan hasilnya.
     *
     * @param angkaPertama angka pertama
     * @param angkaKedua angka kedua
     * @return hasil perkalian antara angkaPertama dan angkaKedua
     */
    public int kali(int angkaPertama, int angkaKedua) {
        return angkaPertama * angkaKedua;
    }

    /**
     * Membagi angka pertama dengan angka kedua dan mengembalikan hasilnya.
     * Akan melemparkan ArithmeticException jika angka kedua adalah 0.
     *
     * @param angkaPertama angka pertama
     * @param angkaKedua angka kedua (pembagi)
     * @return hasil pembagian antara angkaPertama dan angkaKedua
     * @throws ArithmeticException jika angkaKedua adalah 0
     */
    public int bagi(int angkaPertama, int angkaKedua) {
        if (angkaKedua == 0) {
            throw new ArithmeticException("Tidak dapat membagi dengan nol");
        }
        return angkaPertama / angkaKedua;
    }
}
