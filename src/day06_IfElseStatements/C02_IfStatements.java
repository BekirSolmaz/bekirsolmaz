package day06_IfElseStatements;

public class C02_IfStatements {
    public static void main(String[] args) {

        /*
           Bagimsiz if cümleleri, adından anlasılacagı gibi kodun geriye kalanından bagımsızdır
           sarta odaklanır
           sart true ise if body'si calısır
           sart false ise if body'si çalısmaz

           bagimsiz if cümleleri kod'un geriye kalanıyla ilgilenmediginden birden fazla bagimsiz if cümlesi oldugunda
           tumunun if bodysi calısabilecegi gibi hicbirinin if body'si çalışmadığı da olabilir.
         */


        int a = 30;
         int b = 41;

         //Eger a b'den buyukse " a b'den buyuk" yazdirin

        if ( a > b){
            System.out.println(  "a b'den buyuk");
        }else
            System.out.println("A B den kucuk");



        // b cift ise, " bu sayilarin carpimi cift olur" yazdirin

        if ( b % 2 == 0){
            System.out.println(" bu sayilarin carpimi cift olur");



        }else
            System.out.println("sayı tektir");



            // a 100 den buykse "İlk sayi cok buyuk" yazdirin

        if ( a>100 ){
            System.out.println("ilkk sayi cok buyuk");

        }



    }
}
