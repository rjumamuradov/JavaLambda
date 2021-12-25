package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Lambda02 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(12, -3, 65, 3, 7, 34, 22, -60, 42, 55));
        //List'in cift olan elelmanlarin karelerini aliniz ve en buyugunu yazdiriniz


        ciftKareMax(list);
        System.out.println();
        toplaEl1(list);
        System.out.println();
        toplaEl12(list);
        System.out.println();
        carpCiftEl1(list);
        System.out.println();
        carpCiftEl2(list);
        System.out.println();
        min1(list);
        System.out.println();
        min2(list);
        System.out.println();




    }

    private static int minBul(int x, int y) {
        return x<y ? x:y;
    }


    private static void min2(List<Integer> list) {



    }

    private static void min1(List<Integer> list) {
        Optional<Integer> min=list.stream().reduce(Integer::min);
        System.out.println(min);
    }

    private static void carpCiftEl2(List<Integer> list) {
        Integer carp = list.stream().filter(Lambda01::ciftBul).reduce(-1, (x, y) -> (x * y));
        System.out.println(carp);
    }

    private static void carpCiftEl1(List<Integer> list) {
        Optional<Integer> carp = list.stream().filter(Lambda01::ciftBul).reduce(Math::multiplyExact);
        System.out.println(carp);
    }

    private static void toplaEl12(List<Integer> list) {
        Optional<Integer> toplam = list.stream().reduce(Integer::sum);
        Optional<Integer> toplam2 = list.stream().reduce(Math::addExact);
        System.out.print(toplam);
        System.out.println(toplam2);

    }

    private static void toplaEl1(List<Integer> list) {
        int toplam = list.stream().reduce(0, (t, u) -> t + u);
        System.out.print(toplam);
    }

    private static void ciftKareMax(List<Integer> list) {
        Optional maxEl = list.stream().filter(Lambda01::ciftBul).map(t -> t * t).reduce(Integer::max);
        // int maxEl = list.stream().filter(Lambda01::ciftBul).map(t -> t * t).reduce(Integer::max);
        // reduce() returne edilen elelman null yada int 'den buyuk olur ihtimali icin Java guvenlik olarak handle ederek
        //Optional class' sart kosuyor
        System.out.println(maxEl);

    }

}
