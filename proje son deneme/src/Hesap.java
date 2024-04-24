public class Hesap {

    private String kullanıcı_adı;
    private String şifre;



    public Hesap(String kullanıcı_adı,String şifre,int bakiye) {
        this.kullanıcı_adı=kullanıcı_adı;
        this.şifre=şifre;

    }

    public String getKullanıcı_adı() {
        return kullanıcı_adı;
    }

    public void setKullanıcı_adı(String kullanıcı_adı) {
        this.kullanıcı_adı = kullanıcı_adı;
    }

    public String getŞifre() {
        return şifre;
    }

    public void setŞifre(String şifre) {
        this.şifre = şifre;
    }



}
