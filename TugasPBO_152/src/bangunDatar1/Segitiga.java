package bangunDatar1;


public class Segitiga {
    float luas, a, b;

    public String Cetak(){
        return "Luas segitiga : ";
    }

    public void NilaiSegitiga(float a, float b){
        this.a = a;
        this.b = b;
        luas = a*b/2;
    }

   private float HitungLuas(float a, float b) {
        return a*b/2;
    }

    public float getLuassegitiga(float a, float b) {
        return HitungLuas(a,b);
    }

}
