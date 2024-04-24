import java.util.Scanner;

public class Atm {
    public void calış(Hesap hesap){
        Giris giriş=new Giris();
        Scanner scanner=new Scanner(System.in);
        System.out.println("bankamıza hoşgeldiniz");
        System.out.println("*******************************");
        System.out.println("Kullanıcı girişi");
        int giriş_hakkı=3;

        while(giriş_hakkı > 0){
            if (giriş.giris(hesap)){
                System.out.println("Giriş başarılı");
                break;
            }
            else {
                System.out.println("giriş başarısız");
                giriş_hakkı-=1;
                System.out.println("kalan giriş hakkı:"+giriş_hakkı);
            }
        }
        if (giriş_hakkı == 0){
            System.out.println("Giriş hakkınız bitmiştir");
            System.exit(0); // Programı sonlandırıyoruz
        }
    }
}
