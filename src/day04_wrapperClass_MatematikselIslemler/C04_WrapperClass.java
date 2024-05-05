package day04_wrapperClass_MatematikselIslemler;

import java.sql.SQLOutput;

public class C04_WrapperClass {
    public static void main(String[] args) {
        //String olarak verilen iki tam sayiyi toplayin

        String fiyatStr1 = "23";
        String fiyatstr2 = "45";

        System.out.println(fiyatStr1+fiyatstr2); //2345

        //toplamayı yapab,lmek için önce String olarak verilen fiyatları
        //Integer'a çevirmeliyiz

        System.out.println(Integer.parseInt(fiyatStr1) + Integer.parseInt(fiyatstr2));

        String fiyatStr3 = "23,56";
        String fiyatStr4 = "56,56";

        System.out.println(Double.parseDouble(fiyatStr3) + Double.parseDouble(fiyatStr4));


    }
}
