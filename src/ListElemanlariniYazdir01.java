import java.util.ArrayList;
import java.util.List;

public class ListElemanlariniYazdir {
/*
    Lambda Functional Programming ile ilgili kisa bilgiler:

    1) Lambda (Functional Programming) Java 8 ile kullanılmaya başlanmıştır.
    2) Functional Programming'de "Ne yapılacak" (What to do) üzerine yoğunlaşılır.
       Structured Programming "Nasıl yapılacak" (How to do) üzerine yoğınlaşılır.
       Structured Programming => Core Java da ogrendiklerimiz
    3) Functional Programming, Arrays ve Collections ile kullanılır.
    4) "entrySet() methodu ile Map, Set'e dönüştürülerek Functional Programming'de kullanılabilir.
   */

    /*
     Asagidaki ornek sorular, Anil Yasin hoca ile yaptigimiz sorularin benzeri olucaktir.
     Onunla cozdugumuz sorulari gormek isterseniz
     https://github.com/HercaiErdem/Batch81-Java-LambdaLectures/tree/main/src/lambda_functional_programming
     gidiniz.
   */
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(8);
        l.add(10);
        l.add(3);
        l.add(11);
        l.add(33);
        l.add(13);
        l.add(78);
        l.add(60);
        l.add(8);
        l.add(78);

        System.out.println(l); // [8, 10, 3, 11, 33, 13, 78, 60, 8, 78]
        // l isminde int date type'inda bir List olusturduk,
        // icine degerlerimizi initialized ettik.

        listElemanlariniAyniSatirdaYazdir(l);


    }
//1)Ardışık list elemanlarini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)

    //method ()'umuza her yerden ulasilabilsin diye public yappalim
    // main den cagiracagimiz icin main de bir static oldugu icin static yapalim
    // bize bir sey dondurmeyecek sadece yazdiracagimiz icin void yapalim

    public static void listElemanlariniAyniSatirdaYazdir(List<Integer> list) {
        list.stream().forEach(t -> System.out.print(t + " "));
        // .stream method() => collection dan elemanlari akisa dahil etmek icin ve () lara ulasmak icin kullandik.
        // .forEach() => elemanlarin icinde dolasmak icin kullandik.,

    }
}
