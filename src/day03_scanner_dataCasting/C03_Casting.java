package day03_scanner_dataCasting;

public class C03_Casting {
    public static void main(String[] args) {



       boolean bl1 = true ;
       char chr1 = '$';
       byte byt1 = 23 ;
       int tamsayi = 20 ;
       float flt1 = 45.2f;
       double dbl = 44.1 ;
       String str = "Java Candır";




        // Bir data turundeki bir variable!a
        // baska bir data türünden deger atamaya denir

        int sayi = 20 ;
        double dbl1 = sayi ;

        System.out.println(dbl1); // 20.0


        //bazı data türlerine baska türden değer atayamassınız

        //bl1 = str;
        //bl1 = chr1;
        //bl1 = dbl1;

        //str = tamsayi;
        //str = chr1;
        //str = dbl;

        //sayi barındıran variable data türleri arsaında geçiş olabilir.
        //ancak her data turundeki değer, her data türüne atanamaz
        //1- kucuk data türündeki değer, buyuk data turundeki variable atanırsa
        //java bunu otomatik yapar (Auto Widening)
        // 2- daha geniş data türündeki degeri, daha dar kapsamlı variable'a atamak isterseniz
        //java bunu otomatik yapmaz.
        //data kayıpları veya farklı sonuçlar olabileceği için
        //sorumlulugu bizim almamızı isterler (Explicit Narrowing)
        //sorumluluğu almak için daraltmak istediğiniz değerin önüne
        //parantez iceresinde, dönüstürmek istedigimiz data turunu yazmalısınız.


        dbl = byt1; //Auto Widening
        dbl = tamsayi;
        dbl = flt1;

        flt1 = byt1;
        flt1 = tamsayi;
        //flt1 = dbl1;
        flt1 = (float) dbl1; //Explicit Narrowing



        tamsayi =byt1;
        //tamsayi = flt1;
        tamsayi = (int) flt1; //Explicit Narrowing

        //tamsayi = dbl1;
        tamsayi = (int) dbl1; //Explicit Narrowing



        //byt1 = tamsayi;
        //byt1 = flt1;




    }
}
