import java.util.Scanner;

public class ParaTransferi {
    Scanner scanner = new Scanner(System.in);

    public void paraTransferEt(String hesapNumarasi, double miktar) {
        try {
            System.out.println("Hesap numarasını girin:");
            hesapNumarasi = scanner.nextLine();
            System.out.println("Transfer miktarını girin:");
            if (!scanner.hasNextDouble()) {
                throw new Exception("Miktar bir sayı olmalıdır.");
            }
            miktar = scanner.nextDouble();
            scanner.nextLine(); // Dummy line to consume newline character
            // Hesap numarasına belirtilen miktarı transfer et
            System.out.println("Hesap numarası " + hesapNumarasi + " olan kullanıcıya ");
            System.out.println("Kullanıcının hesabına türk lirası "  + miktar+ " aktarılmıştır");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void paraTransferEt(String hesapNumarasi, double miktar, String aciklama) {
        try {
            System.out.println("Hesap numarası girin:");
            hesapNumarasi = scanner.nextLine();
            System.out.println("Transfer miktarını girin:");
            if (!scanner.hasNextDouble()) {
                throw new Exception("Miktar bir sayı olmalıdır.");
            }
            miktar = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Açıklama girin:");
            aciklama = scanner.nextLine();
            System.out.println("Hesap numarası " + hesapNumarasi + " olan kullanıcıya ");
            System.out.println("Kullanıcının hesabına türk lirası "  + miktar+ " aktarılmıştır");
            System.out.println("Kullanıcıya mesajınız şu şekilde iletilmiştir: " +aciklama);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void paraTransferEt(String hesapNumarasi, double miktar, String aciklama, String saat) {
        try {
            System.out.println("Hesap numarasını girin:");
            hesapNumarasi = scanner.nextLine();
            System.out.println("Transfer miktarını girin:");
            if (!scanner.hasNextDouble()) {
                throw new Exception("Miktar bir sayı olmalıdır.");
            }
            miktar = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Açıklama girin:");
            aciklama = scanner.nextLine();
            System.out.println("Gönderilecek saati giriniz(tam saat olmalı):");
            saat = scanner.nextLine();
            Integer.parseInt(saat);
            System.out.println("Hesap numarası " + hesapNumarasi + " olan kullanıcıya ");
            System.out.println("Kullanıcının hesabına türk lirası "  + miktar+ "aktarılmıştır");
            System.out.println("Kullanıcıya mesajınız şu şekilde iletilmiştir: " +aciklama);
            System.out.println("paranın kullanıcıya aktarılcağı saat: "   +saat);
        } catch (NumberFormatException e) {
            System.out.println("Saat bir tam sayı olmalıdır.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
