import java.util.Scanner;

public class İslem {
    private String isim;
    private int değer;
    private int miktar;
    public İslem(String isim){
        this.isim=isim;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Almak  istediğiniz Dövizin miktarını giriniz");
        System.out.println();
    }
}
