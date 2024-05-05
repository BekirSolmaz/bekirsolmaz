package day04_wrapperClass_MatematikselIslemler;

public class C09_Pre_Post_Increment {
    public static void main(String[] args) {

        //java sayii++ ve sayi-- islemlerine ozel olarak
        // ++sayi ve --sayi seklinde yazilabilme ozelligi vermistir
        // sayi++ ve ++sayi sonuc olarak ayni islemi yapar
        // aralarindaki fark islemin yapildigi satırda, ikinci bir islem olursa ortaya cıkar

        int sayi = 20;
        sayi++;

        // bir sonraki satırda yazdirirsak
        System.out.println(sayi); //21


        int a=20;
        ++a;
        System.out.println(a); //21


        int b =20;
        System.out.println("b :" + b++); // b=20

        int c = 20;
        System.out.println("c : " +  ++c); // c=21
        //islemin yapildigi satırdan sonra aralarinda hiçbir fark yoktur
        //ikiside variable lari 1 arttirdi

        System.out.println("b : " +  b + ",c :" + c); //b:21 c:21


        int d = 10;

        int e = ++d;

        System.out.println("d : " +d+ ",e:"+e);

        int f = 20;
        int g = f++;
        System.out.println("f:"+f+",g:"+g);

        double sayi1 = 18.934;

        int sayi2 = (int)sayi1;



        System.out.println(sayi2);


        int num1 = 12;

        int num2 = 15;

        num1*=2;

        num2/=3;

        System.out.println(num1 + num2);

        int num = 12;

        num--;

        num--;

        num--;

        System.out.println(num);






    }
}
