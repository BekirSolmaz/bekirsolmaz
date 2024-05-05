package day06_IfElseStatements;

public class C01_MantiksalOperatorler {
    public static void main(String[] args) {
        // &&  operatoru mukemmeliyetcidir
        // tum sartlar true ise sonuc true, sartlardan bir tanesi bile false ise sonuc false' dur

        int a = 5;
        int b = 3;
        int c = 7;


        System.out.println( 2*a >= b+c  && 3*b != a+c && b+5 < a*c);  // hepsi true oldugu icin true


        // OR (dikine çizgi || )  operatoru iyimserdir.
        // tum sartlar false ise sonuç false
        //sartlardan bir tanesi bile true ise sonuc true
    }
}
