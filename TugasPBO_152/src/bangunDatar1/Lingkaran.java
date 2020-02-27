package bangunDatar1;

public class Lingkaran {
    float luas_lingkaran, r;

    public String Cetak2() {
        return "Luas Lingkaran : ";
    }

    public void NilaiLingkaran(float r){
        this.r = r;
        luas_lingkaran = (float) (3.14 * Math.pow(r,2));
    }

    private float HitungLuas(float r) {
        return (float) (3.14 * Math.pow(r,2));
    }

    public float getLuasLingkaran(float r) {
        return HitungLuas(r);
    }

}
