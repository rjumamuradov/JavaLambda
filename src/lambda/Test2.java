package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Test2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(12, -3, 65, 3, 7, 34, 22, -60, 42, 55));
        ciftBul1(list);
        System.out.println();
        ciftBul2(list);
        System.out.println();
        ciftTopla1(list);
        ciftTopla2(list);
        ciftCarp(list);






    }

    private static void ciftCarp(List<Integer> list) {
      Optional<Integer> carpim=(list.stream().filter(Test2::ciftEleman1).reduce( (x, y) -> (x * y)));
        Optional<Integer> carpim1= Optional.of((list.stream().filter(Test2::ciftEleman1).reduce(1, (x, y) -> (x * y))));
      System.out.println("cift carp:: "+carpim);
        System.out.println("cift carp 1  :: "+carpim1);
    }

    private static void ciftTopla2(List<Integer> list) {
      Optional<Integer> toplam1= Optional.of(list.stream().filter(Test2::ciftEleman1).reduce(0,(x,y)->(x+y)));
        System.out.println("Ciftin toplmai2:"+toplam1);

    }

    private static void ciftTopla1(List<Integer> list) {
       Optional<Integer> toplam= list.stream().filter(Test2::ciftEleman1).reduce(Integer::sum);
        System.out.println("ciftin toplami:"+toplam);
    }

    private static void println1(int t) {

        System.out.print(t+" ");
    }

    private static void ciftBul2(List<Integer> list) {
        list.stream().filter(Test2::ciftEleman1).forEach(t-> System.out.print(t+" "));
    }

    private static boolean ciftEleman1(int t) {
        return t%2==0;
    }

    private static void ciftBul1(List<Integer> list) {
        list.stream().filter(t-> t % 2 == 0).forEach(Test2::println1);

    }
}
