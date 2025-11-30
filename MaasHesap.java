import java.util.Scanner;

public class MaasHesap {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // sabitler
        final double SGK_ORANI = 0.14;
        final double GELIR_VERGISI_ORANI = 0.15;
        final double DAMGA_VERGISI_ORANI = 0.00759;

        System.out.println("Adinizi ve Soyadinizi girin: ");
        String ad_soyad = input.nextLine();

        System.out.println("Aylik brüt maasinizi girin: ");
        double brut_maas = input.nextDouble();

        System.out.println("Haftalik calısma saati: ");
        int calisma_saat = input.nextInt();

        System.out.println("Mesai saati sayisi: ");
        int mesai_saat = input.nextInt();

        double mesai_ucreti = brut_maas/160 * mesai_saat * 1.5;


        double toplam_gelir = brut_maas + mesai_ucreti;

        double sgk = toplam_gelir * SGK_ORANI;
        double gelir_vergisi = toplam_gelir * GELIR_VERGISI_ORANI;
        double damga_vergisi = toplam_gelir * DAMGA_VERGISI_ORANI;
        double toplam_kesinti = sgk +  gelir_vergisi + damga_vergisi;

        double net_maas = toplam_gelir - toplam_kesinti;

        double kesinti_orani = toplam_kesinti/toplam_gelir * 100;
        double saatlik_net_kazanc = net_maas/176;
        //22gün * 8saat = 176 saat/ay

        double gunluk_net_maas = net_maas/22;



        System.out.println("==============================================");
        System.out.println("                MAAS BORDROSU                 ");
        System.out.println("==============================================");
        System.out.printf("Calısan: %s\n", ad_soyad); //Çalışan adını yazdır.
        System.out.println("\nGELİRLER:");

        //Formatlı gelir satırı.
        System.out.printf("%-25s    : %.2f TL\n", "Brut Maas", brut_maas);
        System.out.printf("%-25s    : %.2f TL\n", "Mesai Ucreti (" + mesai_saat + " saat)", mesai_ucreti);
        System.out.println("-----------------------------------------------");
        System.out.printf("%-25s    : %.2f TL\n", "TOPLAM GELİR", toplam_gelir);

        System.out.println("\nKESİNTİLER:");
        System.out.printf("%-20s (%.1f%%) : %.2f TL\n", "SGK Kesintisi", SGK_ORANI * 100, sgk);
        System.out.printf("%-20s (%.1f%%) : %.2f TL\n", "Gelir Vergisi", GELIR_VERGISI_ORANI * 100, gelir_vergisi);
        System.out.printf("%-20s (%.1f%%)  : %.2f TL\n", "Damga Vergisi", DAMGA_VERGISI_ORANI * 100, damga_vergisi);
        System.out.println("-----------------------------------------------");



        System.out.printf("%-25s    : %.2f TL\n", "TOPLAM KESINTI: ", toplam_kesinti);
        System.out.printf("%-25s    : %.2f TL\n", "NET MAAS: ", net_maas);
        System.out.println("===============================================");

        input.close();


    }
}

