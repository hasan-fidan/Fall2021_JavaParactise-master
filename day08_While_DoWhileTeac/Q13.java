package day08_While_DoWhileTeac;

import java.util.Scanner;

public class Q13 {

    public static void main(String[] args) {
        /*
         * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
         * musteri karti olup olmadigini sorun
         *
         * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
         * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az alirsa %10
         * indirim yapin
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen kaç adet urun aldiğinizi giriniz: ");
        int alinanUrunSayisi = scan.nextInt();
        int toplam = 0;
        int urunFiyati = 0;
        int i = 1;
        while (i <= alinanUrunSayisi) {
            System.out.println("Lutfen aldiğiniz " + i + ". urunun fiyatini giriniz: ");
            urunFiyati = scan.nextInt();
            i++;
            toplam += urunFiyati;
        }
        System.out.println("Musteri kartiniz var mi? \n\n 'EVET' ya da 'HAYIR'");
        char musteriKarti = scan.next().toUpperCase().charAt(0);
        if (musteriKarti == 'E') {
            if (alinanUrunSayisi >= 10) {
                System.out.println(
                        "\nMusteri kartiniz olduğu için alisverisinize %15 indirim uygulanmistir. Ek olarak 10'dan fazla urun aldiğiniz için bu indirim %20'ye yukseltilmistir. "
                                + "\n%20 indirim sonrasi ödemeniz gereken tutar: " + (toplam - toplam * 20 / 100)
                                + " TL");
            } else {
                System.out.println(
                        "\nMusteri kartiniz olduğu için alisverisinize %15 indirim uygulanmistir. \n%15 indirim sonrasi ödemeniz gereken tutar: "
                                + (toplam - toplam * 15 / 100) + " TL");
            }
        } else if (musteriKarti == 'H') {
            if (alinanUrunSayisi >= 10) {
                System.out.println("\\n10'dan fazla urun aldiğiniz için alisverisinize %15 indirim uygulanmistir. "
                        + "\n%15 indirim sonrasi ödemeniz gereken tutar: " + (toplam - toplam * 15 / 100) + " TL");
            } else {
                System.out
                        .println("\\nBugune özel %10 indirim kazandiniz. \n%10 indirim sonrasi ödemeniz gereken tutar: "
                                + (toplam - toplam * 10 / 100) + " TL");
            }
      scan.close() ; }
    }
}
