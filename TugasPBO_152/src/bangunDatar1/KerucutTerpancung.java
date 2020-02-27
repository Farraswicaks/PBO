package bangunDatar1;

public class KerucutTerpancung extends Kerucut {
    float volume;

    void VolumeKerucut(float r,float t) {
        volume = (float) (3.14*get_t()/3*(Math.pow(get_r(),2)*(get_r()*r)*(Math.pow(r,2))));
    }

    public float NilaiVolumeKerucut() {
        return volume;
    }
}
