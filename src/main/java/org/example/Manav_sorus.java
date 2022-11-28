package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Manav_sorus  {
    public static List<Urunler>urunlerList() {
        List<Urunler> urunler = new ArrayList<>();
        urunler.add(new Urunler("->> 1-Un", 150));
        urunler.add(new Urunler("->> 2-Şeker", 120));
        urunler.add(new Urunler("->> 3-Pirinç", 110));
        urunler.add(new Urunler("->> 4-Yağ", 42));
        urunler.add(new Urunler("->> 5-Cupuacu", 250));
        return urunler;
    }
    public static void main(String[] args)  {
        List<Urunler>urunler=urunlerList();
        double sonuc = 0;
        boolean sayi = true;
        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("Lütfen almak istediginiz ürünü seçiniz : ");
            int urun = scan.nextInt();
            switch (urun) {
                case 1:
                    System.out.println("Kaç kilo Un istiyorsunuz : ");
                    double kilo = scan.nextDouble();
                    sonuc += kilo*urunler.get(0).getFiyat();
                    System.out.println("Ekstra ürün eklemek ister misiniz ?" +
                            "\nEvet->> 1" +
                            "\nHayır->> 2");
                    String degis = scan.next();
                    if (degis.equals("2")) {
                        sayi = false;
                    } else if (degis.equals("1")) {
                    }
                    break;
                case 2:
                    System.out.println("Kaç kilo Şeker istiyorsunuz : ");
                    double kilo1 = scan.nextDouble();
                    sonuc += kilo1*urunler.get(1).getFiyat();
                    System.out.println("Ekstra ürün eklemek ister misiniz ?" +
                            "\nEvet->> 1" +
                            "\nHayır->> 2");
                    String degis0 = scan.next();

                    if (degis0.equals("2")) {
                        sayi = false;
                    } else if (degis0.equals("1")) {

                    }
                    break;
                case 3:
                    System.out.println("Kaç kilo Pirinç istiyorsunuz : ");
                    double kilo2 = scan.nextDouble();
                    sonuc += kilo2*urunler.get(2).getFiyat();
                    System.out.println("Ekstra ürün eklemek ister misiniz ?" +
                            "\nEvet->> 1" +
                            "\nHayır->> 2");
                    String degis1 = scan.next();

                    if (degis1.equals("2")) {
                        sayi = false;
                    } else if (degis1.equals("1")) {
                    }
                    break;
                case 4:
                    System.out.println("Kaç Litre Yağ istiyorsunuz : ");
                    double kilo3 = scan.nextDouble();
                    sonuc += kilo3*urunler.get(3).getFiyat();
                    System.out.println("Ekstra ürün eklemek ister misiniz ?" +
                            "\nEvet->> 1" +
                            "\nHayır->> 2");
                    String degis2 = scan.next();

                    if (degis2.equals("2")) {
                        sayi = false;
                    } else if (degis2.equals("1")) {
                    }
                    break;
                case 5:
                    System.out.println("Kaç gram Cupuacu istiyorsunuz : ");
                    double kilo4 = scan.nextDouble();
                    sonuc += kilo4*urunler.get(4).getFiyat();

                    System.out.println("Ekstra ürün eklemek ister misiniz ?" +
                            "\nEvet->> 1" +
                            "\nHayır->> 2");
                    String degis3 = scan.next();

                    if (degis3.equals("2")) {
                        sayi = false;
                    } else if (degis3.equals("1")) {
                    }
                    break;
            }
        } while (!!sayi);

        System.out.println("Sepet tutariniz : " + sonuc + " TL");
    }
}