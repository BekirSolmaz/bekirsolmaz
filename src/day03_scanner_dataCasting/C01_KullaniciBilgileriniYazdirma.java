package day03_scanner_dataCasting;

import java.util.Scanner;

public class C01_KullaniciBilgileriniYazdirma {
    public static void main(String[] args) {
        // soru 3 kullanıcıdan ismini soyismin ve yasını alıp asagıdaki formatta yazınız
        //Isminiz ; John
        //Soyisminiz : Doe
        //Yasiniz : 44
        //Kaydınız basarıyla tamamlanmiştir.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen İsminizi giriniz...");
        String isim = scanner.nextLine();
        System.out.println("Lutfen soyismini giriniz...");
        String soyisim = scanner.nextLine();
        System.out.println("Lutfen yasinizi giriniz...");
        int yas = scanner.nextInt();



    }
}
