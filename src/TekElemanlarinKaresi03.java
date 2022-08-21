import java.util.ArrayList;
import java.util.List;

    public class TekElemanlarinKaresi03 {
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

            TekElemanlarinKaresiniYazdir(l); // 9 121 1089 169


        }
        //3) tek sayi olan list elemanlarinin karelerini aynı satırda aralarında boşluk bırakarak
        // yazdıran bir method oluşturun.

        public static void TekElemanlarinKaresiniYazdir (List<Integer>list) {
            list.stream().filter(t->t%2==1).map(t->t*t).forEach(t-> System.out.print(t+ " "));

            // tek sayilari istedigi icin .filter() kullandik, icine condition olarak t'nin 2'ye
            // bolumunden kalanin 1 olmasini istedik nu bize list deki tek elemanlari filtreleyip vericek.
            // elemanlarin degeri degisecekse .map () kullanilir.
           //  tek sayilarin karesin istedigimiz icin .map () condition'ina t*t yazdik

        }

    }

