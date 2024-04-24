import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Atm atm=new Atm();
        Hesap hesap=new Hesap("yağızhan aydın","12345",2000);
        atm.calış(hesap);

        Scanner scanner = new Scanner(System.in);

        // ParaTransferi nesnesi oluştur
        ParaTransferi paraTransferi = new ParaTransferi();

        System.out.println("Hoşgeldiniz");
        System.out.println("Çıkmak için q ya basınız");
        String işlemler = "1.işlem: Kullanıcı bilgilerinizi görmek için \n"
                + "2.işlem: Kredi soruları için\n"
                + "3.İşlem: Paratransfer işlemleri\n"
                + "4.İşlem: Döviz işlemleri hesaplama\n"
                + "Çıkış için q tuşuna basınız";
        System.out.println("*************");
        System.out.println(işlemler);
        System.out.println("*************");

        while (true) {
            System.out.println("işlemi seçiniz");
            String işlem = scanner.nextLine();
            if (işlem.equals("q")) {
                System.out.println("Programdan çıkılıyor");
                break;
            }
            else if (işlem.equals("1")) {
                UserBilgileri K1=new UserBilgileri();
                K1.hesapBilgileriniGoruntule();
            }
            else if (işlem.equals("2")) {
                UserKredi k1 = new UserKredi();
                if (k1.krediAlabiliyorMu()) {
                    System.out.println("Kredi alabilirsiniz.");
                } else {
                    System.out.println("Kredi alamazsınız.");
                }
            }
            else if (işlem.equals("3")) {
                String seçenek = "1.seçenek: Hesapnumarası ve miktar için \n"
                        + "2.seçenek Hesapnumarası,miktar,açıklama için \n"
                        + "3.seçenek: Hesapnumarası,miktar,açıklama.tarih için";
                System.out.println(seçenek);
                System.out.println("seçenek giriniz");
                String secim = scanner.nextLine();
                if (secim.equals("1")) {
                    String hesapNumarasi="0";
                    int miktar=0;
                    try {
                        paraTransferi.paraTransferEt(hesapNumarasi, miktar);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                } else if (secim.equals("2")) {
                    String hesapNumarasi="0";
                    int miktar=0;
                    String aciklama = "0";
                    try {
                        paraTransferi.paraTransferEt(hesapNumarasi, miktar,aciklama);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                } else if (secim.equals("3")) {
                    String hesapNumarasi="0";
                    int miktar=0;
                    String aciklama = "0";
                    String saat="0";
                    try {
                        paraTransferi.paraTransferEt(hesapNumarasi, miktar,aciklama,saat );
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
            }
            else if (işlem.equals("4")) {
                System.out.println("Döviz işlemi seçiniz: 1-Alma, 2-Satma");
                int tercih = scanner.nextInt();
                System.out.println("Döviz miktarını giriniz:");
                int miktar = scanner.nextInt();
                scanner.nextLine();
                if (tercih == 1) {
                    UserDoviz.Alma.islem(miktar);
                }
                else if (tercih == 2) {
                    UserDoviz.Satma.islem(miktar);
                }
                else {
                    System.out.println("Geçersiz seçim. Lütfen 1 veya 2'yi seçin.");
                }
            }

        }
    }
}
