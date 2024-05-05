package day08_ternary_switchStatements;

public class C02_TernaryOperatoru {
    public static void main(String[] args) {

        //verilen bir tam sayinin cift sayi veya tek sayi oldugunu yazdirin

        int sayi = 23;
        if ( sayi % 2 == 0){
            System.out.println("Sayi çift");
        }else {
            System.out.println("Sayi tek");
        }

        //ternary operatoru //ıf else ile yapilabilecek BASit işlemler için kullanilan
        //alternatif bir kod blogudur

        System.out.println( sayi % 2 == 0 ? "Sayi çift" : " sayi tek"  );

        //verilen sayi 0 dan buyukse pozitif, sıfırdan buyuk degilse "pzoitif degil" yazdirin

        if(sayi > 0){
            System.out.println("pozitif");
        }else{
            System.out.println("pozitif degil");
        }

        System.out.println(sayi%2 > 0 ? "Sayi pozitif" : "SAyi pozitif degil"  ); //bu işlem turnery oluyor soru işareti
        // ve iki  okta onemli


        //sayi 10 dan buyukse sayinin degerini 2 azaltın
        //sayi 10 dan buyuk degilse sayinin degerini 5 artırın

        if (sayi>10){
            sayi -= 2;
        }else {
            sayi +=5;
        }

        System.out.println( "if ile sayinin yeni degeri : " + sayi);


        sayi = sayi > 10 ?sayi-2 : sayi+5 ;  //atama  yaptik
        System.out.println( "ternary ile sayinin yeni degeri : " + sayi);

        //ternary operatoru bir sonuc urettigi icin
        //bu sonuc ya yazdirilmali
        //ya da bir variable atanmalidir.


    }
}
