package bangunDatar1;

public class Bola extends Lingkaran{
    float volume_b;

    @Override
    public String Cetak2() {
        return "Volume bola : ";
    }

    void VolumeBola(float r) {
        volume_b = getLuasLingkaran(r)*r*4/3;
    }

    public float NilaiVolumeBola() {
        return volume_b;
    }

}
