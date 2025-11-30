import java.util.Scanner;

public class BirimDonusturucu {

    // Sabit değerler
    static final double CM_PER_INCH = 2.54;
    static final int INCH_PER_FOOT = 12;
    static final double LBS_PER_KG = 2.20462;
    static final double MILES_PER_KM = 0.62137;


    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        System.out.println("Yapmak istediginiz donusumu secin: ");
        System.out.println("1: fit ve inc -> santimetre ");
        System.out.println("2: santimetre -> fit ve inc ");
        System.out.println("3: kilogram -> libre ");
        System.out.println("4: libre -> kilogram ");
        System.out.println("5: Fahrenheit -> Santigrat ");
        System.out.println("6: Santigrat -> Fahrenheit ");
        System.out.println("7: Kilometre -> Mil(US) ");
        System.out.println("8: Mil(US) -> Kilometre ");
        System.out.print("Seçiminiz (1, 2, 3, 4, 5, 6, 7, 8): ");

        int secim = in.nextInt(); // Kullanıcının seçimini oku

        if (secim == 1) {
            inc_feet_cm_cevir(in);

        }
        else if (secim == 2) {
            cm_inc_feet_cevir(in);

        }
        else if (secim == 3) {
            kg_lbs_cevir(in);

        }
        else if (secim == 4) {
            lbs_kg_cevir(in);

        }
        else if (secim == 5) {
            fahrenheit_santigrat_cevir(in);

        }
        else if (secim == 6) {
            santigrat_fahrenheit_cevir(in);

        }
        else if (secim == 7) {
            km_mil_cevir(in);

        }
        else if (secim == 8) {
            mil_km_cevir(in);

        }
        else {
            // HATALI SEÇİM
            System.out.println("Geçersiz seçim. Program sonlandırıldı.");
        }
        // --- KAPANIŞ ---
        // Her şey bittikten sonra Scanner'ı kapat


        in.close();

    }
    public static void inc_feet_cm_cevir(Scanner in) {
        // fit/inç -> cm
        System.out.print("Feet degerini girin:  ");
        int feet = in.nextInt();

        System.out.print("Inc degerini girin:  ");
        int inches = in.nextInt();

        double cm = (feet * INCH_PER_FOOT + inches) * CM_PER_INCH;
        System.out.println("Sonuc: " + cm + "cm");

    }
    public static void cm_inc_feet_cevir(Scanner in) {
        // cm -> fit/inç
        System.out.print("Santimetre (cm) degerini girin: ");
        double cm = in.nextDouble();

        double totalInches = cm / CM_PER_INCH;
        int FEET = (int) (totalInches / INCH_PER_FOOT);

        double inch = totalInches % INCH_PER_FOOT;
        System.out.println("Sonuc: " + FEET + "feet" + inch + "inc");

    }
    public static void kg_lbs_cevir(Scanner in) {
        System.out.print("Kilogram (kg) degerini girin: ");
        double kg = in.nextDouble();

        double lbs = kg * LBS_PER_KG;
        System.out.println("Sonuc: " + lbs + "lbs");

    }
    public static void lbs_kg_cevir(Scanner in) {
        System.out.print("Libre (lbs) degerini girin: ");
        double lbs = in.nextDouble();

        double kg = lbs / LBS_PER_KG;
        System.out.println("Sonuc: " + kg + "kg");

    }
    public static void fahrenheit_santigrat_cevir(Scanner in) {
        System.out.print("Fahrenheit (°F) degerini girin: ");
        double fahrenheit = in.nextDouble();

        double celsius = (fahrenheit - 32) * 5.0 / 9.0;
        System.out.println("Sonuc: " + celsius + "°C");

    }
    public static void santigrat_fahrenheit_cevir(Scanner in) {
        System.out.print("Santigrat (°C) degerini girin: ");
        double celsius = in.nextDouble();

        double fahrenheit = (celsius * 9.0 / 5.0) + 32;
        System.out.println("Sonuc: " + fahrenheit + "°F");

    }
    public static void km_mil_cevir(Scanner in) {
        System.out.print("Kilometre (km) degerini girin: ");
        double km = in.nextDouble();

        double miles = km * MILES_PER_KM;
        System.out.println("Sonuc: " + miles + "miles");

    }
    public static void mil_km_cevir(Scanner in) {
        System.out.print("Mil degerini girin: ");
        double miles = in.nextDouble();

        double km = miles / MILES_PER_KM;
        System.out.println("Sonuc: " + km + "Km");

    }


}
