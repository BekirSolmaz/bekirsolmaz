package day08_ternary_switchStatements;

public class C04_NestedTernary {
    public static void main(String[] args) {
        /*
        0 den fazla sonuc olasiligi ioan gorevlerde
        ternary pek tercih edilmez

         */

        //verilen sayi icin asagidaki 3 durumdan uygun olani yazdirin
        // - sayi pozitif
        //-sayi negatif
        //- 0 pozitif veya negatif degildir.

        int sayi = 0;
        if (sayi > 0){
            System.out.println("Sayi pozitifdir");
        } else if (sayi<0) {
            System.out.println("Sayi negatifit");

        }else {
            System.out.println("o pozitif veya negatif degildir");
        }

        System.out.println( sayi>0 ? "Sayi pozitifdir" : "Sayi 0 veya negatif olabilir "  );


        System.out.println(sayi>10 ? "Sayi pozitif" : sayi ==0 ?"0 veya pzoitif veya negati degildir " : "SAyi negatif");


    }
}
