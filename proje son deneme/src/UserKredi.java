import java.util.Scanner;

// User arayüzü
class UserKredi implements User {
    public int Ek_gelir;
    public double Aylik_Maaş;
    public int kefil_sayisi;

    public UserKredi(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ek geliri giriniz");
        this.Ek_gelir = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Aylık maaş");
        this.Aylik_Maaş = scanner.nextInt();

        System.out.println("Kefil sayısı giriniz");
        this.kefil_sayisi = scanner.nextInt();
        System.out.println("Ek geliri 6 binin üzerinde değilse kredi alamazsınız");
        System.out.println("30000 tl altı Aylık maaş alan kredi alamazsınız ");
        System.out.println("Kefil sayısı 1 den fazla olamayan kredi alamazsınız");
        System.out.println("en az iki şartı sağlamıyorsanız kredi alamazsınız");
    }

    @Override
    public int Ek_gelir() {
        return this.Ek_gelir;
    }

    @Override
    public int kefil_sayisi() {
        return this.kefil_sayisi;
    }

    @Override
    public double Aylik_Maaş() {
        return this.Aylik_Maaş;
    }
    public boolean ekGelirUygunMu() {
        return this.Ek_gelir > 6000;
    }

    public boolean aylikMaaşUygunMu() {
        return this.Aylik_Maaş > 30000;
    }

    public boolean kefilSayisiUygunMu() {
        return this.kefil_sayisi >= 1;
    }

    public boolean krediAlabiliyorMu() {
        int uygunSartSayisi = 0;

        if (ekGelirUygunMu()) {
            uygunSartSayisi++;
        }

        if (aylikMaaşUygunMu()) {
            uygunSartSayisi++;
        }

        if (kefilSayisiUygunMu()) {
            uygunSartSayisi++;
        }

        return uygunSartSayisi >= 2;
    }


}