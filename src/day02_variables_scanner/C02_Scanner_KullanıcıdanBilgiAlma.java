package day02_variables_scanner;

import java.util.Scanner;

public class C02_Scanner_KullanıcıdanBilgiAlma {
    public static void main(String[] args) {
       //Kullanıcıdan ismi alıp
        //İsmi Büyük Harf yazdırın

        //Kullanıcıdan bilgi almak için 3 adıma ihtiuyaç vardır


        // 1-Bİr scanner objesi olusturmak

        Scanner scanner = new Scanner(System.in);

        //2- Kullanıcıya ne istediğimiz söylemeliyiz

        System.out.println("Lütfen isminizi giriniz...");

        // 3 - istediğimiz bilgiyi kaydedebilecegimiz,
        // uygun bir variable olusturun,
        //  olusturdugumuz scanner objesı ile uygun hazır metodu kullanıp
        // kullanıcının girdiği değeri konsoldan alıp
        //olusturdugumuz variable atayın
        // Bu görevde isim istediğimiz için String bir variable olusturduk
        // ve scanner.nextLine() kullandık
        // next() bize ilk space e kadar olan kismi verir
        //           orneğin kullanici " ALi CAn Aslan" girerse next() sadece Ali yi getirir
        //nextLine() ==== Tüm satırı alır




        String kullanıcıIsmi = scanner.nextLine();

        // 37. satırda kullanıcıdan bilgiyi alıp kod dünyasına kaydettik
        //bundan sonra bizden istenen işlemi yapabiliriz

        System.out.println("Gİrilen İsmin Büyük Harfle YAzılışı :" + kullanıcıIsmi.toUpperCase());
    }
}
