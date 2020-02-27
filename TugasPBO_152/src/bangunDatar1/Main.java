package bangunDatar1;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        char y_t;
        Scanner input = new Scanner(System.in);
        float set_a, set_t, set_tps, set_r, set_ts;
        int menu;
        Segitiga segitiga = new Segitiga();
        PrismaSegitiga ps = new PrismaSegitiga();
        LimasSegitiga ls = new LimasSegitiga();
        Lingkaran lingkaran = new Lingkaran();
        Bola bola = new Bola();
        Persegi persegi = new Persegi();
        Silinder silinder = new Silinder();
        Kerucut kerucut = new Kerucut();
        Kerucut kt = new KerucutTerpancung();
        PersegiPanjang PP = new PersegiPanjang();
        Balok balok = new Balok();
        Kubus kubus = new Kubus();
        
        do {
            System.out.println("================MENU================");
            System.out.println("1. Segitiga");
            System.out.println("2. Lingkaran");
            System.out.println("3. Persegi");
            System.out.println("4. Persegi Panjang");
            System.out.println("5. Balok");
            System.out.println("6. Kubus"); 
            System.out.println("7. Exit");
            
            System.out.println("Pilih menu : ");
            menu = input.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("HITUNG LUAS SEGITIGA");
                    System.out.println("Masukkan ukuran alas  : ");
                    set_a = input.nextInt();
                    System.out.println("Masukkan ukuran tinggi segitiga : ");
                    set_t = input.nextInt();
                    segitiga.NilaiSegitiga(set_a, set_t);
                    System.out.println(segitiga.Cetak() + segitiga.getLuassegitiga(set_a, set_t));

                    System.out.println("HITUNG PRISMA DAN LIMAS SEGITIGA BERDASARKAN LUAS SEGITIGA YANG TELAH DIBUAT");
                    System.out.println("Masukkan ukuran tinggi bangun ruang : ");
                    set_tps = input.nextInt();
                    segitiga.NilaiSegitiga(set_a, set_t);
                    ps.VolumePrisma(set_a, set_t, set_tps);
                    System.out.println(ps.Cetak() + ps.NilaiVolumePrisma());
                    ls.VolumeLimas(set_a, set_t, set_tps);
                    System.out.println(ls.Cetak() + ls.VolumeLimas());
                    break;


                case 2:
                    System.out.println("Masukkan ukuran jari-jari : ");
                    set_r = input.nextInt();
                    lingkaran.NilaiLingkaran(set_r);
                    System.out.println("Luas Lingkaran : " + lingkaran.getLuasLingkaran(set_r));
                    bola.VolumeBola(set_r);
                    System.out.println("Volume Bola : " + bola.NilaiVolumeBola());
                    System.out.println("Hitung " + silinder.Cetak2());
                    System.out.println("Masukkan tinggi silinder : ");
                    set_ts = input.nextInt();
                    silinder.VolumeSilinder(set_r, set_ts);
                    System.out.println(silinder.Cetak2() + silinder.NilaiVolumeSilinder());
                    System.out.println("Hitung " + kerucut.Cetak2());
                    System.out.println("Masukkan tinggi kerucut : ");
                    set_ts = input.nextInt();
                    kerucut.VolumeKerucut(set_r, set_ts);
                    System.out.println(kerucut.Cetak2() + kerucut.NilaiVolumeKerucut());
                    System.out.println("Volume Kerucut Terpancung : ");
                    kt.VolumeKerucut(set_r, set_ts);
                    System.out.println(kt.NilaiVolumeKerucut());
                    break;
                    
                case 3:
                    //Persegi
                    persegi.setSisi(10);
                    System.out.println("==============================================================");
                    System.out.println("\t\t\t\tPERSEGI");
                    System.out.println("--------------------------------------------------------------");
                    System.out.println("Sisi\t\t: " + persegi.getSisi());
                    System.out.println("Luas\t\t: " + persegi.Luas());
                    //System.out.println("Luas Persegi : " + persegi.Luas(10)); // override
                    System.out.println("Keliling\t: " + persegi.Keliling());
                    System.out.println("==============================================================");
                   break;
                
                case 4:
                    //Persegipanjang
                     PP.setLebar(10);
                     PP.setPanjang(20);
                     System.out.println("\t\t\t\tPERSEGI PANJANG");
                     System.out.println("--------------------------------------------------------------");
                     System.out.println("Lebar\t\t: " + PP.getLebar());
                     System.out.println("Panjang\t\t: " + PP.getPanjang());
                     System.out.println("Luas\t\t: " + PP.Luas());
                     System.out.println("Keliling\t: " + PP.Keliling());
                     System.out.println("==============================================================");
                    break;
                
                case 5:
                    balok.setPanjang(500);
                    balok.setLebar(5);
                    balok.setTinggi(10);
                    System.out.println("\t\t\t\tBALOK");
                    System.out.println("--------------------------------------------------------------");
                    System.out.println("Panjang\t: " + balok.getPanjang());
                    System.out.println("Lebar\t: " + balok.getLebar());
                    System.out.println("Tinggi\t: " + balok.getTinggi());
                    System.out.println("Volume\t: " + balok.volume());
                    System.out.println("==============================================================");
                    break;
                    
                     
                case 6:
                    kubus.setSisi(20);
                    System.out.println("\t\t\t\tKUBUS");
                    System.out.println("--------------------------------------------------------------");
                    System.out.println("Sisi\t: " + kubus.getSisi());
                    System.out.println("Volume\t: " + kubus.volume());
                    System.out.println("==============================================================");
                    break;
            }
            System.out.println("Pilih menu lagi?");
            y_t = input.next().charAt(0);
        } while (y_t == 'y' || y_t == 'Y');
    }
}
