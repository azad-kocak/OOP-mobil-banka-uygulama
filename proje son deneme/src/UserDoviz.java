import java.util.Scanner;

public class UserDoviz {
    private static double dolarKuru = 25.0;
    private static double euroKuru = 30.0;
    private static double poundKuru = 35.0;
    private static double Türk_Lirasi = 1;
    private  static  double JPY=0.2;

    public static class Alma {
        public static void islem(int miktar){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Alınacak dövizi seçiniz: 1-Dolar, 2-Euro, 3-Pound, 4-JPY-");
            int secim = scanner.nextInt();


            switch (secim) {
                case 1:
                    System.out.println(miktar + " Dolar alındı. Karşılığı " + (miktar * dolarKuru) + " Türk Lirasıdır.");
                    break;
                case 2:
                    System.out.println(miktar + " Euro alındı. Karşılığı " + (miktar * euroKuru) + " Türk Lirasıdır.");
                    break;
                case 3:
                    System.out.println(miktar + " Pound alındı. Karşılığı " + (miktar * poundKuru) + " Türk Lirasıdır.");
                    break;
                case 4:
                    System.out.println(miktar +"Yen alındı.Krşılığı"+(miktar*JPY)+"Turk lırası");
                    break;
                default:
                    System.out.println("Geçersiz seçim. Lütfen 1, 2,3 ve 4 seçiniz.");
            }
        }
    }

    public static class Satma {
        public static void islem(int miktar){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Satılacak dövizi seçiniz: 1-Dolar, 2-Euro, 3-Pound");
            int secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    System.out.println(miktar + " Dolar satıldı. Karşılığı " + (miktar * dolarKuru) + " Türk Lirasıdır.");
                    break;
                case 2:
                    System.out.println(miktar + " Euro satıldı. Karşılığı " + (miktar * euroKuru) + " Türk Lirasıdır.");
                    break;
                case 3:
                    System.out.println(miktar + " Pound satıldı. Karşılığı " + (miktar * poundKuru) + " Türk Lirasıdır.");
                    break;
                default:
                    System.out.println("Geçersiz seçim. Lütfen 1, 2 veya 3'ü seçin.");
            }
        }
    }
}
