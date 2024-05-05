package day09_switchStatement_stringManipulations;

public class C08_substring { public static void main(String[] args) {

        /*
            Sadece bu method icin degil, Java'nin genelinde
            baslangic index'leri inclusive(dahil)
            bitis index'leri exclusive(haric)'dir.
         */

    String str = "Java guzeldir";

    System.out.println(str.substring(5, 8)); // guz

    // 5.index dahil basla, 8.index haric olarak aradaki karakterler

    // 5.index'den basla  (8-5) adet karakter yaz  // guz


    //bastan baslayıp, sondan 4 karakter haric yazdirin

    System.out.println( str.substring(0, str.length()-4));

   // System.out.println(str.substring(6,4)); //StringIndexOutOfBoundsException

    //baslangi ve bitis index' i ayni olursa

    System.out.println(str.substring(5,5)); //hiclik yazdirir


    //eger baslangic ve bitis indexleri arasinda bir fark olursa
    //baslangic index indeki karakteri verir
    //yani charAt() ile ayni islevi yapar
    System.out.println(str.substring(0,1)); //j
    System.out.println(str.substring(3,4));  //a


    //aralarındaki fark, charAt() bize char döndürdügünden,
    //sonrasinda String methodaları kullanamayiz ama
    //substring() ile tiüm
    //str.charAt(3).toUppercase()
    str.substring(3,4).toUpperCase();


}
}
