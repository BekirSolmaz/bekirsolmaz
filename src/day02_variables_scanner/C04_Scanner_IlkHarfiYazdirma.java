package day02_variables_scanner;

import java.util.Scanner;

public class C04_Scanner_IlkHarfiYazdirma {
    public static void main(String[] args) {


        //Kullanıcıdan bir metin isteyip
        //metnin sadece ilk harfini büyük harf olarak yazdırın

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfeb Bir Metin Giriniz....");

        //  2 yöntemle yapacagız
        // 1 önce tüm metni alıp , sonra ilk harfi yazdıralım

        String metin = scanner.nextLine(); // kullanıcıdan metni alıp kaydettik
        System.out.println(metin.toUpperCase().charAt(0));  //kaydettiğimiz metni büyük harfe cevirip ilk karakteri aldık

        //2. yönteö olarak scanner dan sadece metnin ilk harfini alıp kaydedelım

        System.out.println("Lütfen Bİr Metin daha Gİriniz......");
        char ilkHarf = scanner.nextLine().toUpperCase().charAt(0);
        System.out.println("Ikinci metin ilk harf : " + ilkHarf );



    }
}
