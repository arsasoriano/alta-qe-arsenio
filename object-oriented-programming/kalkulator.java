class InputKalkulator{
    int[] penjumlahan = {10 , 10};
    int[] pengurangan = {15 , 4};
    int[] perkalian = {10 , 10};
    int[] pembagian = {12 , 3};
}

class Rumus extends InputKalkulator{
    InputKalkulator inputKalkulator = new InputKalkulator();
    int hasilPenjumlahan = inputKalkulator.penjumlahan[0] + inputKalkulator.penjumlahan[1];
    int hasilPengurangan = inputKalkulator.pengurangan[0] - inputKalkulator.pengurangan[1];
    int hasilPerkalian = inputKalkulator.perkalian[0] * inputKalkulator.perkalian[1];
    int hasilPembagian = inputKalkulator.pembagian[0] / inputKalkulator.pembagian [1];
}

public class Kalkulator{
    public static void main(String[] args) {
        Rumus rumus = new Rumus();
        System.out.println("Penjumlahan = "+rumus.hasilPenjumlahan);
        System.out.println("Pengurangan = "+rumus.hasilPengurangan);
        System.out.println("Perkalian = "+rumus.hasilPerkalian);
        System.out.println("Pembagian = "+rumus.hasilPembagian);
    }
}
