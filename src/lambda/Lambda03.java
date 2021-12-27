package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambda03 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("xmehmet", "emre", "nilgun", "yildiz",
                "kaderx", "emine", "islam", "islam", "emre"));

        bykHrfTekrarsizSira(list);
        System.out.println();
        System.out.println(" ***terskarakter sayisi***");
        tersTekrarsizSiraChar(list);
        System.out.println();
        System.out.println(" *** chara gore kucukten buyuge ");
        charSiraKucuktenBuyuge(list);
        System.out.println();
        System.out.println(" *** list elemanin son harfine gore ");
        sonHarfTersSiraliElig(list);
        System.out.println();
        System.out.println(" *** cift tekrarsiz tek sira");
            ciftKareTekrarsizTersSira(list);
        System.out.println();
        harfSayiKontrol7(list);
        System.out.println();
        System.out.println("*w**");
        wBaslamaKontrol(list);
        System.out.println();
        System.out.println("***x");
        xBaslayanKontrol(list);
        karakteriEnBuyukEl(list);

    }

    //Karakter sayisi en buyuk elemani yazdiriniz.
    public static void karakteriEnBuyukEl(List<String> list){
        System.out.println(list.
                stream().
                sorted(Comparator.comparing(t -> t.toString().length()).//lenght karakter uzunluguna gore siraladi k->b
                        reversed()).//ters sirlad b->k
                        findFirst());//ilk elelmni aldi

    }

    private static void xBaslayanKontrol(List<String> list) {
        System.out.println(list.
                stream().
                anyMatch(t->t.endsWith("x"))?
                "x ile biten isim vardir gardas":
                "else durumu: x ile baslayan yo ");
    }

    private static void wBaslamaKontrol(List<String> list) {
        System.out.println(list.
                stream().
                noneMatch(t->t.startsWith("w"))?
                "w ile baslayann isim vardir gardas":
                "else durumu: w ile baslayan yo ");

    }

    private static void harfSayiKontrol7(List<String> list) {
        boolean kontrol = list.stream().allMatch(t->t.length()<=7);
        if (kontrol) {
            System.out.println("list elemanlari 7den buyuk degiil");
        }else {
            System.out.println("list elemanlari 7den buyuk");
        }
        System.out.println(kontrol);
        System.out.println(list.stream().allMatch(t->t.length()<=7)?"list elemanlari 7den buyuk degiil":"list elemanlari 7den buyuk ");
    }

    //listin elemanlarin karakterlerinin cift sayili  karelerini hesaplayan,ve karelerini tekrarsiz buyukten kucuge sirali  yaziniz.
    public static void ciftKareTekrarsizTersSira(List<String> list){
        list.
                stream().
                //filter(t->t.length()%2==0).
                        map(t->t.length()*t.length()).//string elemnalr character sayisine cevirildi
                filter(Lambda01::ciftBul).//cift sarti calisti
                distinct().//tekrarsiz
                sorted(Comparator.reverseOrder()).//ters sira b->k
                forEach(Lambda01::printEl);//yazdirilidiş

    }


    private static void sonHarfTersSiraliElig(List<String> list) {
        list.stream().
                sorted(Comparator.comparing(t -> t.toString().charAt(t.toString().length() - 1)).
                        reversed()).
                forEach(t -> System.out.print(t + " "));

    }

    private static void charSiraKucuktenBuyuge(List<String> list) {
        list.
                stream().sorted(Comparator.comparing(t -> t.length())).forEach(t -> System.out.print(t + " "));
    }

    private static void tersTekrarsizSiraChar(List<String> list) {
        list.stream().
                map(t -> t.length()).
                sorted(Comparator.reverseOrder()).
                distinct().
                forEach(Lambda01::printEl);
    }

    public static void bykHrfTekrarsizSira(List<String> list) {
        list.
                stream().//akisa girdi
                // map(t->t.toUpperCase()).//elelmanlar byk harf update edildi
                        map(String::toUpperCase).//elelmanlar byk harf update edildi
                sorted().//alfabetik sira
                distinct().//tekrarsiz  yapildi
                forEach(t -> System.out.print(t + " "));//yazdirilidi
        //EMRE EMİNE KADER MEHMET NİLGUN YILDIZ İSLAM

    }
}
