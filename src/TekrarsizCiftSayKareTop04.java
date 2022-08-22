import java.util.ArrayList;
import java.util.List;

public class TekrarsizCiftSayKareTop04 {
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

        System.out.println(l); // [8, 10, 3, 11, 33, 13, 78, 0, 8, 78]
        tekrasizCiftElemanlarinKarelerinToplami(l); // 98486


    }

// 4) Tekrarsız çift elemanlarin karelerinin toplamını hesaplayan bir method oluşturun.
    public static void tekrasizCiftElemanlarinKarelerinToplami(List<Integer>list) {
      Integer toplam= list.stream().distinct().filter(t->t%2==0).map(t->t*t).reduce(0,(t,u)->t+u);
        System.out.println(toplam);

        //.distinct() => tekrarsiz olan elemanlari almak icin kullanilir.
        //=.reduce() => elemanlari tek sayiya indirgemek icin kullanilir. Soruda toplam istedigi icin
        // .reduce() => baslangic degeri vermeligiz soruda toplam istedigi icin baslangiz degerine 0 dedik.
        // 0 toplamda etkisiz elemandir.
    }
}
