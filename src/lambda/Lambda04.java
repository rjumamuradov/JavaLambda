package lambda;

import java.util.*;
import java.util.stream.Collectors;

//import static lambda.TechPro.ogrSayi;

public class Lambda04 {
    public static void main(String[] args) {
        TechPro trGunduz=new TechPro("yaz","Tr gunduz",97,124);
        TechPro engGunduz=new TechPro("kis","ENG gunduz",95,131);
        TechPro trGece=new TechPro("bahar","TR gece",98,143);
        TechPro engGece=new TechPro("sonbahar","ENG gece",93,151);
        List<TechPro>list=new ArrayList<TechPro>(Arrays.asList(trGunduz,engGunduz,trGece,engGece));

        System.out.println();
        System.out.println("*******");
        System.out.println(batchOrt92Byk(list));
        System.out.println();
        System.out.println("***110dan az mi***");
        System.out.println( ogrSayi100AzMi(list));
        System.out.println();
        System.out.println("***bahar var mi****");
        System.out.println(baharVarMi(list));
        System.out.println();
        System.out.println("***ogr sayusu****");
        System.out.println(ogrSayiSirala(list));
        System.out.println();
        System.out.println("***batch ortalamsira****");
        System.out.println(batchOrtTersSiraliBatch(list));
        System.out.println();
        System.out.println("***en az ikinci****");
        System.out.println(ogrSayiEnAz2Batch(list));
        System.out.println();
        System.out.println("****95ten buyuk***");
        System.out.println( ort95tenBuyuklerinToplami(list));
        System.out.println();
        System.out.println("****sayi130Buyuk***");
        System.out.println(ogrSayi130BykBatchOrt(list));
        System.out.println();
        System.out.println("*******");
        System.out.println(gunduzBatchSayisi(list));
        System.out.println();
        System.out.println("****130dan buyuk***");

        System.out.println(ogrcSayisi130FazlaEnBykBatch(list));
        System.out.println();
        System.out.println("***150den kucuk****");
        System.out.println(ogrcSayisi150AzEnKckBatch(list));

    }
    //task 11-->Ogrenci sayilari 150'dan az olan batch'lerin en kucuk batch ort'unu bulunuz.
    public static int ogrcSayisi150AzEnKckBatch(List<TechPro> list){
        return list.
                stream()
                .filter(t->t.getOgrSayi()<150).
                mapToInt(TechPro::getBatchOrt).
                min().
                getAsInt();//getAsInt()-->cıktıyı int type olarak return eder

    }
    //task 10-->Ogrenci sayilari 130'dan fazla olan batch'lerin en buyuk batch ort'unu bulunuz
    public static OptionalInt ogrcSayisi130FazlaEnBykBatch(List<TechPro> list){
        return list.
                stream()
                .filter(t->t.getOgrSayi()>130).
                mapToInt(TechPro::getBatchOrt).
                max();

    }

    //task 09-->gunduz batch'lerinin sayisini  yazdiriniz.
    public static int gunduzBatchSayisi(List<TechPro> list){
        return (int) list.
                stream()
                .filter(t->t.getBatchName().contains("gunduz")).count();

    }
    private static OptionalDouble ogrSayi130BykBatchOrt(List<TechPro> list) {
       return  list.stream().filter(t->t.getOgrSayi()>130).mapToDouble(t->t.getBatchOrt()).average();
    }

    private static int ort95tenBuyuklerinToplami(List<TechPro> list) {
        return list.
                stream().
                filter(t->t.getBatchOrt()>95).
                map(t->t.getOgrSayi()).
                //reduce(0,Integer::sum);
                reduce(0,(t,u)->t+u);
    }

    private static List<TechPro> ogrSayiEnAz2Batch(List<TechPro> list) {
        return list.
                stream().
                sorted(Comparator.comparing(TechPro::getOgrSayi)).
                limit(2).
                skip(1).
                collect(Collectors.toList());
    }

    public static List<TechPro> batchOrtTersSiraliBatch(List<TechPro> list){
        return  list.
                stream().
               // sorted(Comparator.comparing(TechPro::getBatchOrt).reversed()).//ogrcSayisi parametresine gore ters siraladi
                sorted(Comparator.comparing(TechPro::getBatchOrt).reversed()).//ogrcSayisi parametresine gore ters siraladi
                        limit(3).//akıstadki elemanlarin ilk ucu alindi
                        collect(Collectors.toList());//collect()->akısdaki elamanları istenen sarta gore toplar
        //Collectors.toList()->collect'e toplanan elemanlarilist'e cevirir
    }

    private static List<TechPro> ogrSayiSirala(List<TechPro> list) {
       return list.
                stream().
                sorted(Comparator.comparing(TechPro::getOgrSayi).
                        reversed()).
                collect(Collectors.toList());

    }

    private static boolean baharVarMi(List<TechPro> list) {
        return list.stream().anyMatch(t->t.getBatch().equals("bahar"));
    }

    private static boolean ogrSayi100AzMi(List<TechPro> list) {
        return list.stream().noneMatch(t->t.getOgrSayi()>110);

    }

    private static boolean batchOrt92Byk(List<TechPro> list) {
      return   list.stream().allMatch(t -> t.getBatchOrt() > 92);



    }
}
