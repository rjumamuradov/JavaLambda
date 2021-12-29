package lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Lambda06 {
    public static void main(String[] args) throws IOException {
        System.out.println();
        System.out.println("*******");
        Files.lines(Paths.get("src/lambda/File1")).
                forEach(System.out::println);
        System.out.println();
        System.out.println("*****touppercase***");
        Files.
                lines(Paths.get("src/lambda/File1")).
                map(String::toUpperCase).
                forEach(System.out::println);
        System.out.println();
        System.out.println("*****ilk satir kucukharf***");
        Files.
                lines(Paths.get("src/lambda/File1")).limit(1).
                map(String::toLowerCase).
                forEach(System.out::println);
        System.out.println();
        System.out.println("*****why kelimekacdefagecir***");
        System.out.println(Files.
                lines(Paths.get("src/lambda/File1")).
                filter(t->t.contains("why")).
                count());
        System.out.println();
        System.out.println("*******");
        Files.
                lines(Paths.get("src/lambda/File1")).
                map(t->t.split(" ")).
                flatMap(Arrays::stream).distinct().
                collect(Collectors.toList());


    }

}
