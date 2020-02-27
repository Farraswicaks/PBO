
package bangunDatar1;

public class Balok extends PersegiPanjang {
    protected double tinggi;

    @Override
    public double getPanjang(){
        return panjang;
    }
    @Override
    public double getLebar(){
        return lebar;
    }
    public double getTinggi(){
        return tinggi;
    }
    public void setTinggi(double tinggi){
        this.tinggi = tinggi;
    }
    public double volume(){
        return panjang*lebar*tinggi;
    }
}
