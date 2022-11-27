import java.util.Scanner;

public class VücutKitleİndeksi {

    public static void main(String[] args) {

        double kilo;
        double boy;
        double sonuc;

        Scanner sc = new Scanner(System.in);

        System.out.print("Lütfen Kilonuzu Giriniz:");
        kilo = sc.nextDouble();

        System.out.print("Lütfen Boyunuzu (Metre cinsinde) Giriniz:");
        boy = sc.nextDouble();

        sonuc = kilo / (boy * boy );

        System.out.print("Vücut Kitle İndeksiniz:" + sonuc);



    }

}
