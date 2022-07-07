import java.util.Scanner;

public class Notcu {

    public static void main(String[] args) {

        double kalite, optimizasyon, ucret;

        Scanner puan = new Scanner(System.in);

        double iyi = 5.0;


        System.out.println(iyi +" ve üzeri değerlendirmeler iyi sayılacaktır.");

        System.out.print("Ürünün kalitesi sizce 10 üzerinden ne kadar değerlendirilmeli: ");
        kalite = puan.nextDouble();

        System.out.println("----------------------------------");

        System.out.print("Ürünün amaçlanan sistemlere olan optimizasyonu sizce 10 üzerinden ne kadar değerlendirilmeli: ");
        optimizasyon = puan.nextDouble();

        System.out.println("----------------------------------");

        System.out.print("Ürünün ücretinin uygunluğu 10 üzerinden ne kadar değerlendirilmeli: ");
        ucret = puan.nextDouble();

        System.out.println("----------------------------------");

        double UrunHesaplamasi = (ucret + kalite + optimizasyon);

        double Urun = (UrunHesaplamasi / 3);
        System.out.println("Ürününüzün puanı 10/" + Urun);

        if((Urun >= 0.0) && (Urun <= 2.0)) {

            System.out.println("Ürününüz berbat.");

        }

        if((Urun >= 2.0) && (Urun <= 5.0)) {

            System.out.println("Ürününüz kötü.");

        }

        if((Urun >= 5.0) && (Urun <= 8.0)) {

            System.out.println("Ürününüz iyi.");

        }

        if((Urun >= 8.0) && (Urun <= 10.0)) {

            System.out.println("Ürününüz gayet güzel.");

        }

        if(Urun == 10.0) {

            System.out.println("Ürününüz mükemmel.");

        }

    }

}
