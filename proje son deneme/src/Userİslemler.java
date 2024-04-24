import java.util.Scanner;

public class Userİslemler {

    public static void main(String[] args) {
        Islemler islemler = new Islemler();
        menudekiSecimlariAl();
    }

    public static void menudekiSecimlariAl() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nMenü:");
            System.out.println("1. Para Çekme");
            System.out.println("2. Para Yatırma");
            System.out.println("3. Para Transferi");
            System.out.println("4. Çıkış Yap");
            System.out.print("Lütfen bir seçim yapın: ");
            int secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    Islemler.paraCekme();
                    break;
                case 2:
                    Islemler.paraYatirma();
                    break;
                case 3:
                    Islemler.paraTransferi();
                    break;
                case 4:
                    System.out.println("Tekrar görüşmek üzere, hoşçakalın.");
                    System.exit(0);
                default:
                    System.out.println("Lütfen geçerli bir seçim yapın.");
            }
        }
    }

    public static class Islemler {
        private static int bakiye;

        // Yapıcı (constructor)
        public Islemler() {
            bakiye = 1000; // Başlangıçta bakiyeyi 1000 olarak ayarlıyoruz
            System.out.println("Islemler sınıfının bir örneği oluşturuldu ve bakiye 1000 olarak ayarlandı.");
        }

        public static void paraCekme() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Çekeceğiniz miktarı girin");
            int miktar = scanner.nextInt();
            if (bakiye - miktar >= 0) {
                bakiye -= miktar;
                System.out.println("İşlem başarılı, paranız çekiliyor. Yeni bakiyeniz: " + bakiye);
            } else {
                System.out.println("İşlem başarısız, bakiye yetersiz. Bakiyeniz: " + bakiye);
            }
        }

        public static void paraYatirma() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Yatırılacak miktarı giriniz");
            int miktar = scanner.nextInt();
            bakiye += miktar;
            System.out.println("İşlem başarılı, paranız yatırılıyor. Yeni bakiyeniz: " + bakiye);
        }

        public static void paraTransferi() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Atılcak miktarı giriniz");
            int miktar=scanner.nextInt();
            System.out.println("Alıcı hesabın IBAN numarasını giriniz:");
            long aliciIban = scanner.nextLong();
            System.out.println("İşlem başarılı, " + aliciIban + " IBAN numarasına " +  " TL gönderildi. Yeni bakiyeniz: " + bakiye);
        }
    }
}