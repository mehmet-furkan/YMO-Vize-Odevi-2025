import java.util.Scanner;

public class VkiHesaplama {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("------ SAĞLIK ASİSTANI ------");

        // 1. Veri Alma
        System.out.print("Kilonuzu girin (kg): ");
        double kilo = scan.nextDouble();

        System.out.print("Boyunuzu girin (metre cinsinden, örn: 1.75): ");
        double boy = scan.nextDouble();

        // 2. Hesaplama Metodunu Çağırma
        double vki = vkiHesapla(kilo, boy);

        System.out.println("-----------------------------");
        System.out.printf("Vücut Kitle İndeksiniz: %.2f\n", vki);

        // 3. Durum Analizi Metodunu Çağırma
        String durum = vkiDurumuGetir(vki);
        System.out.println("Durumunuz: " + durum);

        // 4. Tavsiye Verme
        tavsiyeVer(durum);
    }

    // Metot 1: Hesaplama
    public static double vkiHesapla(double kilo, double boy) {
        return kilo / (boy * boy);
    }

    // Metot 2: Kategorize Etme (If-Else Merdiveni)
    public static String vkiDurumuGetir(double vki) {
        if (vki < 18.5) {
            return "ZAYIF";
        } else if (vki >= 18.5 && vki < 25) {
            return "NORMAL";
        } else if (vki >= 25 && vki < 30) {
            return "FAZLA KİLOLU";
        } else {
            return "OBEZ";
        }
    }

    // Metot 3: Switch-Case ile Tavsiye (Veya If-Else)
    public static void tavsiyeVer(String durum) {
        System.out.print("ÖNERİ: ");
        // String karşılaştırmalarında .equals() kullanılır ama switch-case string destekler.
        switch (durum) {
            case "ZAYIF":
                System.out.println("Karbonhidrat ve protein ağırlıklı beslenmelisiniz.");
                break;
            case "NORMAL":
                System.out.println("Formunuzu korumak için düzenli yürüyüş yapın.");
                break;
            case "FAZLA KİLOLU":
                System.out.println("Şeker ve hamur işini azaltıp egzersize başlamalısınız.");
                break;
            case "OBEZ":
                System.out.println("Bir diyetisyen eşliğinde profesyonel destek almanız önerilir.");
                break;
        }
    }
}