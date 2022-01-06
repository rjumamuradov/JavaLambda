package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;




import java.util.Optional;

public class Lambda01 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(3, 5, 05, 6, 4, 11, 7, 8, 9, 10, 100, 16, 15));
        // structured Programming ile list elemanlerinin tamamini yazdiriniz
        // printElStructured(List<Integer>list);
        printElStructured(list);
        System.out.println();
        System.out.println("****");
        printElFunctional(list);
        System.out.println();
        System.out.println("****");
        printElFunctional1(list);
        System.out.println();
        System.out.println("****");
        printCiftElStructured(list);
        System.out.println();
        System.out.println("****");
        printCiftElFunctional(list);
        System.out.println();
        System.out.println("**q**");
        printCiftElFunctional2(list);
        System.out.println();
        System.out.println("**q60**");
        printCiftLAltmistanKucuk(list);
        System.out.println();
        System.out.println("**>20**");
        printCiftLYirmidenBuyuk(list);
        System.out.println();
        System.out.println("**>kareli**");
        printCiftKareli(list);
        System.out.println();
        System.out.println("**>kuplufilan**");
        printTekKuplu(list);
        System.out.println();
        System.out.println("**>cift karekoklu**");
        printCiftKarekoklu(list);
        System.out.println();
        System.out.println("**>Maxx**");
        printMax(list);

    }

    private static void printMax(List<Integer> list) {
        Optional<Integer>maxEl=list.stream().reduce(Math::max);
        System.out.println(maxEl);







    }

    private static void printCiftKarekoklu(List<Integer> list) {
        list.stream().filter(Lambda01::ciftBul).map(Math::sqrt).forEach(t -> System.out.println(t + " "));

    }

    private static void printTekKuplu(List<Integer> list) {
        list.stream().filter(t -> t % 2 == 1).map(t -> (t * t * t) + 1).forEach(Lambda01::printEl);

    }

    private static void printCiftKareli(List<Integer> list) {

        list.stream().filter(Lambda01::ciftBul).map(t -> t * t).forEach(Lambda01::printEl);
        // list.stream().filter(Lambda01::ciftBul).map(math).forEach(Lambda01::printEl);

    }

    private static void printCiftLYirmidenBuyuk(List<Integer> list) {

        list.stream().filter(t -> t % 2 == 1 & t > 20).forEach(Lambda01::printEl);


    }

    private static void printCiftLAltmistanKucuk(List<Integer> list) {
        list.stream().filter(t -> t % 2 == 0 & t < 60).forEach(Lambda01::printEl);
        //list.stream().filter(Lambda01::ciftBul & Lambda01::altmistanKucuk).forEach(Lambda01::printEl);
        ;

    }
    protected static boolean altmistanKucuk(int t){

        return t>60;
    }

    private static void printCiftElFunctional2(List<Integer> list) {
        list.stream().filter(Lambda01::ciftBul).forEach(Lambda01::printEl);
        ;

    }

    public static boolean ciftBul(int i) {

        return i % 2 == 0;

    }

    private static void printCiftElFunctional(List<Integer> list) {
        list.stream().filter(t -> t % 2 == 0).forEach(Lambda01::printEl);
        ;

    }

    private static void printElStructured(List<Integer> list) {
        for (Integer w : list) {
            System.out.print(w + " ");
        }

    }

    private static void printElFunctional(List<Integer> list) {
        list.stream().forEach(t -> System.out.print(t + " "));

    }

    protected static void printEl(int t) {
        System.out.print(t + " ");

    }

    private static void printElFunctional1(List<Integer> list) {
        list.stream().forEach(Lambda01::printEl);

    }

    private static void printCiftElStructured(List<Integer> list) {

        for (Integer w : list) {
            if (w % 2 == 0) {
                System.out.print(w + " ");
            }
        }
        Math.random();


    }


}
