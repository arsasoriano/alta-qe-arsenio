class InputVolume {
    int sisiKubus = 10;
    int[] balok = {10 , 6 , 3};
    int[] tabung = {7 , 10};
}

class Volume extends InputVolume {
    InputVolume inputVolume = new InputVolume();
    int volumeKubus = inputVolume.sisiKubus * inputVolume.sisiKubus * inputVolume.sisiKubus;
    int volumeBalok = inputVolume.balok[0] * inputVolume.balok[1] * inputVolume.balok[2];
    int volumeTabung = ((inputVolume.tabung[0] * inputVolume.tabung[0]) * inputVolume.tabung[1]) * 22/7;
}

public class MenghitungVolume {
    public static void main(String[] args) {
        Volume volume = new Volume();
        System.out.println("Volume");
        System.out.println("Kubus = "+volume.volumeKubus);
        System.out.println("Balok = "+volume.volumeBalok);
        System.out.println("Tabung = "+volume.volumeTabung);
    }
}
