import java.util.*;
import java.util.*;

public class CiftListElemanlariniYazdir02 {
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

        CiftListElemanlariniYazdir(l); // 8 10 78 60 8 78

    }

    //2) Cift list elemanlarini aynı satırda aralarında boşluk bırakarak
    public static void CiftListElemanlariniYazdir(List<Integer> list) {

        list.stream().filter(t -> t % 2 == 0).forEach(t -> System.out.print(t + " "));

        // .filter()=> bir seyleri filtrelemek icin kullaniriz. Burda cift sayilari alip
        // tek sayilari elemek icin t'nin 2 ye bolumunden 0 olanlari aldik.

    }


}
