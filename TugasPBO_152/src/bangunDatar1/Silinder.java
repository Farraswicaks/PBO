package bangunDatar1;

public class Silinder extends Lingkaran {
    float volume_s;

    @Override
    public String Cetak2() {
        return "Volume silinder : ";
    }

    void VolumeSilinder(float r,float t) {
        volume_s = getLuasLingkaran(r) * t;
    }

    public float NilaiVolumeSilinder() {
        return volume_s;
    }
}
