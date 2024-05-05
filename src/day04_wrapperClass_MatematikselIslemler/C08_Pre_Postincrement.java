package day04_wrapperClass_MatematikselIslemler;

public class C08_Pre_Postincrement {
    public static void main(String[] args) {

        int a = 20;
        //a nin degerini olusturacaginiz bir b variable ina  atayin
        //sonra a nin degerini 1 artirin

        int b = a;
        a++;
        System.out.println(" a : " + a + " , b : " + b ); // a 21 b 20

        int c = 20;
        //c nin degerini 1 artirin
        //sonra c nin degerini olusturacaginiz d variable ina atayin

        c++;
        int d =c;
        System.out.println("c : " + c +", d : " + d );

        int e = 20;
        //e nin deerini yazdirin, sonra e nin degerini 1 artirin

        System.out.println("e:" + e);  //20
        e++;  //bu satıra geldigimizde e 21 olur , amam asrtisdan once e yi yazdiridigimiz için e = 20

        int f = 20;
        //f nin degerini 1 artırın sonra f nin degerini yazdirin

        f++;
        System.out.println("f :"+ f); // bu satira geidigimizde f nin degeri 21,
        // yazdirmayi artısdan sonra yaptigimiz için f 21 yazar




    }
}
