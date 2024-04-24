import java.util.Scanner;

public class UserBilgileri {
    private String ad;
    private String kullanıcı_adı;
    private String soyad;
    private String e_mail;
    private String şifre;
    private long iban;
    private String telefon_numarası;

    // Mevcut yapıcı (constructor)
    public UserBilgileri(String ad, String soyad, String şifre, String kullanıcı_adı, long iban, String telefon_numarası){
        this.ad=ad;
        this.soyad=soyad;
        this.şifre=şifre;
        this.kullanıcı_adı=kullanıcı_adı;
        this.iban=iban;
        this.telefon_numarası=telefon_numarası;
    }



    public UserBilgileri() {
        this("yağızhan", "aydın", "trible2002", "myplease", 58785694, "05541464035");
    }


    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public String getŞifre() {
        return şifre;
    }

    public void setŞifre(String şifre) {
        this.şifre = şifre;
    }

    public long getIban() {
        return iban;
    }

    public void setIban(long iban) {
        this.iban = iban;
    }

    public String getTelefon_numarası() {
        return telefon_numarası;
    }

    public void setTelefon_numarası(String telefon_numarası) {
        this.telefon_numarası = telefon_numarası;
    }

    public String getKullanıcı_adı() {
        return kullanıcı_adı;
    }

    public void setKullanıcı_adı(String kullanıcı_adı) {
        this.kullanıcı_adı = kullanıcı_adı;
    }
    public void hesapBilgileriniGoruntule() {
        this.telefon_numarası="5357767052";
        this.iban=604692697;
        this.kullanıcı_adı="myplease";
        this.e_mail="yagizhanaydin35@gmail.com";
        System.out.println("telefon numarası: " +telefon_numarası );
        System.out.println( "iban numaranız"+iban );
        System.out.println("kullanıcı adı: " +kullanıcı_adı );
        System.out.println("e-mali adresiniz"+e_mail);
    }

}
