package bangunDatar1;


public class PrismaSegitiga extends Segitiga {
    float volume_p;

    @Override
    public String Cetak(){
        return "Volume Prisma Segitiga = ";
    }

    void VolumePrisma(float a, float b, float tinggiprisma) {
        volume_p = getLuassegitiga(a,b)*tinggiprisma;
    }

    //overloading
    public float NilaiVolumePrisma() {
        return volume_p;
    }


}
