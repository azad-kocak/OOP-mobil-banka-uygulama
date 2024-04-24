import java.util.Scanner;

public class Giris {
    public boolean giris(Hesap hesap) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kullanıcı Adı: ");
        String kullanici_adi = scanner.nextLine();

        System.out.print("Parola: ");
        String parola = scanner.nextLine();
        if (hesap.getKullanıcı_adı().equals(kullanici_adi)&&hesap.getŞifre().equals(parola)){
            return true;
        }
        else {
            return false;
        }
    }
}