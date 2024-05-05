package ingilizceCalisma;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class calisma01 {
    public static void main(String[] args) {


        Map<String, String> words = new HashMap<>();
        words.put("Prepare", "Hazırlamak");
        words.put("Dice", "Zar");
        words.put("Late", "Gec");
        words.put("Act", "Rol oynamak");
        words.put("Fair", "cift");
        words.put("Puppet", "Kukla");
        words.put("Point", "Nokta");
        words.put("way", "Yon");
        words.put("State", "Eyalet");
        words.put("Safe", "guvenilir");
        words.put("Cake", "Pasta");
        words.put("Desk", "Sıra");
        words.put("Draw", "cizmek");
        words.put("sing", "sarkı soylemek");
        words.put("slide", "kaydırmak");
        words.put("knee", "diz");
        words.put("finger", "parmak");
        words.put("hide", "saklamak");
        words.put("last", "son");
        words.put("future", "gelecek");
        words.put("somebody", "birisi");
        words.put("lie", "yalan");
        words.put("plant", "bitki");
        words.put("enjoy", "zevk almak");
        words.put("cut", "kesmek");
        words.put("person", "kisi");
        words.put("fall", "dusmek");
        words.put("build", "insa etmek");
        words.put("foot", "ayak");
        words.put("ear", "kulak");
        words.put("mouth", "agız");
        words.put("arm", "kol");
        words.put("nose", "burun");
        words.put("better", "daha iyi");
        words.put("important", "onemli");
        words.put("leg", "bacak");
        words.put("education", "egitim");
        words.put("fear", "korku");
        words.put("task", "gorev");
        words.put("sleep", "uyumak");
        words.put("useful", "kullanıslı");
        words.put("oil", "yag");
        words.put("bill", "fatura");
        words.put("basic", "temel");
        words.put("daughter", "kız cocuk");
        words.put("text", "metin");
        words.put("wind", "ruzgar");
        words.put("warm", "ılık");
        words.put("heavy", "agırlık");
        words.put("yesterday", "dun");
        words.put("peace", "barıs");
        words.put("ride", "surmek");
        words.put("trust", "guven");
        words.put("farm", "ciftlik");
        words.put("crime", "suc");
        words.put("right", "dogru");
        words.put("when", "ne zaman");
        words.put("move", "hareket etmek");
        words.put("which", "hangi");
        words.put("repeat", "tekrar etmek");
        words.put("river", "nehir");
        words.put("cook", "pisirmek");
        words.put("rain", "yagmur");
        words.put("mistake", "hata");
        words.put("cry", "aglamak");
        words.put("pain", "agrı");
        words.put("path", "yol yorunge");
        words.put("lunc", "ogle yemegi");
        words.put("guess", "tahmin etmek");
        words.put("gun", "silah");
        words.put("hurt", "incitmek");
        words.put("tear", "gozyası");
        words.put("skin", "cilt");
        words.put("chain", "zincir");
        words.put("gift", "hediye");
        words.put("fat", "yag");
        words.put("sick", "hasta");
        words.put("sad", "uzgun");
        words.put("tiny", "ufacık");
        words.put("sweet", "tatlı");
        words.put("smell", "koku");
        words.put("lake", "gol");
        words.put("joke", "saka");
        words.put("hell", "cehennem");
        words.put("ill", "hasta");
        words.put("kick", "tekmelemek");
        words.put("dream", "ruya");
        words.put("fact", "gercek");
        words.put("bone", "kemik");
        words.put("breathe", "nefes almak");
        words.put("dish", "tabak");
        words.put("hunt", "avlamak");
        words.put("wing", "kanat");
        words.put("roof", "catı");
        words.put("evil", "kotu");
        words.put("wet", "ıslak");
        words.put("poem", "siir");
        words.put("iron", "demir");
        words.put("vaccine", "ası");
        words.put("mud", "camur");
        words.put("nail", "tırnak");
        words.put("handsome", "yakısıklı");
        words.put("toilet", "tuvalet");
        words.put("hungry", "ac");
        words.put("humanity", "insancıl");
        words.put("next", "sonraki");
        words.put("clever", "zeki");
        words.put("lazy", "tembel");
        words.put("mask", "maske");
        words.put("erase", "silmek");
        words.put("lung", "akciger");
        words.put("traveler", "gezgin");
        words.put("evening", "aksam");
        words.put("rent", "kira");
        words.put("wash", "yıkamak");



        // Diğer kelimeleri ekle
        Random random = new Random();
        Object[] keys = words.keySet().toArray();
        Scanner scanner = new Scanner(System.in);
        int dogruSayisi = 0;
        while (dogruSayisi < keys.length) {
            String randomWord;
            do {
                randomWord = (String) keys[random.nextInt(keys.length)];
            } while (!words.containsKey(randomWord));  // Doğru bilinenleri tekrar sorma
            System.out.println("İngilizce kelimeyi Türkçe olarak yazınız: " + randomWord);
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase(words.get(randomWord))) {
                System.out.println("Doğru!");
                dogruSayisi++;
                words.remove(randomWord);  // Doğru bilindi, listeden kaldır
            } else {
                System.out.println("Yanlış! Doğru cevap: " + words.get(randomWord));
            }
            System.out.println("Doğru: " + dogruSayisi);
        }
        scanner.close();
    }
}
