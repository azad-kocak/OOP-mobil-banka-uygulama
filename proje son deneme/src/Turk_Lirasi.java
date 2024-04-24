import java.util.Scanner;

public class Turk_Lirasi {
    private String isim;

    private int  miktar;
    public Turk_Lirasi(String isim){
        this.isim=isim;
        Scanner scanner=new Scanner(System.in);
        System.out.println("bozdurulcak miktarı giriniz");
        System.out.println("miktar"+miktar);
        this.miktar=scanner.nextInt();

    }
    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getMiktar() {
        return miktar;
    }

    public void setMiktar(int miktar) {
        this.miktar = miktar;
    }
}
