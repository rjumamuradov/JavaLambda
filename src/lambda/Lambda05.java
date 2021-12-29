package lambda;

import java.util.stream.IntStream;

public class Lambda05 {
    public static void main(String[] args) {
        System.out.println(topla(10));
        System.out.println(topla1(10));


    }
    //TASK 01 --> Structured Programming ve Functional Programming ile 1'den x'e kadar tamsayilari toplayan bir program yaziniz.
//Structured Programming
    public static int topla(int x) {
        int toplam = 0;
        for (int i = 0; i <= x; i++) {
            toplam +=i;
        }
        return toplam;
    }
    //Functional Programming
    public static int topla1(int x) {

        return IntStream.range(1,x+1).//1 2 3 ... x elemanarinin akısı --> 1 dahil x+1 hariç
                sum();
    }
    public static int topla2(int x) {

        return IntStream.rangeClosed(1,x).//1 2 3 ... x --> 1 ve x dahil
                sum();
    }


//TASK 02 --> 1'den x'e kadar cift tamsayilari toplayan bir program yaziniz

//TASK 03 --> Ilk x pozitif cift sayiyi toplayan program yaziniz

//TASK 04 --> Ilk X pozitif tek tamsayiyi toplayan programi yaziniz

//TASK 05 --> 2'nin ilk x kuvvetini ekrana yazdiran programi yaziniz

//TASK 06 --> Istenilen bir sayinin ilk x kuvvetini ekrana yazdiran programi yaziniz

//TASK 07 --> Istenilen bir sayinin faktoriyelini hesaplayan programi yaziniz
}
