package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Manav_sorus {
        public static void main(String[] args) {

            Map<String, Integer> urunList = new HashMap<>();
            urunList.put("Un", 150);
            urunList.put("Şeker", 35);
            urunList.put("Pirinç", 58);
            urunList.put("Yağ", 189);
            urunList.put("Cupuacu", 250);
            double sonuc = 0;
            boolean sayi = true;
            do {
                Scanner scan = new Scanner(System.in);
                System.out.println("Lütfen almak istediginiz ürünü seçiniz : " +
                        "\n->> 1-Un" +
                        "\n->> 2-Şeker" +
                        "\n->> 3-Pirinç" +
                        "\n->> 4-Yağ" +
                        "\n->> 5-Cupuacu");
                int urun = scan.nextInt();
                switch (urun) {
                    case 1:
                        System.out.println("Kaç kilo Un istiyorsunuz : ");
                        double kilo = scan.nextDouble();
                        sonuc += urunList.get("Un")*kilo;
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
                        sonuc += urunList.get("Şeker")*kilo1;

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
                        sonuc += urunList.get("Pirinç")*kilo2;

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
                        double litre = scan.nextDouble();
                        sonuc += urunList.get("Yağ")*litre;

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
                        double gram = scan.nextDouble();
                        sonuc += urunList.get("Cupuacu")*gram;

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
            } while (!sayi == false);
            System.out.println("Sepet tutariniz : " + sonuc + " TL");
        }
    }

