package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Test

{
    public static void main(String[] args) {
        Integer[]dizi={1,2,3,4,5,6,8,7,9,16,25,100};
        List<Integer> liste=new ArrayList<>(Arrays.asList(dizi));

        //Stream<Integer>deneme=Stream.of(dizi);
        //System.out.println(Stream.of(deneme));
        //System.out.println(deneme+" deneme");
        //System.out.println(Stream.of());
        //System.out.println(Arrays.toString(dizi));   //[1, 2, 3, 4, 5, 6]

        ciftEleman(dizi,liste);
        //System.out.println();
        //ciftTopla(liste);


    }

    private static void ciftTopla(List<Integer> liste) {
        //liste.stream().filter(t->t%2==0).forEach(t-> System.out.println((t+t)+" "));
        Integer toplam = liste.stream().filter(t -> t % 2 == 0).reduce(0, (x, y) -> x + y);
       // Optional<Integer> toplam =liste.stream().filter(t->t%2==0).reduce(Integer::sum);


        System.out.println(toplam);
    }

    private static void ciftEleman(Integer[] dizi, List<Integer> liste) {
       // Arrays.stream(dizi).filter(t->t%2==0).forEach(t->System.out.print(t+" "));

    }
}
