class Variabel {
    float panjang = 5;
    float lebar = 2;
    float tinggi = 4;
    float berat = 1;
}

class HitunganOngkir extends Variabel{
    public static float Ongkir (){
        Variabel variabel = new Variabel();
        float ongkosKirim;
        float volumeBarang = variabel.panjang * variabel.lebar * variabel.tinggi;
        float cbm = volumeBarang/4000;
        float beratBarang = variabel.berat;
        if (volumeBarang <= 50 && beratBarang <= 1){
            ongkosKirim = 5000;
        } else if (cbm < beratBarang) {
            ongkosKirim = beratBarang * 5000;
        } else {
            ongkosKirim = cbm * 5000;
        }
        return ongkosKirim;
    }
    }

public class OngkosKirim {
    public static void main(String[] args) {
        HitunganOngkir hitunganOngkir = new HitunganOngkir();
        System.out.println("Ongkos Kirim = "+HitunganOngkir.Ongkir());
    }
}

