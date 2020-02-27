package bangunDatar1;

public class LimasSegitiga extends Segitiga {
    float volume_l;

    @Override
    public String Cetak(){
        return "Volume Limas Segitiga = ";
    }

    void VolumeLimas(float a, float b, float tinggilimas) {
        volume_l = getLuassegitiga(a,b)*tinggilimas/3;
    }

    public float NilaiVolumeLimas() {
        return volume_l;
    }

    //overloading
    public float VolumeLimas() {
        return volume_l;
    }

}
