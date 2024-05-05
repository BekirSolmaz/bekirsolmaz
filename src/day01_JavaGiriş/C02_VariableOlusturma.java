package day01_JavaGiriş;

public class C02_VariableOlusturma {
    public static void main(String[] args) {
        int sayi = 10 ;


        //javadaki eşittir işareti matematikteki eşittir işaretinden farklı çalışır
        //java eşittir işaretei görünce önce eşitliğin sağ tarafındaki degeri hesaplar
        //bulunan işlme sonucunu. sol taraftaki variable!a assign eder

        sayi = 2 * sayi ;
        System.out.println(  sayi  ); //20
        sayi = 5 + sayi ;
        System.out.println(  sayi  );


        //2 * sayi + 1 ? 5 * sayi - 7 ; VAriable expected
        //eşitliğin sol tarafında işlem olmaz, sadece ismi olmalıdır

        sayi = 5 * sayi -7 ;
        System.out.println(  sayi  );



    }
}
