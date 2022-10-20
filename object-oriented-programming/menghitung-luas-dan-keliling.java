class Input{
    int persegi = 4;
    int[] segitiga = {3 , 4};
    int[] persegiPanjang = {7 , 8};
}

class Luas extends Input{
    Input input = new Input();
    int luasPersegi = input.persegi * input.persegi;
    int luasSegitiga = (input.segitiga[0] * input.segitiga[1]) * 1/2;
    int luasPersegiPanjang = input.persegiPanjang[0] * input.persegiPanjang[1];
}

class Keliling extends Input{
    Input input = new Input();
    int kelilingPersegi = input.persegi * 4;
    int kelilingSegitiga = input.segitiga[0] * input.segitiga[1];
    int kellilingPersegiPanjang = (input.persegiPanjang[0] + input.persegiPanjang[1]) * 2;
}

public class MenghitungLuasDanKeliling {
    public static void main(String[] args) {
        Luas luas = new Luas();
        Keliling keliling = new Keliling();
        System.out.println("Luas");
        System.out.println("Persegi = "+luas.luasPersegi);
        System.out.println("Segitiga = "+luas.luasSegitiga);
        System.out.println("Persegi Panjang = "+luas.luasPersegiPanjang);
        System.out.println("Keliling");
        System.out.println("Persegi = "+keliling.kelilingPersegi);
        System.out.println("Segitiga = "+keliling.kelilingSegitiga);
        System.out.println("Persegi Panjang = "+keliling.kellilingPersegiPanjang);
    }
}

