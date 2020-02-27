

package bangunDatar1;

public class Persegi {
    protected double sisi;

    public double getSisi(){
        return sisi;
    }
    public void setSisi(double sisi){
        this.sisi = sisi;
    }

    public double Luas(){
        return this.sisi * this.sisi;
    }

//    public double Luas(double sisi){
//        return sisi*sisi;
//    }

    public double Keliling() {
        return 4*sisi;
    }
}
