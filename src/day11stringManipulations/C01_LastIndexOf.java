package day11stringManipulations;

public class C01_LastIndexOf {
    public static void main(String[] args) {

        String str = "java cok zevkli";
        //metnin kac karakter oldugunu yazdirin

        System.out.println(str.length());  //15

        //son karakteri yazdirin
        System.out.println(str.charAt(str.length() - 1)); // i

        //str' da z harfi kullanilmis mi ?

        System.out.println(str.contains("z")); //true

        //str'da ilk k'nin index'ini yazdirin
        System.out.println(str.indexOf('k')); //7

        //str'da cok kelimesinin index'ini yazdirin
        System.out.println(str.indexOf("cok")); //5

        //str'da k'nin son kullaniminin index'ini yazdirin
        System.out.println(str.lastIndexOf("k")); // 12

        //str'in son kullanimindan bir onceki kullaniminin index'ini yazdirin
        System.out.println(str.lastIndexOf("k", 12-1));  //7

        //metin de kullanilan son "cok" kelimesinin index'ini yazdirin
        System.out.println(str.lastIndexOf("cok")); //5

        //metinde kullanilan ilk x harfini index ini yazdirin
        System.out.println(str.indexOf('x')); //olmadigi icin -1 doner

        //str dakullanilan son w harfinin indexin yazdirirn
        System.out.println(str.lastIndexOf("w")); // -1


    }
}
