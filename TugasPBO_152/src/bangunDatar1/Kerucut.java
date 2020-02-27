package bangunDatar1;

public class Kerucut extends Lingkaran{
    float volume_k;
    private float t;
    private float r;

    @Override
    public String Cetak2() {
        return "Volume kerucut : ";
    }

    void VolumeKerucut(float r,float t) {
        this.r = r;
        this.t = t;
        volume_k = getLuasLingkaran(r) * t / 3;
    }

    public float NilaiVolumeKerucut() {
        return volume_k;
    }

    public float get_r() {
        return r;
    }

    public float get_t() {
        return t;
    }
}
